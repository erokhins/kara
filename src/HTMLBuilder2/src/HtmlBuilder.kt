package kotlin.html

import java.util.*
import jet.deprecated


abstract class HtmlElement(val containingElement: HtmlElement?, val contentStyle: ContentStyle = ContentStyle.block) {
    {
        appendTo(containingElement)
    }

    private fun appendTo(element: HtmlElement?) = element?.children?.add(this)

    val children: MutableList<HtmlElement> = ArrayList<HtmlElement>()

    abstract fun renderElement(builder: StringBuilder, indent: String)

    open fun toString(): String {
        val builder = StringBuilder()
        renderElement(builder, "")
        return builder.toString()
    }
}

enum class RenderStyle {
    adaptive
    expanded
    empty
}

enum class ContentStyle {
    block
    text
    propagate
}

private fun HtmlElement.computeContentStyle(): ContentStyle {
    return when (contentStyle) {
        ContentStyle.block, ContentStyle.text -> contentStyle
        ContentStyle.propagate -> if (children.all { it.computeContentStyle() == ContentStyle.text }) ContentStyle.text else ContentStyle.block
    }
}

private fun String.htmlEscape(): String {
    return replaceAll("<", "&lt;").replaceAll(">", "&gt;").replaceAll("\"", "&quot;")
}

abstract class HtmlTag(containingTag: HtmlTag?, val tagName: String, val renderStyle: RenderStyle = RenderStyle.expanded, contentStyle: ContentStyle = ContentStyle.block) : HtmlElement(containingTag, contentStyle) {
    private val attributes = HashMap<String, String>()

    public fun build<T : HtmlTag>(tag: T, contents: T.() -> Unit): T {
        tag.contents()
        return tag
    }

    override fun renderElement(builder: StringBuilder, indent: String) {
        val count = children.size()
        builder.append(indent)
        when {
            count == 0 && renderStyle != RenderStyle.expanded -> {
                builder.append("<$tagName${renderAttributes()}/>")
            }
            count != 0 && renderStyle == RenderStyle.empty -> {
                throw InvalidHtmlException("Empty tag has children")
            }
            children.all { it.computeContentStyle() == ContentStyle.text } -> {
                builder.append("<$tagName${renderAttributes()}>")
                for (c in children) {
                    c.renderElement(builder, "")
                }
                builder.append("</$tagName>")
            }
            count == 0 -> {
                builder.append("<$tagName${renderAttributes()}></$tagName>")
            }
            else -> {
                builder.append("<$tagName${renderAttributes()}>\n")
                for (c in children) {
                    c.renderElement(builder, indent + "  ")
                }
                builder.append("$indent</$tagName>")
            }
        }
        if (indent != "")
            builder.append("\n")
    }

    protected fun renderAttributes(): String? {
        val builder = StringBuilder()
        for (a in attributes.keySet()) {
            val attr = attributes[a]!!
            if (attr.length > 0) {
                builder.append(" $a=\"${attr.htmlEscape()}\"")
            }
        }
        return builder.toString()
    }

    public fun attribute(name: String, value: String) {
        attributes[name] = value
    }

    public fun get(attributeName: String): String {
        val answer = attributes[attributeName]
        if (answer == null) throw RuntimeException("Atrribute $attributeName is missing")
        return answer
    }

    public fun set(attName: String, attValue: String) {
        attributes[attName] = attValue
    }

 }

open class TagType(val tag: Tag<*>): CommonAttributeGroup, AttributesMap {
    public override fun get(attName: String): String {
        return tag[attName]
    }
    public override fun set(attName: String, attValue: String) {
        tag[attName] = attValue
    }

}

open class Tag<out T>(val containingTag: Tag<*>?, val t: (Tag<*>) -> T, tagName: String) : HtmlTag(containingTag, tagName)  {
    deprecated("") public open fun String.plus(): HtmlText {
        throw UnsupportedOperationException()
    }
    deprecated("") public open var text: String?
        get() {
            throw UnsupportedOperationException()
        }
        set(value) {
            throw UnsupportedOperationException()
        }

    fun <T : TagType> Tag<*>.contentTag(tag: (Tag<*>) -> T, tagName: String, c: StyleClass? = null, id: String? = null, contents: Tag<T>.() -> Unit = empty_contents) {
        val newTag = Tag<T>(this, tag, tagName)
        newTag.contents()
        if (c != null) newTag.attr.c = c
        if (id != null) newTag.attr.id = id
    }
}

val <T : TagType> Tag<T>.attr: T
    get() = t(this)
fun <T : TagType> Tag<T>.attr(f: T.() -> Unit) {
    attr.f()
}
var <T : TagType> Tag<T>.id: String
    get() = attr.id
    set(value) {
        attr.id = value
    }
var <T : TagType> Tag<T>.c: StyleClass
    get() = attr.c
    set(value) {
        attr.c = value
    }

public var <T : TagType> Tag<T>.style: String
    get() = attr.style
    set(value) {
        attr.style = value
    }

fun <T : TagType> Tag<T>.style(init: StyledElement.()->Unit) {
    val element = StyledElement("inline")
    element.init()
    val builder = StringBuilder()
    for ((k, v) in element.attributes) {
        builder.append("$k:$v;")
    }
    this.attr.style = builder.toString()
}



fun <T : TagType> Tag<*>.contentTag(tag: (Tag<*>) -> T, tagName: String, c: StyleClass? = null, id: String? = null, contents: TagWithText<T>.() -> Unit = empty_contents) {
    val newTag = TagWithText<T>(this, tag, tagName)
    newTag.contents()
    if (c != null) newTag.attr.c = c
    if (id != null) newTag.attr.id = id
}


class TagWithText<out T>(containingTag: Tag<*>?, t: (Tag<*>) -> T, tagName: String) : Tag<T>(containingTag, t, tagName) {
    /**
     * Override the plus operator to add a text element.
     */
    public override fun String.plus(): HtmlText = HtmlText(this@TagWithText, this)

    /**
     * Yet another way to set the text content of the node.
     */
    public override var text: String?
        get() {
            if (children.size > 0)
                return children[0].toString()
            return ""
        }
        set(value) {
            children.clear()
            if (value != null)
                HtmlText(this@TagWithText, value)
        }

}


class HtmlText(containingTag: HtmlTag?, private val text: String) : HtmlElement(containingTag, ContentStyle.text) {
    override fun renderElement(builder: StringBuilder, indent: String) {
        builder.append(indent)
        builder.append(escapedText())
        if (indent != "")
            builder.append("\n")
    }

    public fun escapedText(): String = text.htmlEscape()
}

class InvalidHtmlException(val message: String) : RuntimeException(message)


val <T> empty_contents: T.() -> Unit = { }


fun deprecated() {
    throw UnsupportedOperationException()
}
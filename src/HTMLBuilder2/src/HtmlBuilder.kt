package kotlin.html5

import java.util.*

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

    /**
     * Override the plus operator to add a text element.
     */
    protected fun String.plus(): HtmlText = HtmlText(this@HtmlTag, this)

    /**
     * Yet another way to set the text content of the node.
     */
    protected var text: String?
        get() {
            if (children.size > 0)
                return children[0].toString()
            return ""
        }
        set(value) {
            children.clear()
            if (value != null)
                HtmlText(this@HtmlTag, value)
        }
}

trait AllowText {
    public fun String.plus(): HtmlText
    public var text: String?
}

trait AttributesMap {
    public fun get(attName: String): String
    public fun set(attName: String, attValue: String)
}

public abstract class AbstractAttributes(val htmlTag: HtmlTag): AttributesMap {
    public override fun get(attName: String): String {
        return htmlTag[attName]
    }
    public override fun set(attName: String, attValue: String) {
        htmlTag[attName] = attValue
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

public class BaseAttributes<out T: HtmlTag>(htmlTag: T): AbstractAttributes(htmlTag), CommonAttributeGroup {
    public fun invoke(f: BaseAttributes<T>.() -> Unit) {
        this.f()
    }
}

public class BaseEvents<out T: HtmlTag>(htmlTag: T): AbstractAttributes(htmlTag), CommonEventsGroup {
    public fun invoke(f: BaseEvents<T>.() -> Unit) {
        this.f()
    }
}

open class HtmlBodyTag(containingTag: HtmlBodyTag?, tagName: String, renderStyle: RenderStyle = RenderStyle.expanded, contentStyle: ContentStyle = ContentStyle.block):
    HtmlTag(containingTag, tagName, renderStyle, contentStyle) {
    public open val attr: BaseAttributes<HtmlBodyTag> = BaseAttributes<HtmlBodyTag>(this)
    public open val events: BaseEvents<HtmlBodyTag> = BaseEvents<HtmlBodyTag>(this)
}

val <T> empty_contents: T.() -> Unit = { }

fun <T : HtmlBodyTag> HtmlBodyTag.contentTag(tag: T, c: StyleClass? = null, id: String? = null, contents: T.() -> Unit = empty_contents) {
    //TODO:
    //    if (id != null) tag.id = id
    //    if (c != null) tag.c = c
    build(tag, contents)
}
/**
 * Created by erokhins on 7/25/13.
 */

package kotlin.html

public class DefaultHtmlBuilder : HtmlBuilder {
    override fun <T : TagType> contentTag(containingTag: Tag<Any?>, tagType: () -> T, contents: Tag<T>.() -> Unit) {
        val newTag = Tag<T>(tagType, builder = containingTag.builder)
        newTag.contents()
        containingTag.children.add(newTag)
    }

    class HtmlText(val textInNode: String, builder : HtmlBuilder) : AbstractTag(builder) {
        protected override fun assertAllowText() {
            throw IllegalStateException("Impossible call text functions")
        }

        override fun renderElement(strBuilder: StringBuilder, indent: String) {
            strBuilder.append(indent)
            strBuilder.append(escapedText())
            if (indent != "")
                strBuilder.append("\n")
        }

        public fun escapedText(): String = textInNode.htmlEscape()
    }

    override fun AbstractTag.appendText(text: String) {
        val textNode = HtmlText(text, builder)
        children.add(textNode)
    }
    override fun getText(tag: AbstractTag): String? {
        if (tag.children.size == 1) {
            val node = tag.children.first!!
            if (node is HtmlText) {
                return node.textInNode
            }
        }
        return null
    }
    override fun setText(tag: AbstractTag, value: String?) {
        tag.children.clear()
        if (value != null)
            tag.appendText(value)
    }

    private fun String.htmlEscape(): String {
        return replaceAll("<", "&lt;").replaceAll(">", "&gt;").replaceAll("\"", "&quot;")
    }

    private fun AbstractTag.computeContentStyle(): ContentStyle {
        return when (metada.contentStyle) {
            ContentStyle.block, ContentStyle.text -> metada.contentStyle
            ContentStyle.propagate -> if (children.all { it.computeContentStyle() == ContentStyle.text }) ContentStyle.text else ContentStyle.block
        }
    }

    private fun AbstractTag.renderAttributes(): String? {
        val builder = StringBuilder()
        for (a in attributes.keySet()) {
            val attr = attributes[a]!!
            if (attr.length > 0) {
                builder.append(" $a=\"${attr.htmlEscape()}\"")
            }
        }
        return builder.toString()
    }

    override fun renderElement(tag: AbstractTag, strBuilder: StringBuilder, indent: String) {
        with(tag) {
            val count = children.size()
            strBuilder.append(indent)
            val tagName = metada.tagName
            when {
                count == 0 && metada.renderStyle != RenderStyle.expanded -> {
                    strBuilder.append("<$tagName${renderAttributes()}/>")
                }
                count != 0 && metada.renderStyle == RenderStyle.empty -> {
                    throw InvalidHtmlException("Empty tag has children")
                }
                children.all { it.computeContentStyle() == ContentStyle.text } -> {
                    strBuilder.append("<$tagName${renderAttributes()}>")
                    for (c in children) {
                        c.renderElement(strBuilder, "")
                    }
                    strBuilder.append("</$tagName>")
                }
                count == 0 -> {
                    strBuilder.append("<$tagName${renderAttributes()}></$tagName>")
                }
                else -> {
                    strBuilder.append("<$tagName${renderAttributes()}>\n")
                    for (c in children) {
                        c.renderElement(strBuilder, indent + "  ")
                    }
                    strBuilder.append("$indent</$tagName>")
                }
            }
            if (indent != "")
                strBuilder.append("\n")

        }
    }
}
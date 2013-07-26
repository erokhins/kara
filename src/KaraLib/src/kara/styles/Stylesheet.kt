package kara

import kotlin.html.*
import java.io.OutputStreamWriter
import java.io.FileOutputStream
import com.sun.tools.doclets.formats.html.markup.HtmlTag

/** A class for programmatically generating CSS stylesheets.
 */
abstract class Stylesheet(var namespace : String = "") : Resource("text/css", "css") {
    /** Subclasses should override this to actual perform the stylesheet building.
    */
    abstract fun CssElement.render()

    var cache: Pair<ByteArray, Long>? = null

    fun toString() : String {
        val element = CssElement()
        element.render()
        val builder = StringBuilder()
        for (child in element.children) {
            child.build(builder, "")
        }
        return builder.toString()
    }

    override fun content(): ResourceContent {
        val (bytes, stamp) = cache ?: run {
            cache = Pair(toString().toByteArray("UTF-8"), System.currentTimeMillis())
            cache!!
        }
        return ResourceContent(stamp, bytes.size, {bytes.inputStream})
    }
}

fun Tag<HEAD>.style(media: String = "all", mimeType: String = "text/css", buildSheet: CssElement.() -> Unit) {
    val stylesheet = object : Stylesheet("") {
        override fun CssElement.render() {
            buildSheet()
        }
    }
    builder.contentTag(this) {
        val tag = STYLE(this@style.builder, stylesheet)
        with(tag) {
            metada.media = media
            metada.mimeType = mimeType
        }
        tag
    }
}

fun Tag<HEAD>.stylesheet(stylesheet: Stylesheet)  = contentTag(::STYLESHEETLINK, "link", renderStyle = RenderStyle.empty, contents = {
    attr{
        href = stylesheet
        rel = LinkType.stylesheet
        mimeType = "text/css"
    }
})

class STYLE(builder: HtmlBuilder, val stylesheet : Stylesheet) : AbstractTag(builder) {
    public var TagMetadata.media : String by StringAttribute("media")
    public var TagMetadata.mimeType : String by Attributes.mimeType

    {
        metada.tagName = "style"
        metada.media = "all"
        metada.mimeType = "text/css"
    }

    override fun renderElement(strBuilder: StringBuilder, indent: String) {
        strBuilder.append("$indent<${metada.tagName}${builder.renderAttributes(this)}>\n")
        strBuilder.append(stylesheet.toString())
        strBuilder.append("$indent</${metada.tagName}>\n")
    }
}

class STYLESHEETLINK : TagType()
    public var STYLESHEETLINK.href : Link by Attributes.href
    public var STYLESHEETLINK.rel : LinkType by Attributes.rel
    public var STYLESHEETLINK.mimeType : String by Attributes.mimeType


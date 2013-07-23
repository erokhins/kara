package kotlin.html


val Attributes.mimeType = MimeAttribute("type")

open class HtmlHeadTagWithText(containingTag: HtmlTag?, tagName: String, renderStyle: RenderStyle = RenderStyle.expanded,
                      contentStyle: ContentStyle = ContentStyle.block) : HtmlTag(containingTag, tagName, renderStyle, contentStyle) {
    /**
     * Override the plus operator to add a text element.
     */
    public fun String.plus(): HtmlText = HtmlText(this@HtmlHeadTagWithText, this)

    /**
     * Yet another way to set the text content of the node.
     */
    public var text: String?
        get() {
            if (children.size > 0)
                return children[0].toString()
            return ""
        }
        set(value) {
            children.clear()
            if (value != null)
                HtmlText(this@HtmlHeadTagWithText, value)
        }
}

fun HTML.head(init: HEAD.() -> Unit) = build(HEAD(this), init)
fun HEAD.title(init: TITLE.() -> Unit = { }) = build(TITLE(this), init)

fun HEAD.title(text: String) {
    build(TITLE(this), { +text })
}

fun HEAD.link(href: Link, rel: LinkType = LinkType.stylesheet, mimeType: String = "text/javascript", content: _LINK.() -> Unit = { }) {
    val tag = build(_LINK(this), content)
    tag.href = href
    tag.rel = rel
    tag.mimeType = mimeType
}

fun HEAD.meta(name: String, content: String) {
    val tag = build(META(this), { })
    tag.name = name
    tag.content = content
}

fun HEAD.base(href: String, target: String) {
    val tag = build(BASE(this), { })
    tag.href = href
    tag.target = target
}

fun HtmlTag.script(src: Link, mimeType: String = "text/javascript") {
    val tag = build(SCRIPTSRC(this), { })
    tag.src = src
    tag.mimeType = mimeType
}

fun HtmlTag.script(mimeType: String = "text/javascript", content: SCRIPTBLOCK.() -> Unit) {
    val tag = build(SCRIPTBLOCK(this), content)
    tag.mimeType = mimeType
}

class HEAD(containingTag: HTML) : HtmlHeadTagWithText(containingTag, "head") {
}

class META(containingTag: HEAD) : HtmlTag(containingTag, "meta") {
    public var name: String by Attributes.stringName
    public var content: String by StringAttribute("content")
}

class BASE(containingTag: HEAD) : HtmlTag(containingTag, "base") {
    public var href: String by StringAttribute("href")
    public var target: String by StringAttribute("target")
}

class _LINK(containingTag: HEAD) : HtmlTag(containingTag, "link", RenderStyle.empty) {
    public var href: Link by Attributes.href
    public var rel: LinkType by Attributes.rel
    public var mimeType: String by Attributes.mimeType
    {
        rel = LinkType.stylesheet
        mimeType = "text/css"
    }
}

class SCRIPTSRC(containingTag: HtmlTag) : HtmlTag(containingTag, "script") {
    public var src: Link by Attributes.src
    public var mimeType: String by Attributes.mimeType
    {
        mimeType = "text/javascript"
    }
}

class SCRIPTBLOCK(containingTag: HtmlTag) : HtmlHeadTagWithText(containingTag, "script") {
    public var mimeType: String by Attributes.mimeType
    {
        mimeType = "text/javascript"
    }
}

class TITLE(containingTag: HEAD) : HtmlHeadTagWithText(containingTag, "title") {
}


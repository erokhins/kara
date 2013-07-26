package kotlin.html

fun Tag<HEAD>.title(init: Tag<TITLE>.() -> Unit = empty_contents) = contentTag(::TITLE, "title", init)

fun Tag<HEAD>.title(text: String) = contentTag(::TITLE, "title", { +text})

fun Tag<HEAD>.link(href: Link, rel: LinkType = LinkType.stylesheet, mimeType: String = "text/javascript") {
    contentTag(::_LINK, "link") {
        attr.href = href
        attr.rel = rel
        attr.mimeType = mimeType
    }
}

fun Tag<HEAD>.meta(name: String, content: String) {
    contentTag(::META, "meta") {
        attr.name = name
        attr.content = content
    }
}

fun Tag<HEAD>.base(href: String, target: String) {
    contentTag(::BASE, "base") {
        attr.href = href
        attr.target = target
    }
}

fun Tag<HEAD>.script(src: Link, mimeType: String = "text/javascript") {
    contentTag(::SCRIPTSRC, "script") {
        attr.src = src
        attr.mimeType = mimeType
    }
}

fun Tag<HEAD>.script(mimeType: String = "text/javascript", contents: Tag<SCRIPTBLOCK>.() -> Unit) {
    contentTag(::SCRIPTBLOCK, "script") {
        attr.mimeType = mimeType
        contents()
    }
}

class HEAD : TagType(), TagWithoutText

class META : TagType()
    public var META.name: String by Attributes.stringName
    public var META.content: String by StringAttribute("content")

class BASE : TagType()
    public var BASE.href: String by StringAttribute("href")
    public var BASE.target: String by StringAttribute("target")

class _LINK : TagType()
    public var _LINK.href: Link by Attributes.href
    public var _LINK.rel: LinkType by Attributes.rel
    public var _LINK.mimeType: String by Attributes.mimeType

class SCRIPTSRC : TagType()
    public var SCRIPTSRC.src: Link by Attributes.src
    public var SCRIPTSRC.mimeType: String by Attributes.mimeType

class SCRIPTBLOCK : TagType()
    public var SCRIPTBLOCK.mimeType: String by Attributes.mimeType

class TITLE : TagType()


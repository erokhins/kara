package kotlin.html

open class HTML(builder: HtmlBuilder) : AbstractTag(builder) {
    protected override fun assertAllowText() {
        throw InvalidHtmlException("Text not allow in html")
    }

    public var doctype: String = "<!DOCTYPE html>"

    override fun renderElement(strBuilder: StringBuilder, indent: String) {
        strBuilder.append("$doctype\n")
        super<AbstractTag>.renderElement(strBuilder, indent)
    }
}

//fun HTML.body(init: BODY.() -> Unit) = build(BODY(this), init)
//class BODY(containingTag: HTML) : HtmlBodyTagWithText(containingTag, "body")


class BODY: TagType(), CommonAllow
// TODO: events

fun HTML.body(contents: Tag<BODY>.() -> Unit) = contentTag(::BODY, "body", contents)
fun HTML.head(contents: Tag<HEAD>.() -> Unit) = contentTag(::HEAD, "head", contents)
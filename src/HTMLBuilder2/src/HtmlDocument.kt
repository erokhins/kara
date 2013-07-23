package kotlin.html

open class HTML() : HtmlTag(null, "html") {

    public var doctype: String = "<!DOCTYPE html>"

    override fun renderElement(builder: StringBuilder, indent: String) {
        builder.append("$doctype\n")
        super<HtmlTag>.renderElement(builder, indent)
    }
}

//fun HTML.body(init: BODY.() -> Unit) = build(BODY(this), init)
//class BODY(containingTag: HTML) : HtmlBodyTagWithText(containingTag, "body")


fun HTML.body(contents: HtmlBodyTag.() -> Unit) {
    val newTag = HtmlBodyTag(this, "body")
    newTag.contents()
}

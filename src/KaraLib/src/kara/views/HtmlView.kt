package kara

import kotlin.html.*
import kara.internal.*

/** Base class for html views.
 */
abstract class HtmlView(val layout : HtmlLayout? = null) : ActionResult {
    override fun writeResponse(context : ActionContext) : Unit {
        context.response.setContentType("text/html")

        val writer = context.response.getWriter()!!
        if (layout == null) {
            writer.write(this.toString(context))
        }
        else {
            val page = HTML(DefaultHtmlBuilder())
            with(layout!!) {
                page.render(context, this@HtmlView)
            }
            val strBuilder = StringBuilder()
            page.renderElement(strBuilder, "")
            writer.write(strBuilder.toString())
        }
        writer.flush()
    }

    class VIEW : TagType(), CommonBodyContent

    fun toString(context: ActionContext): String {
        val root = Tag<VIEW>(::VIEW, "view")
        root.render(context)

        val strBuilder = StringBuilder()
        for (child in root.children) {
            child.renderElement(strBuilder, "")
        }
        return strBuilder.toString()
    }


    /** Subclasses must implement this to provide the primary html to dispay.
    */
    abstract fun Tag<CommonBodyContent>.render(context : ActionContext)
}

public fun Tag<CommonBodyContent>.renderView(context : ActionContext, view : HtmlView) {
    with(view) {
        render(context)
    }
}

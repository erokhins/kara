package karatests.views

import kara.*
import kotlin.html.*

/** Home html view.
 */
class HomeView() : HtmlView(DefaultLayout()) {
    override fun Tag<CommonAllow>.render(context: ActionContext) {
        h2 {+"Welcome Home"}
        p { +"<h2>MakeSureThisIsEscaped</h2>" }
    }
}

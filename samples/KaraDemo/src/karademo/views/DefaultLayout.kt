package karademo.views

import kara.*
import karademo.styles.DefaultStyles
import kotlin.html.*

class DefaultLayout(): HtmlLayout() {
    override fun HTML.render(context: ActionContext, mainView: HtmlView) {
        head {
            title("Kara Demo Title")
            stylesheet(DefaultStyles)
        }
        body {
            h1 { +"Kara Demo Site" }
            div(id = "main") {
                renderView(context, mainView)
            }
            +"Kara is devloped by: "
            a {
                attr{
                    text = "Tiny Mission"
                    href = "http://tinymission.com".link()
                }
            }
            +" and "
            a {
                attr{
                    text = "JetBrains"
                    href = "http://jetbrains.com".link()
                }
            }
        }
    }
}


package kotlin.html5

object Attributes {
    val pubdate = StringAttribute("Pubdate")
    val shape = EnumAttribute("Shape", javaClass<Shape>())
    val accept = StringAttribute("accept")
    val accept_charset = StringAttribute("accept-charset")
    val accesskey = StringAttribute("accesskey")
    val action = LinkAttribute("action")
    val alt = StringAttribute("alt")
    val autobuffer = TickerAttribute("autobuffer")
    val autocomplete = EnumAttribute("autocomplete", javaClass<Autocomplete>())
    val autofocus = TickerAttribute("autofocus")
    val autoplay = TickerAttribute("autoplay")
    val challenge = StringAttribute("challenge")
    val checked = TickerAttribute("checked")
    val cite = LinkAttribute("cite")
    val c = ClassAttribute("class")
    val classid = StringAttribute("classid")
    val cols = IntAttribute("cols")
    val colspan = PositiveIntAttribute("colspan")
    val contenteditable = BooleanAttribute("contenteditable")
    val contextmenu = StringAttribute("contextmenu")
    val controls = TickerAttribute("controls")
    val coords = StringAttribute("coords")
    val data = LinkAttribute("data")
    val data_FolderName = StringAttribute("data-FolderName")
    val data_MsgId = StringAttribute("data-MsgId")
    val datetime = DateTimeAttribute("datetime")
    val dir = EnumAttribute("dir", javaClass<Dir>())
    val disabled = TickerAttribute("disabled")
    val draggable = EnumAttribute("draggable", javaClass<Draggable>())
    val enctype = EnumAttribute("enctype", javaClass<Enctype>())
    val files = StringAttribute("files")
    val forId = StringAttribute("for")
    val form = StringAttribute("form")
    val formaction = StringAttribute("formaction")
    val formenctype = EnumAttribute("formenctype", javaClass<Formenctype>())
    val formmethod = EnumAttribute("formmethod", javaClass<Formmethod>())
    val formnovalidate = TickerAttribute("formnovalidate")
    val formtarget = StrEnumAttribute("formtarget", javaClass<BrowsingContext>())
    val headers = StringAttribute("headers")
    val height = StringAttribute("height")
    val hidden = TickerAttribute("hidden")
    val high = FloatAttribute("high")
    val href = LinkAttribute("href")
    val hreflang = StrEnumAttribute("hreflang", javaClass<I18LanguageCode>())
    val icon = StringAttribute("icon")
    val id = StringAttribute("id")
    val ismap = TickerAttribute("ismap")
    val item = StringAttribute("item")
    val itemprop = StringAttribute("itemprop")
    val keytype = EnumAttribute("keytype", javaClass<Keytype>())
    val label = StringAttribute("label")
    val lang = StrEnumAttribute("lang", javaClass<I18LanguageCode>())
    val list = StringAttribute("list")
    val loop = TickerAttribute("loop")
    val low = FloatAttribute("low")
    val stringMax = StringAttribute("max")
    val floatMax = FloatAttribute("max")
    val maxlength = StringAttribute("maxlength")
    val media = StringAttribute("media")
    val method = EnumAttribute("method", javaClass<Method>())
    val stringMin = StringAttribute("min")
    val floatMin = FloatAttribute("min")
    val multiple = TickerAttribute("multiple")
    val iframeName = StrEnumAttribute("name", javaClass<BrowsingContext>())
    val stringName = StringAttribute("name")
    val novalidate = TickerAttribute("novalidate")
    val onabort = StringAttribute("onabort")
    val onblur = StringAttribute("onblur")
    val oncanplay = StringAttribute("oncanplay")
    val oncanplaythrough = StringAttribute("oncanplaythrough")
    val onchange = StringAttribute("onchange")
    val onclick = StringAttribute("onclick")
    val oncontextmenu = StringAttribute("oncontextmenu")
    val ondblclick = StringAttribute("ondblclick")
    val ondrag = StringAttribute("ondrag")
    val ondragenter = StringAttribute("ondragenter")
    val ondragleave = StringAttribute("ondragleave")
    val ondragover = StringAttribute("ondragover")
    val ondragstart = StringAttribute("ondragstart")
    val ondrop = StringAttribute("ondrop")
    val ondurationchange = StringAttribute("ondurationchange")
    val onemptied = StringAttribute("onemptied")
    val onended = StringAttribute("onended")
    val onerror = StringAttribute("onerror")
    val onfocus = StringAttribute("onfocus")
    val onformchange = StringAttribute("onformchange")
    val onforminput = StringAttribute("onforminput")
    val oninput = StringAttribute("oninput")
    val oninvalid = StringAttribute("oninvalid")
    val onkeydown = StringAttribute("onkeydown")
    val onkeypress = StringAttribute("onkeypress")
    val onkeyup = StringAttribute("onkeyup")
    val onload = StringAttribute("onload")
    val onloadeddata = StringAttribute("onloadeddata")
    val onloadedmetadata = StringAttribute("onloadedmetadata")
    val onloadstart = StringAttribute("onloadstart")
    val onmousedown = StringAttribute("onmousedown")
    val onmousemove = StringAttribute("onmousemove")
    val onmouseout = StringAttribute("onmouseout")
    val onmouseover = StringAttribute("onmouseover")
    val onmouseup = StringAttribute("onmouseup")
    val onmousewheel = StringAttribute("onmousewheel")
    val onpause = StringAttribute("onpause")
    val onplay = StringAttribute("onplay")
    val onplaying = StringAttribute("onplaying")
    val onprogress = StringAttribute("onprogress")
    val onratechange = StringAttribute("onratechange")
    val onreadystatechange = StringAttribute("onreadystatechange")
    val onscroll = StringAttribute("onscroll")
    val onseeked = StringAttribute("onseeked")
    val onseeking = StringAttribute("onseeking")
    val onselect = StringAttribute("onselect")
    val onshow = StringAttribute("onshow")
    val onstalled = StringAttribute("onstalled")
    val onsubmit = StringAttribute("onsubmit")
    val onsuspend = StringAttribute("onsuspend")
    val ontimeupdate = StringAttribute("ontimeupdate")
    val onvolumenchange = StringAttribute("onvolumenchange")
    val onwaiting = StringAttribute("onwaiting")
    val open = TickerAttribute("open")
    val optimum = FloatAttribute("optimum")
    val pattern = StringAttribute("pattern")
    val ping = StringAttribute("ping")
    val placeholder = StringAttribute("placeholder")
    val poster = StringAttribute("poster")
    val radiogroup = StringAttribute("radiogroup")
    val readonly = TickerAttribute("readonly")
    val rel = StrEnumAttribute("rel", javaClass<LinkType>())
    val required = TickerAttribute("required")
    val reversed = TickerAttribute("reversed")
    val role = StringAttribute("role")
    val rows = IntAttribute("rows")
    val rowspan = PositiveIntAttribute("rowspan")
    val runat = EnumAttribute("runat", javaClass<Runat>())
    val sandbox = EnumAttribute("sandbox", javaClass<Sandbox>())
    val scope = EnumAttribute("scope", javaClass<Scope>())
    val seamless = TickerAttribute("seamless")
    val selected = TickerAttribute("selected")
    val size = StringAttribute("size")
    val span = PositiveIntAttribute("span")
    val spellcheck = BooleanAttribute("spellcheck")
    val src = LinkAttribute("src")
    val start = StringAttribute("start")
    val step = StringAttribute("step")
    val style = StringAttribute("style")
    val subject = StringAttribute("subject")
    val summary = StringAttribute("summary")
    val tabIndex = StringAttribute("tabIndex")
    val target = StrEnumAttribute("target", javaClass<BrowsingContext>())
    val title = StringAttribute("title")
    val aType = StrEnumAttribute("type", javaClass<ContentType>())
    val buttonType = EnumAttribute("type", javaClass<ButtonType>())
    val commandType = EnumAttribute("type", javaClass<CommandType>())
    val stringType = StringAttribute("type")
    val inputType = EnumAttribute("type", javaClass<InputType>())
    val menuType = EnumAttribute("type", javaClass<MenuType>())
    val usemap = LinkAttribute("usemap")
    val stringValue = StringAttribute("value")
    val floatValue = FloatAttribute("value")
    val width = StringAttribute("width")
    val wrap = EnumAttribute("wrap", javaClass<Wrap>())
}
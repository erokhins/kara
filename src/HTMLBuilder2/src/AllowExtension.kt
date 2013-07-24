
package kotlin.html

trait AllowCAPTION
    fun Tag<AllowCAPTION>.caption(c: StyleClass? = null, id: String? = null, contents: TagWithText<CAPTION>.() -> Unit = empty_contents) = contentTag(::CAPTION, "caption", c, id, contents)

trait AllowCOL
    fun Tag<AllowCOL>.col(c: StyleClass? = null, id: String? = null, contents: Tag<COL>.() -> Unit = empty_contents) = contentTag(::COL, "col", c, id, contents)

trait AllowCOLGROUP
    fun Tag<AllowCOLGROUP>.colgroup(c: StyleClass? = null, id: String? = null, contents: Tag<COLGROUP>.() -> Unit = empty_contents) = contentTag(::COLGROUP, "colgroup", c, id, contents)

trait AllowDD
    fun Tag<AllowDD>.dd(c: StyleClass? = null, id: String? = null, contents: TagWithText<DD>.() -> Unit = empty_contents) = contentTag(::DD, "dd", c, id, contents, contentStyle = ContentStyle.propagate)

trait AllowDT
    fun Tag<AllowDT>.dt(c: StyleClass? = null, id: String? = null, contents: TagWithText<DT>.() -> Unit = empty_contents) = contentTag(::DT, "dt", c, id, contents, contentStyle = ContentStyle.propagate)

trait AllowH1
    fun Tag<AllowH1>.h1(c: StyleClass? = null, id: String? = null, contents: TagWithText<H1>.() -> Unit = empty_contents) = contentTag(::H1, "h1", c, id, contents)

trait AllowH2
    fun Tag<AllowH2>.h2(c: StyleClass? = null, id: String? = null, contents: TagWithText<H2>.() -> Unit = empty_contents) = contentTag(::H2, "h2", c, id, contents)

trait AllowH3
    fun Tag<AllowH3>.h3(c: StyleClass? = null, id: String? = null, contents: TagWithText<H3>.() -> Unit = empty_contents) = contentTag(::H3, "h3", c, id, contents)

trait AllowH4
    fun Tag<AllowH4>.h4(c: StyleClass? = null, id: String? = null, contents: TagWithText<H4>.() -> Unit = empty_contents) = contentTag(::H4, "h4", c, id, contents)

trait AllowH5
    fun Tag<AllowH5>.h5(c: StyleClass? = null, id: String? = null, contents: TagWithText<H5>.() -> Unit = empty_contents) = contentTag(::H5, "h5", c, id, contents)

trait AllowH6
    fun Tag<AllowH6>.h6(c: StyleClass? = null, id: String? = null, contents: TagWithText<H6>.() -> Unit = empty_contents) = contentTag(::H6, "h6", c, id, contents)

trait AllowLEGEND
    fun Tag<AllowLEGEND>.legend(c: StyleClass? = null, id: String? = null, contents: TagWithText<LEGEND>.() -> Unit = empty_contents) = contentTag(::LEGEND, "legend", c, id, contents)

trait AllowLI
    fun Tag<AllowLI>.li(c: StyleClass? = null, id: String? = null, contents: TagWithText<LI>.() -> Unit = empty_contents) = contentTag(::LI, "li", c, id, contents)

trait AllowOPTGROUP
    fun Tag<AllowOPTGROUP>.optgroup(c: StyleClass? = null, id: String? = null, contents: Tag<OPTGROUP>.() -> Unit = empty_contents) = contentTag(::OPTGROUP, "optgroup", c, id, contents)

trait AllowOPTION
    fun Tag<AllowOPTION>.option(c: StyleClass? = null, id: String? = null, contents: TagWithText<OPTION>.() -> Unit = empty_contents) = contentTag(::OPTION, "option", c, id, contents)

trait AllowPARAM
    fun Tag<AllowPARAM>.param(c: StyleClass? = null, id: String? = null, contents: Tag<PARAM>.() -> Unit = empty_contents) = contentTag(::PARAM, "param", c, id, contents)

trait AllowRP
    fun Tag<AllowRP>.rp(c: StyleClass? = null, id: String? = null, contents: TagWithText<RP>.() -> Unit = empty_contents) = contentTag(::RP, "rp", c, id, contents)

trait AllowRT
    fun Tag<AllowRT>.rt(c: StyleClass? = null, id: String? = null, contents: TagWithText<RT>.() -> Unit = empty_contents) = contentTag(::RT, "rt", c, id, contents)

trait AllowSOURCE
    fun Tag<AllowSOURCE>.source(c: StyleClass? = null, id: String? = null, contents: Tag<SOURCE>.() -> Unit = empty_contents) = contentTag(::SOURCE, "source", c, id, contents)

trait AllowTBODY
    fun Tag<AllowTBODY>.tbody(c: StyleClass? = null, id: String? = null, contents: Tag<TBODY>.() -> Unit = empty_contents) = contentTag(::TBODY, "tbody", c, id, contents)

trait AllowTD
    fun Tag<AllowTD>.td(c: StyleClass? = null, id: String? = null, contents: TagWithText<TD>.() -> Unit = empty_contents) = contentTag(::TD, "td", c, id, contents)

trait AllowTFOOT
    fun Tag<AllowTFOOT>.tfoot(c: StyleClass? = null, id: String? = null, contents: Tag<TFOOT>.() -> Unit = empty_contents) = contentTag(::TFOOT, "tfoot", c, id, contents)

trait AllowTH
    fun Tag<AllowTH>.th(c: StyleClass? = null, id: String? = null, contents: TagWithText<TH>.() -> Unit = empty_contents) = contentTag(::TH, "th", c, id, contents)

trait AllowTHEAD
    fun Tag<AllowTHEAD>.thead(c: StyleClass? = null, id: String? = null, contents: Tag<THEAD>.() -> Unit = empty_contents) = contentTag(::THEAD, "thead", c, id, contents)

trait AllowTR
    fun Tag<AllowTR>.tr(c: StyleClass? = null, id: String? = null, contents: Tag<TR>.() -> Unit = empty_contents) = contentTag(::TR, "tr", c, id, contents)

trait CommonAllow: AllowH1, AllowH2, AllowH3, AllowH4, AllowH5, AllowH6
    fun Tag<CommonAllow>.a(c: StyleClass? = null, id: String? = null, contents: TagWithText<A>.() -> Unit = empty_contents) = contentTag(::A, "a", c, id, contents, contentStyle = ContentStyle.propagate)
    fun Tag<CommonAllow>.abbr(c: StyleClass? = null, id: String? = null, contents: TagWithText<ABBR>.() -> Unit = empty_contents) = contentTag(::ABBR, "abbr", c, id, contents)
    fun Tag<CommonAllow>.address(c: StyleClass? = null, id: String? = null, contents: TagWithText<ADDRESS>.() -> Unit = empty_contents) = contentTag(::ADDRESS, "address", c, id, contents)
    fun Tag<CommonAllow>.area(c: StyleClass? = null, id: String? = null, contents: Tag<AREA>.() -> Unit = empty_contents) = contentTag(::AREA, "area", c, id, contents)
    fun Tag<CommonAllow>.article(c: StyleClass? = null, id: String? = null, contents: TagWithText<ARTICLE>.() -> Unit = empty_contents) = contentTag(::ARTICLE, "article", c, id, contents)
    fun Tag<CommonAllow>.aside(c: StyleClass? = null, id: String? = null, contents: TagWithText<ASIDE>.() -> Unit = empty_contents) = contentTag(::ASIDE, "aside", c, id, contents)
    fun Tag<CommonAllow>.audio(c: StyleClass? = null, id: String? = null, contents: TagWithText<AUDIO>.() -> Unit = empty_contents) = contentTag(::AUDIO, "audio", c, id, contents)
    fun Tag<CommonAllow>.b(c: StyleClass? = null, id: String? = null, contents: TagWithText<B>.() -> Unit = empty_contents) = contentTag(::B, "b", c, id, contents, contentStyle = ContentStyle.propagate)
    fun Tag<CommonAllow>.bdi(c: StyleClass? = null, id: String? = null, contents: TagWithText<BDI>.() -> Unit = empty_contents) = contentTag(::BDI, "bdi", c, id, contents)
    fun Tag<CommonAllow>.bdo(c: StyleClass? = null, id: String? = null, contents: TagWithText<BDO>.() -> Unit = empty_contents) = contentTag(::BDO, "bdo", c, id, contents)
    fun Tag<CommonAllow>.blockquote(c: StyleClass? = null, id: String? = null, contents: TagWithText<BLOCKQUOTE>.() -> Unit = empty_contents) = contentTag(::BLOCKQUOTE, "blockquote", c, id, contents)
    fun Tag<CommonAllow>.br(c: StyleClass? = null, id: String? = null, contents: Tag<BR>.() -> Unit = empty_contents) = contentTag(::BR, "br", c, id, contents, renderStyle = RenderStyle.empty)
    fun Tag<CommonAllow>.button(c: StyleClass? = null, id: String? = null, contents: TagWithText<BUTTON>.() -> Unit = empty_contents) = contentTag(::BUTTON, "button", c, id, contents)
    fun Tag<CommonAllow>.canvas(c: StyleClass? = null, id: String? = null, contents: TagWithText<CANVAS>.() -> Unit = empty_contents) = contentTag(::CANVAS, "canvas", c, id, contents)
    fun Tag<CommonAllow>.cite(c: StyleClass? = null, id: String? = null, contents: TagWithText<CITE>.() -> Unit = empty_contents) = contentTag(::CITE, "cite", c, id, contents)
    fun Tag<CommonAllow>.code(c: StyleClass? = null, id: String? = null, contents: TagWithText<CODE>.() -> Unit = empty_contents) = contentTag(::CODE, "code", c, id, contents)
    fun Tag<CommonAllow>.command(c: StyleClass? = null, id: String? = null, contents: Tag<COMMAND>.() -> Unit = empty_contents) = contentTag(::COMMAND, "command", c, id, contents)
    fun Tag<CommonAllow>.datalist(c: StyleClass? = null, id: String? = null, contents: Tag<DATALIST>.() -> Unit = empty_contents) = contentTag(::DATALIST, "datalist", c, id, contents)
    fun Tag<CommonAllow>.del(c: StyleClass? = null, id: String? = null, contents: TagWithText<DEL>.() -> Unit = empty_contents) = contentTag(::DEL, "del", c, id, contents)
    fun Tag<CommonAllow>.details(c: StyleClass? = null, id: String? = null, contents: TagWithText<DETAILS>.() -> Unit = empty_contents) = contentTag(::DETAILS, "details", c, id, contents)
    fun Tag<CommonAllow>.dfn(c: StyleClass? = null, id: String? = null, contents: TagWithText<DFN>.() -> Unit = empty_contents) = contentTag(::DFN, "dfn", c, id, contents)
    fun Tag<CommonAllow>.dialog(c: StyleClass? = null, id: String? = null, contents: Tag<DIALOG>.() -> Unit = empty_contents) = contentTag(::DIALOG, "dialog", c, id, contents)
    fun Tag<CommonAllow>.div(c: StyleClass? = null, id: String? = null, contents: TagWithText<DIV>.() -> Unit = empty_contents) = contentTag(::DIV, "div", c, id, contents)
    fun Tag<CommonAllow>.dl(c: StyleClass? = null, id: String? = null, contents: Tag<DL>.() -> Unit = empty_contents) = contentTag(::DL, "dl", c, id, contents)
    fun Tag<CommonAllow>.em(c: StyleClass? = null, id: String? = null, contents: TagWithText<EM>.() -> Unit = empty_contents) = contentTag(::EM, "em", c, id, contents, contentStyle = ContentStyle.propagate)
    fun Tag<CommonAllow>.embed(c: StyleClass? = null, id: String? = null, contents: Tag<EMBED>.() -> Unit = empty_contents) = contentTag(::EMBED, "embed", c, id, contents)
    fun Tag<CommonAllow>.fieldset(c: StyleClass? = null, id: String? = null, contents: TagWithText<FIELDSET>.() -> Unit = empty_contents) = contentTag(::FIELDSET, "fieldset", c, id, contents)
    fun Tag<CommonAllow>.figure(c: StyleClass? = null, id: String? = null, contents: TagWithText<FIGURE>.() -> Unit = empty_contents) = contentTag(::FIGURE, "figure", c, id, contents)
    fun Tag<CommonAllow>.footer(c: StyleClass? = null, id: String? = null, contents: TagWithText<FOOTER>.() -> Unit = empty_contents) = contentTag(::FOOTER, "footer", c, id, contents)
    fun Tag<CommonAllow>.form(c: StyleClass? = null, id: String? = null, contents: TagWithText<FORM>.() -> Unit = empty_contents) = contentTag(::FORM, "form", c, id, contents)
    fun Tag<CommonAllow>.header(c: StyleClass? = null, id: String? = null, contents: TagWithText<HEADER>.() -> Unit = empty_contents) = contentTag(::HEADER, "header", c, id, contents)
    fun Tag<CommonAllow>.hgroup(c: StyleClass? = null, id: String? = null, contents: Tag<HGROUP>.() -> Unit = empty_contents) = contentTag(::HGROUP, "hgroup", c, id, contents)
    fun Tag<CommonAllow>.hr(c: StyleClass? = null, id: String? = null, contents: Tag<HR>.() -> Unit = empty_contents) = contentTag(::HR, "hr", c, id, contents, renderStyle = RenderStyle.empty)
    fun Tag<CommonAllow>.i(c: StyleClass? = null, id: String? = null, contents: TagWithText<I>.() -> Unit = empty_contents) = contentTag(::I, "i", c, id, contents, contentStyle = ContentStyle.propagate)
    fun Tag<CommonAllow>.iframe(c: StyleClass? = null, id: String? = null, contents: TagWithText<IFRAME>.() -> Unit = empty_contents) = contentTag(::IFRAME, "iframe", c, id, contents)
    fun Tag<CommonAllow>.img(c: StyleClass? = null, id: String? = null, contents: Tag<IMG>.() -> Unit = empty_contents) = contentTag(::IMG, "img", c, id, contents, renderStyle = RenderStyle.empty, contentStyle = ContentStyle.text)
    fun Tag<CommonAllow>.input(c: StyleClass? = null, id: String? = null, contents: Tag<INPUT>.() -> Unit = empty_contents) = contentTag(::INPUT, "input", c, id, contents, renderStyle = RenderStyle.empty)
    fun Tag<CommonAllow>.ins(c: StyleClass? = null, id: String? = null, contents: TagWithText<INS>.() -> Unit = empty_contents) = contentTag(::INS, "ins", c, id, contents)
    fun Tag<CommonAllow>.kbd(c: StyleClass? = null, id: String? = null, contents: TagWithText<KBD>.() -> Unit = empty_contents) = contentTag(::KBD, "kbd", c, id, contents)
    fun Tag<CommonAllow>.keygen(c: StyleClass? = null, id: String? = null, contents: TagWithText<KEYGEN>.() -> Unit = empty_contents) = contentTag(::KEYGEN, "keygen", c, id, contents)
    fun Tag<CommonAllow>.label(c: StyleClass? = null, id: String? = null, contents: TagWithText<LABEL>.() -> Unit = empty_contents) = contentTag(::LABEL, "label", c, id, contents)
    fun Tag<CommonAllow>.map(c: StyleClass? = null, id: String? = null, contents: Tag<MAP>.() -> Unit = empty_contents) = contentTag(::MAP, "map", c, id, contents)
    fun Tag<CommonAllow>.mark(c: StyleClass? = null, id: String? = null, contents: TagWithText<MARK>.() -> Unit = empty_contents) = contentTag(::MARK, "mark", c, id, contents)
    fun Tag<CommonAllow>.math(c: StyleClass? = null, id: String? = null, contents: TagWithText<MATH>.() -> Unit = empty_contents) = contentTag(::MATH, "math", c, id, contents)
    fun Tag<CommonAllow>.menu(c: StyleClass? = null, id: String? = null, contents: Tag<MENU>.() -> Unit = empty_contents) = contentTag(::MENU, "menu", c, id, contents)
    fun Tag<CommonAllow>.meter(c: StyleClass? = null, id: String? = null, contents: TagWithText<METER>.() -> Unit = empty_contents) = contentTag(::METER, "meter", c, id, contents)
    fun Tag<CommonAllow>.nav(c: StyleClass? = null, id: String? = null, contents: TagWithText<NAV>.() -> Unit = empty_contents) = contentTag(::NAV, "nav", c, id, contents)
    fun Tag<CommonAllow>.object_(c: StyleClass? = null, id: String? = null, contents: TagWithText<OBJECT_>.() -> Unit = empty_contents) = contentTag(::OBJECT_, "object", c, id, contents)
    fun Tag<CommonAllow>.ol(c: StyleClass? = null, id: String? = null, contents: Tag<OL>.() -> Unit = empty_contents) = contentTag(::OL, "ol", c, id, contents)
    fun Tag<CommonAllow>.output(c: StyleClass? = null, id: String? = null, contents: TagWithText<OUTPUT>.() -> Unit = empty_contents) = contentTag(::OUTPUT, "output", c, id, contents)
    fun Tag<CommonAllow>.p(c: StyleClass? = null, id: String? = null, contents: TagWithText<P>.() -> Unit = empty_contents) = contentTag(::P, "p", c, id, contents)
    fun Tag<CommonAllow>.pre(c: StyleClass? = null, id: String? = null, contents: TagWithText<PRE>.() -> Unit = empty_contents) = contentTag(::PRE, "pre", c, id, contents)
    fun Tag<CommonAllow>.progress(c: StyleClass? = null, id: String? = null, contents: TagWithText<PROGRESS>.() -> Unit = empty_contents) = contentTag(::PROGRESS, "progress", c, id, contents)
    fun Tag<CommonAllow>.q(c: StyleClass? = null, id: String? = null, contents: TagWithText<Q>.() -> Unit = empty_contents) = contentTag(::Q, "q", c, id, contents)
    fun Tag<CommonAllow>.ruby(c: StyleClass? = null, id: String? = null, contents: TagWithText<RUBY>.() -> Unit = empty_contents) = contentTag(::RUBY, "ruby", c, id, contents)
    fun Tag<CommonAllow>.samp(c: StyleClass? = null, id: String? = null, contents: TagWithText<SAMP>.() -> Unit = empty_contents) = contentTag(::SAMP, "samp", c, id, contents)
    fun Tag<CommonAllow>.section(c: StyleClass? = null, id: String? = null, contents: TagWithText<SECTION>.() -> Unit = empty_contents) = contentTag(::SECTION, "section", c, id, contents)
    fun Tag<CommonAllow>.select(c: StyleClass? = null, id: String? = null, contents: Tag<SELECT>.() -> Unit = empty_contents) = contentTag(::SELECT, "select", c, id, contents)
    fun Tag<CommonAllow>.small(c: StyleClass? = null, id: String? = null, contents: TagWithText<SMALL>.() -> Unit = empty_contents) = contentTag(::SMALL, "small", c, id, contents, contentStyle = ContentStyle.propagate)
    fun Tag<CommonAllow>.span(c: StyleClass? = null, id: String? = null, contents: TagWithText<SPAN>.() -> Unit = empty_contents) = contentTag(::SPAN, "span", c, id, contents, contentStyle = ContentStyle.propagate)
    fun Tag<CommonAllow>.strong(c: StyleClass? = null, id: String? = null, contents: TagWithText<STRONG>.() -> Unit = empty_contents) = contentTag(::STRONG, "strong", c, id, contents, contentStyle = ContentStyle.propagate)
    fun Tag<CommonAllow>.sub(c: StyleClass? = null, id: String? = null, contents: TagWithText<SUB>.() -> Unit = empty_contents) = contentTag(::SUB, "sub", c, id, contents)
    fun Tag<CommonAllow>.sup(c: StyleClass? = null, id: String? = null, contents: TagWithText<SUP>.() -> Unit = empty_contents) = contentTag(::SUP, "sup", c, id, contents)
    fun Tag<CommonAllow>.svg(c: StyleClass? = null, id: String? = null, contents: Tag<SVG>.() -> Unit = empty_contents) = contentTag(::SVG, "svg", c, id, contents)
    fun Tag<CommonAllow>.table(c: StyleClass? = null, id: String? = null, contents: Tag<TABLE>.() -> Unit = empty_contents) = contentTag(::TABLE, "table", c, id, contents)
    fun Tag<CommonAllow>.textarea(c: StyleClass? = null, id: String? = null, contents: TagWithText<TEXTAREA>.() -> Unit = empty_contents) = contentTag(::TEXTAREA, "textarea", c, id, contents)
    fun Tag<CommonAllow>.time(c: StyleClass? = null, id: String? = null, contents: TagWithText<TIME>.() -> Unit = empty_contents) = contentTag(::TIME, "time", c, id, contents)
    fun Tag<CommonAllow>.ul(c: StyleClass? = null, id: String? = null, contents: Tag<UL>.() -> Unit = empty_contents) = contentTag(::UL, "ul", c, id, contents)
    fun Tag<CommonAllow>.var_(c: StyleClass? = null, id: String? = null, contents: TagWithText<VAR_>.() -> Unit = empty_contents) = contentTag(::VAR_, "var", c, id, contents)
    fun Tag<CommonAllow>.video(c: StyleClass? = null, id: String? = null, contents: TagWithText<VIDEO>.() -> Unit = empty_contents) = contentTag(::VIDEO, "video", c, id, contents)

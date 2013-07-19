
package kotlin.html5

trait AllowCAPTION
    fun Tag<AllowCAPTION>.caption(id: String? = null, c: StyleClass? = null, contents: TagWithText<CAPTION>.() -> Unit = empty_contents) = contentTag(::CAPTION, "caption", c, id, contents)

trait AllowCOL
    fun Tag<AllowCOL>.col(id: String? = null, c: StyleClass? = null, contents: Tag<COL>.() -> Unit = empty_contents) = contentTag(::COL, "col", c, id, contents)

trait AllowCOLGROUP
    fun Tag<AllowCOLGROUP>.colgroup(id: String? = null, c: StyleClass? = null, contents: Tag<COLGROUP>.() -> Unit = empty_contents) = contentTag(::COLGROUP, "colgroup", c, id, contents)

trait AllowDD
    fun Tag<AllowDD>.dd(id: String? = null, c: StyleClass? = null, contents: TagWithText<DD>.() -> Unit = empty_contents) = contentTag(::DD, "dd", c, id, contents)

trait AllowDT
    fun Tag<AllowDT>.dt(id: String? = null, c: StyleClass? = null, contents: TagWithText<DT>.() -> Unit = empty_contents) = contentTag(::DT, "dt", c, id, contents)

trait AllowH1
    fun Tag<AllowH1>.h1(id: String? = null, c: StyleClass? = null, contents: TagWithText<H1>.() -> Unit = empty_contents) = contentTag(::H1, "h1", c, id, contents)

trait AllowH2
    fun Tag<AllowH2>.h2(id: String? = null, c: StyleClass? = null, contents: TagWithText<H2>.() -> Unit = empty_contents) = contentTag(::H2, "h2", c, id, contents)

trait AllowH3
    fun Tag<AllowH3>.h3(id: String? = null, c: StyleClass? = null, contents: TagWithText<H3>.() -> Unit = empty_contents) = contentTag(::H3, "h3", c, id, contents)

trait AllowH4
    fun Tag<AllowH4>.h4(id: String? = null, c: StyleClass? = null, contents: TagWithText<H4>.() -> Unit = empty_contents) = contentTag(::H4, "h4", c, id, contents)

trait AllowH5
    fun Tag<AllowH5>.h5(id: String? = null, c: StyleClass? = null, contents: TagWithText<H5>.() -> Unit = empty_contents) = contentTag(::H5, "h5", c, id, contents)

trait AllowH6
    fun Tag<AllowH6>.h6(id: String? = null, c: StyleClass? = null, contents: TagWithText<H6>.() -> Unit = empty_contents) = contentTag(::H6, "h6", c, id, contents)

trait AllowLEGEND
    fun Tag<AllowLEGEND>.legend(id: String? = null, c: StyleClass? = null, contents: TagWithText<LEGEND>.() -> Unit = empty_contents) = contentTag(::LEGEND, "legend", c, id, contents)

trait AllowLI
    fun Tag<AllowLI>.li(id: String? = null, c: StyleClass? = null, contents: TagWithText<LI>.() -> Unit = empty_contents) = contentTag(::LI, "li", c, id, contents)

trait AllowOPTGROUP
    fun Tag<AllowOPTGROUP>.optgroup(id: String? = null, c: StyleClass? = null, contents: Tag<OPTGROUP>.() -> Unit = empty_contents) = contentTag(::OPTGROUP, "optgroup", c, id, contents)

trait AllowOPTION
    fun Tag<AllowOPTION>.option(id: String? = null, c: StyleClass? = null, contents: TagWithText<OPTION>.() -> Unit = empty_contents) = contentTag(::OPTION, "option", c, id, contents)

trait AllowPARAM
    fun Tag<AllowPARAM>.param(id: String? = null, c: StyleClass? = null, contents: Tag<PARAM>.() -> Unit = empty_contents) = contentTag(::PARAM, "param", c, id, contents)

trait AllowRP
    fun Tag<AllowRP>.rp(id: String? = null, c: StyleClass? = null, contents: TagWithText<RP>.() -> Unit = empty_contents) = contentTag(::RP, "rp", c, id, contents)

trait AllowRT
    fun Tag<AllowRT>.rt(id: String? = null, c: StyleClass? = null, contents: TagWithText<RT>.() -> Unit = empty_contents) = contentTag(::RT, "rt", c, id, contents)

trait AllowSOURCE
    fun Tag<AllowSOURCE>.source(id: String? = null, c: StyleClass? = null, contents: Tag<SOURCE>.() -> Unit = empty_contents) = contentTag(::SOURCE, "source", c, id, contents)

trait AllowTBODY
    fun Tag<AllowTBODY>.tbody(id: String? = null, c: StyleClass? = null, contents: Tag<TBODY>.() -> Unit = empty_contents) = contentTag(::TBODY, "tbody", c, id, contents)

trait AllowTD
    fun Tag<AllowTD>.td(id: String? = null, c: StyleClass? = null, contents: TagWithText<TD>.() -> Unit = empty_contents) = contentTag(::TD, "td", c, id, contents)

trait AllowTFOOT
    fun Tag<AllowTFOOT>.tfoot(id: String? = null, c: StyleClass? = null, contents: Tag<TFOOT>.() -> Unit = empty_contents) = contentTag(::TFOOT, "tfoot", c, id, contents)

trait AllowTH
    fun Tag<AllowTH>.th(id: String? = null, c: StyleClass? = null, contents: TagWithText<TH>.() -> Unit = empty_contents) = contentTag(::TH, "th", c, id, contents)

trait AllowTHEAD
    fun Tag<AllowTHEAD>.thead(id: String? = null, c: StyleClass? = null, contents: Tag<THEAD>.() -> Unit = empty_contents) = contentTag(::THEAD, "thead", c, id, contents)

trait AllowTR
    fun Tag<AllowTR>.tr(id: String? = null, c: StyleClass? = null, contents: Tag<TR>.() -> Unit = empty_contents) = contentTag(::TR, "tr", c, id, contents)

trait CommonAllow: AllowH1, AllowH2, AllowH3, AllowH4, AllowH5, AllowH6
    fun Tag<CommonAllow>.a(id: String? = null, c: StyleClass? = null, contents: TagWithText<A>.() -> Unit = empty_contents) = contentTag(::A, "a", c, id, contents)
    fun Tag<CommonAllow>.abbr(id: String? = null, c: StyleClass? = null, contents: TagWithText<ABBR>.() -> Unit = empty_contents) = contentTag(::ABBR, "abbr", c, id, contents)
    fun Tag<CommonAllow>.address(id: String? = null, c: StyleClass? = null, contents: TagWithText<ADDRESS>.() -> Unit = empty_contents) = contentTag(::ADDRESS, "address", c, id, contents)
    fun Tag<CommonAllow>.area(id: String? = null, c: StyleClass? = null, contents: Tag<AREA>.() -> Unit = empty_contents) = contentTag(::AREA, "area", c, id, contents)
    fun Tag<CommonAllow>.article(id: String? = null, c: StyleClass? = null, contents: TagWithText<ARTICLE>.() -> Unit = empty_contents) = contentTag(::ARTICLE, "article", c, id, contents)
    fun Tag<CommonAllow>.aside(id: String? = null, c: StyleClass? = null, contents: TagWithText<ASIDE>.() -> Unit = empty_contents) = contentTag(::ASIDE, "aside", c, id, contents)
    fun Tag<CommonAllow>.audio(id: String? = null, c: StyleClass? = null, contents: TagWithText<AUDIO>.() -> Unit = empty_contents) = contentTag(::AUDIO, "audio", c, id, contents)
    fun Tag<CommonAllow>.b(id: String? = null, c: StyleClass? = null, contents: TagWithText<B>.() -> Unit = empty_contents) = contentTag(::B, "b", c, id, contents)
    fun Tag<CommonAllow>.bdi(id: String? = null, c: StyleClass? = null, contents: TagWithText<BDI>.() -> Unit = empty_contents) = contentTag(::BDI, "bdi", c, id, contents)
    fun Tag<CommonAllow>.bdo(id: String? = null, c: StyleClass? = null, contents: TagWithText<BDO>.() -> Unit = empty_contents) = contentTag(::BDO, "bdo", c, id, contents)
    fun Tag<CommonAllow>.blockquote(id: String? = null, c: StyleClass? = null, contents: TagWithText<BLOCKQUOTE>.() -> Unit = empty_contents) = contentTag(::BLOCKQUOTE, "blockquote", c, id, contents)
    fun Tag<CommonAllow>.br(id: String? = null, c: StyleClass? = null, contents: Tag<BR>.() -> Unit = empty_contents) = contentTag(::BR, "br", c, id, contents)
    fun Tag<CommonAllow>.button(id: String? = null, c: StyleClass? = null, contents: TagWithText<BUTTON>.() -> Unit = empty_contents) = contentTag(::BUTTON, "button", c, id, contents)
    fun Tag<CommonAllow>.canvas(id: String? = null, c: StyleClass? = null, contents: TagWithText<CANVAS>.() -> Unit = empty_contents) = contentTag(::CANVAS, "canvas", c, id, contents)
    fun Tag<CommonAllow>.cite(id: String? = null, c: StyleClass? = null, contents: TagWithText<CITE>.() -> Unit = empty_contents) = contentTag(::CITE, "cite", c, id, contents)
    fun Tag<CommonAllow>.code(id: String? = null, c: StyleClass? = null, contents: TagWithText<CODE>.() -> Unit = empty_contents) = contentTag(::CODE, "code", c, id, contents)
    fun Tag<CommonAllow>.command(id: String? = null, c: StyleClass? = null, contents: Tag<COMMAND>.() -> Unit = empty_contents) = contentTag(::COMMAND, "command", c, id, contents)
    fun Tag<CommonAllow>.datalist(id: String? = null, c: StyleClass? = null, contents: Tag<DATALIST>.() -> Unit = empty_contents) = contentTag(::DATALIST, "datalist", c, id, contents)
    fun Tag<CommonAllow>.del(id: String? = null, c: StyleClass? = null, contents: TagWithText<DEL>.() -> Unit = empty_contents) = contentTag(::DEL, "del", c, id, contents)
    fun Tag<CommonAllow>.details(id: String? = null, c: StyleClass? = null, contents: TagWithText<DETAILS>.() -> Unit = empty_contents) = contentTag(::DETAILS, "details", c, id, contents)
    fun Tag<CommonAllow>.dfn(id: String? = null, c: StyleClass? = null, contents: TagWithText<DFN>.() -> Unit = empty_contents) = contentTag(::DFN, "dfn", c, id, contents)
    fun Tag<CommonAllow>.dialog(id: String? = null, c: StyleClass? = null, contents: Tag<DIALOG>.() -> Unit = empty_contents) = contentTag(::DIALOG, "dialog", c, id, contents)
    fun Tag<CommonAllow>.div(id: String? = null, c: StyleClass? = null, contents: TagWithText<DIV>.() -> Unit = empty_contents) = contentTag(::DIV, "div", c, id, contents)
    fun Tag<CommonAllow>.dl(id: String? = null, c: StyleClass? = null, contents: Tag<DL>.() -> Unit = empty_contents) = contentTag(::DL, "dl", c, id, contents)
    fun Tag<CommonAllow>.em(id: String? = null, c: StyleClass? = null, contents: TagWithText<EM>.() -> Unit = empty_contents) = contentTag(::EM, "em", c, id, contents)
    fun Tag<CommonAllow>.embed(id: String? = null, c: StyleClass? = null, contents: Tag<EMBED>.() -> Unit = empty_contents) = contentTag(::EMBED, "embed", c, id, contents)
    fun Tag<CommonAllow>.fieldset(id: String? = null, c: StyleClass? = null, contents: TagWithText<FIELDSET>.() -> Unit = empty_contents) = contentTag(::FIELDSET, "fieldset", c, id, contents)
    fun Tag<CommonAllow>.figure(id: String? = null, c: StyleClass? = null, contents: TagWithText<FIGURE>.() -> Unit = empty_contents) = contentTag(::FIGURE, "figure", c, id, contents)
    fun Tag<CommonAllow>.footer(id: String? = null, c: StyleClass? = null, contents: TagWithText<FOOTER>.() -> Unit = empty_contents) = contentTag(::FOOTER, "footer", c, id, contents)
    fun Tag<CommonAllow>.form(id: String? = null, c: StyleClass? = null, contents: TagWithText<FORM>.() -> Unit = empty_contents) = contentTag(::FORM, "form", c, id, contents)
    fun Tag<CommonAllow>.header(id: String? = null, c: StyleClass? = null, contents: TagWithText<HEADER>.() -> Unit = empty_contents) = contentTag(::HEADER, "header", c, id, contents)
    fun Tag<CommonAllow>.hgroup(id: String? = null, c: StyleClass? = null, contents: Tag<HGROUP>.() -> Unit = empty_contents) = contentTag(::HGROUP, "hgroup", c, id, contents)
    fun Tag<CommonAllow>.hr(id: String? = null, c: StyleClass? = null, contents: Tag<HR>.() -> Unit = empty_contents) = contentTag(::HR, "hr", c, id, contents)
    fun Tag<CommonAllow>.i(id: String? = null, c: StyleClass? = null, contents: TagWithText<I>.() -> Unit = empty_contents) = contentTag(::I, "i", c, id, contents)
    fun Tag<CommonAllow>.iframe(id: String? = null, c: StyleClass? = null, contents: TagWithText<IFRAME>.() -> Unit = empty_contents) = contentTag(::IFRAME, "iframe", c, id, contents)
    fun Tag<CommonAllow>.img(id: String? = null, c: StyleClass? = null, contents: Tag<IMG>.() -> Unit = empty_contents) = contentTag(::IMG, "img", c, id, contents)
    fun Tag<CommonAllow>.input(id: String? = null, c: StyleClass? = null, contents: Tag<INPUT>.() -> Unit = empty_contents) = contentTag(::INPUT, "input", c, id, contents)
    fun Tag<CommonAllow>.ins(id: String? = null, c: StyleClass? = null, contents: TagWithText<INS>.() -> Unit = empty_contents) = contentTag(::INS, "ins", c, id, contents)
    fun Tag<CommonAllow>.kbd(id: String? = null, c: StyleClass? = null, contents: TagWithText<KBD>.() -> Unit = empty_contents) = contentTag(::KBD, "kbd", c, id, contents)
    fun Tag<CommonAllow>.keygen(id: String? = null, c: StyleClass? = null, contents: TagWithText<KEYGEN>.() -> Unit = empty_contents) = contentTag(::KEYGEN, "keygen", c, id, contents)
    fun Tag<CommonAllow>.label(id: String? = null, c: StyleClass? = null, contents: TagWithText<LABEL>.() -> Unit = empty_contents) = contentTag(::LABEL, "label", c, id, contents)
    fun Tag<CommonAllow>.map(id: String? = null, c: StyleClass? = null, contents: Tag<MAP>.() -> Unit = empty_contents) = contentTag(::MAP, "map", c, id, contents)
    fun Tag<CommonAllow>.mark(id: String? = null, c: StyleClass? = null, contents: TagWithText<MARK>.() -> Unit = empty_contents) = contentTag(::MARK, "mark", c, id, contents)
    fun Tag<CommonAllow>.math(id: String? = null, c: StyleClass? = null, contents: TagWithText<MATH>.() -> Unit = empty_contents) = contentTag(::MATH, "math", c, id, contents)
    fun Tag<CommonAllow>.menu(id: String? = null, c: StyleClass? = null, contents: Tag<MENU>.() -> Unit = empty_contents) = contentTag(::MENU, "menu", c, id, contents)
    fun Tag<CommonAllow>.meter(id: String? = null, c: StyleClass? = null, contents: TagWithText<METER>.() -> Unit = empty_contents) = contentTag(::METER, "meter", c, id, contents)
    fun Tag<CommonAllow>.nav(id: String? = null, c: StyleClass? = null, contents: TagWithText<NAV>.() -> Unit = empty_contents) = contentTag(::NAV, "nav", c, id, contents)
    fun Tag<CommonAllow>.object_(id: String? = null, c: StyleClass? = null, contents: TagWithText<OBJECT_>.() -> Unit = empty_contents) = contentTag(::OBJECT_, "object", c, id, contents)
    fun Tag<CommonAllow>.ol(id: String? = null, c: StyleClass? = null, contents: Tag<OL>.() -> Unit = empty_contents) = contentTag(::OL, "ol", c, id, contents)
    fun Tag<CommonAllow>.output(id: String? = null, c: StyleClass? = null, contents: TagWithText<OUTPUT>.() -> Unit = empty_contents) = contentTag(::OUTPUT, "output", c, id, contents)
    fun Tag<CommonAllow>.p(id: String? = null, c: StyleClass? = null, contents: TagWithText<P>.() -> Unit = empty_contents) = contentTag(::P, "p", c, id, contents)
    fun Tag<CommonAllow>.pre(id: String? = null, c: StyleClass? = null, contents: TagWithText<PRE>.() -> Unit = empty_contents) = contentTag(::PRE, "pre", c, id, contents)
    fun Tag<CommonAllow>.progress(id: String? = null, c: StyleClass? = null, contents: TagWithText<PROGRESS>.() -> Unit = empty_contents) = contentTag(::PROGRESS, "progress", c, id, contents)
    fun Tag<CommonAllow>.q(id: String? = null, c: StyleClass? = null, contents: TagWithText<Q>.() -> Unit = empty_contents) = contentTag(::Q, "q", c, id, contents)
    fun Tag<CommonAllow>.ruby(id: String? = null, c: StyleClass? = null, contents: TagWithText<RUBY>.() -> Unit = empty_contents) = contentTag(::RUBY, "ruby", c, id, contents)
    fun Tag<CommonAllow>.samp(id: String? = null, c: StyleClass? = null, contents: TagWithText<SAMP>.() -> Unit = empty_contents) = contentTag(::SAMP, "samp", c, id, contents)
    fun Tag<CommonAllow>.section(id: String? = null, c: StyleClass? = null, contents: TagWithText<SECTION>.() -> Unit = empty_contents) = contentTag(::SECTION, "section", c, id, contents)
    fun Tag<CommonAllow>.select(id: String? = null, c: StyleClass? = null, contents: Tag<SELECT>.() -> Unit = empty_contents) = contentTag(::SELECT, "select", c, id, contents)
    fun Tag<CommonAllow>.small(id: String? = null, c: StyleClass? = null, contents: TagWithText<SMALL>.() -> Unit = empty_contents) = contentTag(::SMALL, "small", c, id, contents)
    fun Tag<CommonAllow>.span(id: String? = null, c: StyleClass? = null, contents: TagWithText<SPAN>.() -> Unit = empty_contents) = contentTag(::SPAN, "span", c, id, contents)
    fun Tag<CommonAllow>.strong(id: String? = null, c: StyleClass? = null, contents: TagWithText<STRONG>.() -> Unit = empty_contents) = contentTag(::STRONG, "strong", c, id, contents)
    fun Tag<CommonAllow>.sub(id: String? = null, c: StyleClass? = null, contents: TagWithText<SUB>.() -> Unit = empty_contents) = contentTag(::SUB, "sub", c, id, contents)
    fun Tag<CommonAllow>.sup(id: String? = null, c: StyleClass? = null, contents: TagWithText<SUP>.() -> Unit = empty_contents) = contentTag(::SUP, "sup", c, id, contents)
    fun Tag<CommonAllow>.svg(id: String? = null, c: StyleClass? = null, contents: Tag<SVG>.() -> Unit = empty_contents) = contentTag(::SVG, "svg", c, id, contents)
    fun Tag<CommonAllow>.table(id: String? = null, c: StyleClass? = null, contents: Tag<TABLE>.() -> Unit = empty_contents) = contentTag(::TABLE, "table", c, id, contents)
    fun Tag<CommonAllow>.textarea(id: String? = null, c: StyleClass? = null, contents: TagWithText<TEXTAREA>.() -> Unit = empty_contents) = contentTag(::TEXTAREA, "textarea", c, id, contents)
    fun Tag<CommonAllow>.time(id: String? = null, c: StyleClass? = null, contents: TagWithText<TIME>.() -> Unit = empty_contents) = contentTag(::TIME, "time", c, id, contents)
    fun Tag<CommonAllow>.ul(id: String? = null, c: StyleClass? = null, contents: Tag<UL>.() -> Unit = empty_contents) = contentTag(::UL, "ul", c, id, contents)
    fun Tag<CommonAllow>.var_(id: String? = null, c: StyleClass? = null, contents: TagWithText<VAR_>.() -> Unit = empty_contents) = contentTag(::VAR_, "var", c, id, contents)
    fun Tag<CommonAllow>.video(id: String? = null, c: StyleClass? = null, contents: TagWithText<VIDEO>.() -> Unit = empty_contents) = contentTag(::VIDEO, "video", c, id, contents)

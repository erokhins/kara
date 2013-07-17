
package kotlin.html5

class A(containingTag: HtmlBodyTag?): AllowText, HtmlBodyTag(containingTag, "a") {
    override val attr = BaseAttributes<A>(this)
    public var BaseAttributes<A>.href: Link by Attributes.href
    public var BaseAttributes<A>.hreflang: I18LanguageCode by Attributes.hreflang
    public var BaseAttributes<A>.ping: String by Attributes.ping
    public var BaseAttributes<A>.rel: LinkType by Attributes.rel
    public var BaseAttributes<A>.target: BrowsingContext by Attributes.target
    public var BaseAttributes<A>.type_: ContentType by Attributes.aType
}

class ABBR(containingTag: HtmlBodyTag?): HtmlBodyTag(containingTag, "abbr") {
    override val attr = BaseAttributes<ABBR>(this)
}

class ADDRESS(containingTag: HtmlBodyTag?): HtmlBodyTag(containingTag, "address") {
    override val attr = BaseAttributes<ADDRESS>(this)
}

class AREA(containingTag: HtmlBodyTag?): HtmlBodyTag(containingTag, "area") {
    override val attr = BaseAttributes<AREA>(this)
    public var BaseAttributes<AREA>.shape: Shape by Attributes.shape
    public var BaseAttributes<AREA>.alt: String by Attributes.alt
    public var BaseAttributes<AREA>.coords: String by Attributes.coords
    public var BaseAttributes<AREA>.href: Link by Attributes.href
    public var BaseAttributes<AREA>.hreflang: I18LanguageCode by Attributes.hreflang
    public var BaseAttributes<AREA>.media: String by Attributes.media
    public var BaseAttributes<AREA>.ping: String by Attributes.ping
    public var BaseAttributes<AREA>.rel: LinkType by Attributes.rel
    public var BaseAttributes<AREA>.target: BrowsingContext by Attributes.target
    public var BaseAttributes<AREA>.type_: String by Attributes.stringType
}

class ARTICLE(containingTag: HtmlBodyTag?): AllowText, HtmlBodyTag(containingTag, "article") {
    override val attr = BaseAttributes<ARTICLE>(this)
    public var BaseAttributes<ARTICLE>.pubdate: String by Attributes.pubdate
}

class ASIDE(containingTag: HtmlBodyTag?): HtmlBodyTag(containingTag, "aside") {
    override val attr = BaseAttributes<ASIDE>(this)
}

class AUDIO(containingTag: HtmlBodyTag?): AllowText, HtmlBodyTag(containingTag, "audio") {
    override val attr = BaseAttributes<AUDIO>(this)
    public var BaseAttributes<AUDIO>.autobuffer: Boolean by Attributes.autobuffer
    public var BaseAttributes<AUDIO>.autoplay: Boolean by Attributes.autoplay
    public var BaseAttributes<AUDIO>.controls: Boolean by Attributes.controls
    public var BaseAttributes<AUDIO>.loop: Boolean by Attributes.loop
    public var BaseAttributes<AUDIO>.src: Link by Attributes.src
}
    public fun AUDIO.source(id: String? = null, c: StyleClass? = null, contents: SOURCE.() -> Unit = empty_contents): Unit = contentTag(SOURCE(this), c, id, contents)

class B(containingTag: HtmlBodyTag?): HtmlBodyTag(containingTag, "b") {
    override val attr = BaseAttributes<B>(this)
}

class BDI(containingTag: HtmlBodyTag?): HtmlBodyTag(containingTag, "bdi") {
    override val attr = BaseAttributes<BDI>(this)
}

class BDO(containingTag: HtmlBodyTag?): HtmlBodyTag(containingTag, "bdo") {
    override val attr = BaseAttributes<BDO>(this)
}

class BLOCKQUOTE(containingTag: HtmlBodyTag?): AllowText, HtmlBodyTag(containingTag, "blockquote") {
    override val attr = BaseAttributes<BLOCKQUOTE>(this)
    public var BaseAttributes<BLOCKQUOTE>.cite: Link by Attributes.cite
}

class BR(containingTag: HtmlBodyTag?): HtmlBodyTag(containingTag, "br") {
    override val attr = BaseAttributes<BR>(this)
}

class BUTTON(containingTag: HtmlBodyTag?): AllowText, HtmlBodyTag(containingTag, "button") {
    override val attr = BaseAttributes<BUTTON>(this)
    public var BaseAttributes<BUTTON>.autofocus: Boolean by Attributes.autofocus
    public var BaseAttributes<BUTTON>.disabled: Boolean by Attributes.disabled
    public var BaseAttributes<BUTTON>.form: String by Attributes.form
    public var BaseAttributes<BUTTON>.formaction: String by Attributes.formaction
    public var BaseAttributes<BUTTON>.formenctype: Formenctype by Attributes.formenctype
    public var BaseAttributes<BUTTON>.formmethod: Formmethod by Attributes.formmethod
    public var BaseAttributes<BUTTON>.formnovalidate: Boolean by Attributes.formnovalidate
    public var BaseAttributes<BUTTON>.formtarget: BrowsingContext by Attributes.formtarget
    public var BaseAttributes<BUTTON>.name: String by Attributes.stringName
    public var BaseAttributes<BUTTON>.type_: ButtonType by Attributes.buttonType
    public var BaseAttributes<BUTTON>.value: String by Attributes.stringValue
}

class CANVAS(containingTag: HtmlBodyTag?): AllowText, HtmlBodyTag(containingTag, "canvas") {
    override val attr = BaseAttributes<CANVAS>(this)
    public var BaseAttributes<CANVAS>.height: String by Attributes.height
    public var BaseAttributes<CANVAS>.width: String by Attributes.width
}

class CAPTION(containingTag: HtmlBodyTag?): HtmlBodyTag(containingTag, "caption") {
    override val attr = BaseAttributes<CAPTION>(this)
}

class CITE(containingTag: HtmlBodyTag?): HtmlBodyTag(containingTag, "cite") {
    override val attr = BaseAttributes<CITE>(this)
}

class CODE(containingTag: HtmlBodyTag?): HtmlBodyTag(containingTag, "code") {
    override val attr = BaseAttributes<CODE>(this)
}

class COL(containingTag: HtmlBodyTag?): HtmlBodyTag(containingTag, "col") {
    override val attr = BaseAttributes<COL>(this)
    public var BaseAttributes<COL>.span: Int by Attributes.span
}

class COLGROUP(containingTag: HtmlBodyTag?): HtmlBodyTag(containingTag, "colgroup") {
    override val attr = BaseAttributes<COLGROUP>(this)
    public var BaseAttributes<COLGROUP>.span: Int by Attributes.span
}
    public fun COLGROUP.col(id: String? = null, c: StyleClass? = null, contents: COL.() -> Unit = empty_contents): Unit = contentTag(COL(this), c, id, contents)

class COMMAND(containingTag: HtmlBodyTag?): HtmlBodyTag(containingTag, "command") {
    override val attr = BaseAttributes<COMMAND>(this)
    public var BaseAttributes<COMMAND>.checked: Boolean by Attributes.checked
    public var BaseAttributes<COMMAND>.disabled: Boolean by Attributes.disabled
    public var BaseAttributes<COMMAND>.icon: String by Attributes.icon
    public var BaseAttributes<COMMAND>.label: String by Attributes.label
    public var BaseAttributes<COMMAND>.radiogroup: String by Attributes.radiogroup
    public var BaseAttributes<COMMAND>.type_: CommandType by Attributes.commandType
}

class DATALIST(containingTag: HtmlBodyTag?): HtmlBodyTag(containingTag, "datalist") {
    override val attr = BaseAttributes<DATALIST>(this)
}
    public fun DATALIST.option(id: String? = null, c: StyleClass? = null, contents: OPTION.() -> Unit = empty_contents): Unit = contentTag(OPTION(this), c, id, contents)

class DD(containingTag: HtmlBodyTag?): AllowText, HtmlBodyTag(containingTag, "dd") {
    override val attr = BaseAttributes<DD>(this)
}

class DEL(containingTag: HtmlBodyTag?): AllowText, HtmlBodyTag(containingTag, "del") {
    override val attr = BaseAttributes<DEL>(this)
    public var BaseAttributes<DEL>.cite: Link by Attributes.cite
    public var BaseAttributes<DEL>.datetime: String by Attributes.datetime
}

class DETAILS(containingTag: HtmlBodyTag?): AllowText, HtmlBodyTag(containingTag, "details") {
    override val attr = BaseAttributes<DETAILS>(this)
    public var BaseAttributes<DETAILS>.open: Boolean by Attributes.open
}
    public fun DETAILS.legend(id: String? = null, c: StyleClass? = null, contents: LEGEND.() -> Unit = empty_contents): Unit = contentTag(LEGEND(this), c, id, contents)

class DFN(containingTag: HtmlBodyTag?): HtmlBodyTag(containingTag, "dfn") {
    override val attr = BaseAttributes<DFN>(this)
}

class DIALOG(containingTag: HtmlBodyTag?): HtmlBodyTag(containingTag, "dialog") {
    override val attr = BaseAttributes<DIALOG>(this)
}

class DIV(containingTag: HtmlBodyTag?): HtmlBodyTag(containingTag, "div") {
    override val attr = BaseAttributes<DIV>(this)
}

class DL(containingTag: HtmlBodyTag?): HtmlBodyTag(containingTag, "dl") {
    override val attr = BaseAttributes<DL>(this)
}
    public fun DL.dd(id: String? = null, c: StyleClass? = null, contents: DD.() -> Unit = empty_contents): Unit = contentTag(DD(this), c, id, contents)
    public fun DL.dt(id: String? = null, c: StyleClass? = null, contents: DT.() -> Unit = empty_contents): Unit = contentTag(DT(this), c, id, contents)

class DT(containingTag: HtmlBodyTag?): AllowText, HtmlBodyTag(containingTag, "dt") {
    override val attr = BaseAttributes<DT>(this)
}

class EM(containingTag: HtmlBodyTag?): HtmlBodyTag(containingTag, "em") {
    override val attr = BaseAttributes<EM>(this)
}

class EMBED(containingTag: HtmlBodyTag?): HtmlBodyTag(containingTag, "embed") {
    override val attr = BaseAttributes<EMBED>(this)
    public var BaseAttributes<EMBED>.height: String by Attributes.height
    public var BaseAttributes<EMBED>.src: Link by Attributes.src
    public var BaseAttributes<EMBED>.type_: String by Attributes.stringType
    public var BaseAttributes<EMBED>.width: String by Attributes.width
}

class FIELDSET(containingTag: HtmlBodyTag?): AllowText, HtmlBodyTag(containingTag, "fieldset") {
    override val attr = BaseAttributes<FIELDSET>(this)
    public var BaseAttributes<FIELDSET>.disabled: Boolean by Attributes.disabled
    public var BaseAttributes<FIELDSET>.form: String by Attributes.form
    public var BaseAttributes<FIELDSET>.name: String by Attributes.stringName
}
    public fun FIELDSET.legend(id: String? = null, c: StyleClass? = null, contents: LEGEND.() -> Unit = empty_contents): Unit = contentTag(LEGEND(this), c, id, contents)

class FIGURE(containingTag: HtmlBodyTag?): AllowText, HtmlBodyTag(containingTag, "figure") {
    override val attr = BaseAttributes<FIGURE>(this)
}
    public fun FIGURE.legend(id: String? = null, c: StyleClass? = null, contents: LEGEND.() -> Unit = empty_contents): Unit = contentTag(LEGEND(this), c, id, contents)

class FOOTER(containingTag: HtmlBodyTag?): HtmlBodyTag(containingTag, "footer") {
    override val attr = BaseAttributes<FOOTER>(this)
}

class FORM(containingTag: HtmlBodyTag?): AllowText, HtmlBodyTag(containingTag, "form") {
    override val attr = BaseAttributes<FORM>(this)
    public var BaseAttributes<FORM>.accept_charset: String by Attributes.accept_charset
    public var BaseAttributes<FORM>.action: Link by Attributes.action
    public var BaseAttributes<FORM>.autocomplete: Autocomplete by Attributes.autocomplete
    public var BaseAttributes<FORM>.enctype: Enctype by Attributes.enctype
    public var BaseAttributes<FORM>.method: Method by Attributes.method
    public var BaseAttributes<FORM>.name: String by Attributes.stringName
    public var BaseAttributes<FORM>.novalidate: Boolean by Attributes.novalidate
    public var BaseAttributes<FORM>.target: BrowsingContext by Attributes.target
}

class H1(containingTag: HtmlBodyTag?): HtmlBodyTag(containingTag, "h1") {
    override val attr = BaseAttributes<H1>(this)
}

class H2(containingTag: HtmlBodyTag?): HtmlBodyTag(containingTag, "h2") {
    override val attr = BaseAttributes<H2>(this)
}

class H3(containingTag: HtmlBodyTag?): HtmlBodyTag(containingTag, "h3") {
    override val attr = BaseAttributes<H3>(this)
}

class H4(containingTag: HtmlBodyTag?): HtmlBodyTag(containingTag, "h4") {
    override val attr = BaseAttributes<H4>(this)
}

class H5(containingTag: HtmlBodyTag?): HtmlBodyTag(containingTag, "h5") {
    override val attr = BaseAttributes<H5>(this)
}

class H6(containingTag: HtmlBodyTag?): HtmlBodyTag(containingTag, "h6") {
    override val attr = BaseAttributes<H6>(this)
}

class HEADER(containingTag: HtmlBodyTag?): HtmlBodyTag(containingTag, "header") {
    override val attr = BaseAttributes<HEADER>(this)
}

class HGROUP(containingTag: HtmlBodyTag?): HtmlBodyTag(containingTag, "hgroup") {
    override val attr = BaseAttributes<HGROUP>(this)
}
    public fun HGROUP.h1(id: String? = null, c: StyleClass? = null, contents: H1.() -> Unit = empty_contents): Unit = contentTag(H1(this), c, id, contents)
    public fun HGROUP.h2(id: String? = null, c: StyleClass? = null, contents: H2.() -> Unit = empty_contents): Unit = contentTag(H2(this), c, id, contents)
    public fun HGROUP.h3(id: String? = null, c: StyleClass? = null, contents: H3.() -> Unit = empty_contents): Unit = contentTag(H3(this), c, id, contents)
    public fun HGROUP.h4(id: String? = null, c: StyleClass? = null, contents: H4.() -> Unit = empty_contents): Unit = contentTag(H4(this), c, id, contents)
    public fun HGROUP.h5(id: String? = null, c: StyleClass? = null, contents: H5.() -> Unit = empty_contents): Unit = contentTag(H5(this), c, id, contents)
    public fun HGROUP.h6(id: String? = null, c: StyleClass? = null, contents: H6.() -> Unit = empty_contents): Unit = contentTag(H6(this), c, id, contents)

class HR(containingTag: HtmlBodyTag?): HtmlBodyTag(containingTag, "hr") {
    override val attr = BaseAttributes<HR>(this)
}

class I(containingTag: HtmlBodyTag?): HtmlBodyTag(containingTag, "i") {
    override val attr = BaseAttributes<I>(this)
}

class IFRAME(containingTag: HtmlBodyTag?): AllowText, HtmlBodyTag(containingTag, "iframe") {
    override val attr = BaseAttributes<IFRAME>(this)
    public var BaseAttributes<IFRAME>.height: String by Attributes.height
    public var BaseAttributes<IFRAME>.name: BrowsingContext by Attributes.iframeName
    public var BaseAttributes<IFRAME>.sandbox: Sandbox by Attributes.sandbox
    public var BaseAttributes<IFRAME>.seamless: Boolean by Attributes.seamless
    public var BaseAttributes<IFRAME>.src: Link by Attributes.src
    public var BaseAttributes<IFRAME>.width: String by Attributes.width
}

class IMG(containingTag: HtmlBodyTag?): HtmlBodyTag(containingTag, "img") {
    override val attr = BaseAttributes<IMG>(this)
    public var BaseAttributes<IMG>.alt: String by Attributes.alt
    public var BaseAttributes<IMG>.height: String by Attributes.height
    public var BaseAttributes<IMG>.ismap: Boolean by Attributes.ismap
    public var BaseAttributes<IMG>.src: Link by Attributes.src
    public var BaseAttributes<IMG>.usemap: Link by Attributes.usemap
    public var BaseAttributes<IMG>.width: String by Attributes.width
}

class INPUT(containingTag: HtmlBodyTag?): HtmlBodyTag(containingTag, "input") {
    override val attr = BaseAttributes<INPUT>(this)
    public var BaseAttributes<INPUT>.accept: String by Attributes.accept
    public var BaseAttributes<INPUT>.alt: String by Attributes.alt
    public var BaseAttributes<INPUT>.autocomplete: Autocomplete by Attributes.autocomplete
    public var BaseAttributes<INPUT>.checked: Boolean by Attributes.checked
    public var BaseAttributes<INPUT>.disabled: Boolean by Attributes.disabled
    public var BaseAttributes<INPUT>.files: String by Attributes.files
    public var BaseAttributes<INPUT>.form: String by Attributes.form
    public var BaseAttributes<INPUT>.formaction: String by Attributes.formaction
    public var BaseAttributes<INPUT>.formenctype: Formenctype by Attributes.formenctype
    public var BaseAttributes<INPUT>.formmethod: Formmethod by Attributes.formmethod
    public var BaseAttributes<INPUT>.formnovalidate: Boolean by Attributes.formnovalidate
    public var BaseAttributes<INPUT>.formtarget: BrowsingContext by Attributes.formtarget
    public var BaseAttributes<INPUT>.height: String by Attributes.height
    public var BaseAttributes<INPUT>.list: String by Attributes.list
    public var BaseAttributes<INPUT>.max: String by Attributes.stringMax
    public var BaseAttributes<INPUT>.maxlength: String by Attributes.maxlength
    public var BaseAttributes<INPUT>.min: String by Attributes.stringMin
    public var BaseAttributes<INPUT>.multiple: Boolean by Attributes.multiple
    public var BaseAttributes<INPUT>.pattern: String by Attributes.pattern
    public var BaseAttributes<INPUT>.placeholder: String by Attributes.placeholder
    public var BaseAttributes<INPUT>.readonly: Boolean by Attributes.readonly
    public var BaseAttributes<INPUT>.required: Boolean by Attributes.required
    public var BaseAttributes<INPUT>.size: String by Attributes.size
    public var BaseAttributes<INPUT>.src: Link by Attributes.src
    public var BaseAttributes<INPUT>.step: String by Attributes.step
    public var BaseAttributes<INPUT>.type_: InputType by Attributes.inputType
    public var BaseAttributes<INPUT>.value: String by Attributes.stringValue
    public var BaseAttributes<INPUT>.width: String by Attributes.width
}

class INS(containingTag: HtmlBodyTag?): AllowText, HtmlBodyTag(containingTag, "ins") {
    override val attr = BaseAttributes<INS>(this)
    public var BaseAttributes<INS>.cite: Link by Attributes.cite
    public var BaseAttributes<INS>.datetime: String by Attributes.datetime
}

class KBD(containingTag: HtmlBodyTag?): HtmlBodyTag(containingTag, "kbd") {
    override val attr = BaseAttributes<KBD>(this)
}

class KEYGEN(containingTag: HtmlBodyTag?): AllowText, HtmlBodyTag(containingTag, "keygen") {
    override val attr = BaseAttributes<KEYGEN>(this)
    public var BaseAttributes<KEYGEN>.autofocus: Boolean by Attributes.autofocus
    public var BaseAttributes<KEYGEN>.challenge: String by Attributes.challenge
    public var BaseAttributes<KEYGEN>.disabled: Boolean by Attributes.disabled
    public var BaseAttributes<KEYGEN>.form: String by Attributes.form
    public var BaseAttributes<KEYGEN>.keytype: Keytype by Attributes.keytype
    public var BaseAttributes<KEYGEN>.name: String by Attributes.stringName
}

class LABEL(containingTag: HtmlBodyTag?): AllowText, HtmlBodyTag(containingTag, "label") {
    override val attr = BaseAttributes<LABEL>(this)
    public var BaseAttributes<LABEL>.forId: String by Attributes.forId
    public var BaseAttributes<LABEL>.form: String by Attributes.form
}

class LEGEND(containingTag: HtmlBodyTag?): AllowText, HtmlBodyTag(containingTag, "legend") {
    override val attr = BaseAttributes<LEGEND>(this)
}

class LI(containingTag: HtmlBodyTag?): AllowText, HtmlBodyTag(containingTag, "li") {
    override val attr = BaseAttributes<LI>(this)
    public var BaseAttributes<LI>.value: String by Attributes.stringValue
}

class MAP(containingTag: HtmlBodyTag?): HtmlBodyTag(containingTag, "map") {
    override val attr = BaseAttributes<MAP>(this)
    public var BaseAttributes<MAP>.name: String by Attributes.stringName
}

class MARK(containingTag: HtmlBodyTag?): HtmlBodyTag(containingTag, "mark") {
    override val attr = BaseAttributes<MARK>(this)
}

class MATH(containingTag: HtmlBodyTag?): HtmlBodyTag(containingTag, "math") {
    override val attr = BaseAttributes<MATH>(this)
}

class MATHML(containingTag: HtmlBodyTag?): HtmlBodyTag(containingTag, "mathml") {
    override val attr = BaseAttributes<MATHML>(this)
}

class MENU(containingTag: HtmlBodyTag?): HtmlBodyTag(containingTag, "menu") {
    override val attr = BaseAttributes<MENU>(this)
    public var BaseAttributes<MENU>.label: String by Attributes.label
    public var BaseAttributes<MENU>.type_: MenuType by Attributes.menuType
}
    public fun MENU.li(id: String? = null, c: StyleClass? = null, contents: LI.() -> Unit = empty_contents): Unit = contentTag(LI(this), c, id, contents)

class METER(containingTag: HtmlBodyTag?): AllowText, HtmlBodyTag(containingTag, "meter") {
    override val attr = BaseAttributes<METER>(this)
    public var BaseAttributes<METER>.high: Float by Attributes.high
    public var BaseAttributes<METER>.low: Float by Attributes.low
    public var BaseAttributes<METER>.max: Float by Attributes.floatMax
    public var BaseAttributes<METER>.min: Float by Attributes.floatMin
    public var BaseAttributes<METER>.optimum: Float by Attributes.optimum
    public var BaseAttributes<METER>.value: Float by Attributes.floatValue
}

class NAV(containingTag: HtmlBodyTag?): HtmlBodyTag(containingTag, "nav") {
    override val attr = BaseAttributes<NAV>(this)
}

class OBJECT_(containingTag: HtmlBodyTag?): AllowText, HtmlBodyTag(containingTag, "object") {
    override val attr = BaseAttributes<OBJECT_>(this)
    public var BaseAttributes<OBJECT_>.classid: String by Attributes.classid
    public var BaseAttributes<OBJECT_>.data: Link by Attributes.data
    public var BaseAttributes<OBJECT_>.form: String by Attributes.form
    public var BaseAttributes<OBJECT_>.height: String by Attributes.height
    public var BaseAttributes<OBJECT_>.name: BrowsingContext by Attributes.iframeName
    public var BaseAttributes<OBJECT_>.type_: String by Attributes.stringType
    public var BaseAttributes<OBJECT_>.usemap: Link by Attributes.usemap
    public var BaseAttributes<OBJECT_>.width: String by Attributes.width
}
    public fun OBJECT_.param(id: String? = null, c: StyleClass? = null, contents: PARAM.() -> Unit = empty_contents): Unit = contentTag(PARAM(this), c, id, contents)

class OL(containingTag: HtmlBodyTag?): HtmlBodyTag(containingTag, "ol") {
    override val attr = BaseAttributes<OL>(this)
    public var BaseAttributes<OL>.reversed: Boolean by Attributes.reversed
    public var BaseAttributes<OL>.start: String by Attributes.start
}
    public fun OL.li(id: String? = null, c: StyleClass? = null, contents: LI.() -> Unit = empty_contents): Unit = contentTag(LI(this), c, id, contents)

class OPTGROUP(containingTag: HtmlBodyTag?): HtmlBodyTag(containingTag, "optgroup") {
    override val attr = BaseAttributes<OPTGROUP>(this)
    public var BaseAttributes<OPTGROUP>.disabled: Boolean by Attributes.disabled
    public var BaseAttributes<OPTGROUP>.label: String by Attributes.label
}
    public fun OPTGROUP.option(id: String? = null, c: StyleClass? = null, contents: OPTION.() -> Unit = empty_contents): Unit = contentTag(OPTION(this), c, id, contents)

class OPTION(containingTag: HtmlBodyTag?): AllowText, HtmlBodyTag(containingTag, "option") {
    override val attr = BaseAttributes<OPTION>(this)
    public var BaseAttributes<OPTION>.disabled: Boolean by Attributes.disabled
    public var BaseAttributes<OPTION>.label: String by Attributes.label
    public var BaseAttributes<OPTION>.selected: Boolean by Attributes.selected
    public var BaseAttributes<OPTION>.value: String by Attributes.stringValue
}

class OUTPUT(containingTag: HtmlBodyTag?): AllowText, HtmlBodyTag(containingTag, "output") {
    override val attr = BaseAttributes<OUTPUT>(this)
    public var BaseAttributes<OUTPUT>.forId: String by Attributes.forId
    public var BaseAttributes<OUTPUT>.form: String by Attributes.form
    public var BaseAttributes<OUTPUT>.name: String by Attributes.stringName
}

class P(containingTag: HtmlBodyTag?): HtmlBodyTag(containingTag, "p") {
    override val attr = BaseAttributes<P>(this)
}

class PARAM(containingTag: HtmlBodyTag?): HtmlBodyTag(containingTag, "param") {
    override val attr = BaseAttributes<PARAM>(this)
    public var BaseAttributes<PARAM>.name: String by Attributes.stringName
    public var BaseAttributes<PARAM>.value: String by Attributes.stringValue
}

class PRE(containingTag: HtmlBodyTag?): HtmlBodyTag(containingTag, "pre") {
    override val attr = BaseAttributes<PRE>(this)
}

class PROGRESS(containingTag: HtmlBodyTag?): AllowText, HtmlBodyTag(containingTag, "progress") {
    override val attr = BaseAttributes<PROGRESS>(this)
    public var BaseAttributes<PROGRESS>.max: Float by Attributes.floatMax
    public var BaseAttributes<PROGRESS>.value: Float by Attributes.floatValue
}

class Q(containingTag: HtmlBodyTag?): AllowText, HtmlBodyTag(containingTag, "q") {
    override val attr = BaseAttributes<Q>(this)
    public var BaseAttributes<Q>.cite: Link by Attributes.cite
}

class RP(containingTag: HtmlBodyTag?): HtmlBodyTag(containingTag, "rp") {
    override val attr = BaseAttributes<RP>(this)
}

class RT(containingTag: HtmlBodyTag?): HtmlBodyTag(containingTag, "rt") {
    override val attr = BaseAttributes<RT>(this)
}

class RUBY(containingTag: HtmlBodyTag?): AllowText, HtmlBodyTag(containingTag, "ruby") {
    override val attr = BaseAttributes<RUBY>(this)
}
    public fun RUBY.rp(id: String? = null, c: StyleClass? = null, contents: RP.() -> Unit = empty_contents): Unit = contentTag(RP(this), c, id, contents)
    public fun RUBY.rt(id: String? = null, c: StyleClass? = null, contents: RT.() -> Unit = empty_contents): Unit = contentTag(RT(this), c, id, contents)

class SAMP(containingTag: HtmlBodyTag?): HtmlBodyTag(containingTag, "samp") {
    override val attr = BaseAttributes<SAMP>(this)
}

class SECTION(containingTag: HtmlBodyTag?): HtmlBodyTag(containingTag, "section") {
    override val attr = BaseAttributes<SECTION>(this)
}

class SELECT(containingTag: HtmlBodyTag?): HtmlBodyTag(containingTag, "select") {
    override val attr = BaseAttributes<SELECT>(this)
    public var BaseAttributes<SELECT>.autofocus: Boolean by Attributes.autofocus
    public var BaseAttributes<SELECT>.disabled: Boolean by Attributes.disabled
    public var BaseAttributes<SELECT>.form: String by Attributes.form
    public var BaseAttributes<SELECT>.multiple: Boolean by Attributes.multiple
    public var BaseAttributes<SELECT>.name: String by Attributes.stringName
    public var BaseAttributes<SELECT>.size: String by Attributes.size
}
    public fun SELECT.optgroup(id: String? = null, c: StyleClass? = null, contents: OPTGROUP.() -> Unit = empty_contents): Unit = contentTag(OPTGROUP(this), c, id, contents)
    public fun SELECT.option(id: String? = null, c: StyleClass? = null, contents: OPTION.() -> Unit = empty_contents): Unit = contentTag(OPTION(this), c, id, contents)

class SMALL(containingTag: HtmlBodyTag?): HtmlBodyTag(containingTag, "small") {
    override val attr = BaseAttributes<SMALL>(this)
}

class SOURCE(containingTag: HtmlBodyTag?): HtmlBodyTag(containingTag, "source") {
    override val attr = BaseAttributes<SOURCE>(this)
    public var BaseAttributes<SOURCE>.media: String by Attributes.media
    public var BaseAttributes<SOURCE>.src: Link by Attributes.src
    public var BaseAttributes<SOURCE>.type_: String by Attributes.stringType
}

class SPAN(containingTag: HtmlBodyTag?): HtmlBodyTag(containingTag, "span") {
    override val attr = BaseAttributes<SPAN>(this)
}

class STRONG(containingTag: HtmlBodyTag?): HtmlBodyTag(containingTag, "strong") {
    override val attr = BaseAttributes<STRONG>(this)
}

class SUB(containingTag: HtmlBodyTag?): HtmlBodyTag(containingTag, "sub") {
    override val attr = BaseAttributes<SUB>(this)
}

class SUP(containingTag: HtmlBodyTag?): HtmlBodyTag(containingTag, "sup") {
    override val attr = BaseAttributes<SUP>(this)
}

class SVG(containingTag: HtmlBodyTag?): HtmlBodyTag(containingTag, "svg") {
    override val attr = BaseAttributes<SVG>(this)
}

class TABLE(containingTag: HtmlBodyTag?): HtmlBodyTag(containingTag, "table") {
    override val attr = BaseAttributes<TABLE>(this)
    public var BaseAttributes<TABLE>.summary: String by Attributes.summary
}
    public fun TABLE.caption(id: String? = null, c: StyleClass? = null, contents: CAPTION.() -> Unit = empty_contents): Unit = contentTag(CAPTION(this), c, id, contents)
    public fun TABLE.colgroup(id: String? = null, c: StyleClass? = null, contents: COLGROUP.() -> Unit = empty_contents): Unit = contentTag(COLGROUP(this), c, id, contents)
    public fun TABLE.tbody(id: String? = null, c: StyleClass? = null, contents: TBODY.() -> Unit = empty_contents): Unit = contentTag(TBODY(this), c, id, contents)
    public fun TABLE.tfoot(id: String? = null, c: StyleClass? = null, contents: TFOOT.() -> Unit = empty_contents): Unit = contentTag(TFOOT(this), c, id, contents)
    public fun TABLE.thead(id: String? = null, c: StyleClass? = null, contents: THEAD.() -> Unit = empty_contents): Unit = contentTag(THEAD(this), c, id, contents)
    public fun TABLE.tr(id: String? = null, c: StyleClass? = null, contents: TR.() -> Unit = empty_contents): Unit = contentTag(TR(this), c, id, contents)

class TBODY(containingTag: HtmlBodyTag?): HtmlBodyTag(containingTag, "tbody") {
    override val attr = BaseAttributes<TBODY>(this)
}
    public fun TBODY.tr(id: String? = null, c: StyleClass? = null, contents: TR.() -> Unit = empty_contents): Unit = contentTag(TR(this), c, id, contents)

class TD(containingTag: HtmlBodyTag?): AllowText, HtmlBodyTag(containingTag, "td") {
    override val attr = BaseAttributes<TD>(this)
    public var BaseAttributes<TD>.colspan: Int by Attributes.colspan
    public var BaseAttributes<TD>.headers: String by Attributes.headers
    public var BaseAttributes<TD>.rowspan: Int by Attributes.rowspan
}

class TEXTAREA(containingTag: HtmlBodyTag?): AllowText, HtmlBodyTag(containingTag, "textarea") {
    override val attr = BaseAttributes<TEXTAREA>(this)
    public var BaseAttributes<TEXTAREA>.autofocus: Boolean by Attributes.autofocus
    public var BaseAttributes<TEXTAREA>.cols: Int by Attributes.cols
    public var BaseAttributes<TEXTAREA>.disabled: Boolean by Attributes.disabled
    public var BaseAttributes<TEXTAREA>.form: String by Attributes.form
    public var BaseAttributes<TEXTAREA>.maxlength: String by Attributes.maxlength
    public var BaseAttributes<TEXTAREA>.name: String by Attributes.stringName
    public var BaseAttributes<TEXTAREA>.placeholder: String by Attributes.placeholder
    public var BaseAttributes<TEXTAREA>.readonly: Boolean by Attributes.readonly
    public var BaseAttributes<TEXTAREA>.required: Boolean by Attributes.required
    public var BaseAttributes<TEXTAREA>.rows: Int by Attributes.rows
    public var BaseAttributes<TEXTAREA>.wrap: Wrap by Attributes.wrap
}

class TFOOT(containingTag: HtmlBodyTag?): HtmlBodyTag(containingTag, "tfoot") {
    override val attr = BaseAttributes<TFOOT>(this)
}
    public fun TFOOT.tr(id: String? = null, c: StyleClass? = null, contents: TR.() -> Unit = empty_contents): Unit = contentTag(TR(this), c, id, contents)

class TH(containingTag: HtmlBodyTag?): AllowText, HtmlBodyTag(containingTag, "th") {
    override val attr = BaseAttributes<TH>(this)
    public var BaseAttributes<TH>.colspan: Int by Attributes.colspan
    public var BaseAttributes<TH>.headers: String by Attributes.headers
    public var BaseAttributes<TH>.rowspan: Int by Attributes.rowspan
    public var BaseAttributes<TH>.scope: Scope by Attributes.scope
}

class THEAD(containingTag: HtmlBodyTag?): HtmlBodyTag(containingTag, "thead") {
    override val attr = BaseAttributes<THEAD>(this)
}
    public fun THEAD.tr(id: String? = null, c: StyleClass? = null, contents: TR.() -> Unit = empty_contents): Unit = contentTag(TR(this), c, id, contents)

class TIME(containingTag: HtmlBodyTag?): AllowText, HtmlBodyTag(containingTag, "time") {
    override val attr = BaseAttributes<TIME>(this)
    public var BaseAttributes<TIME>.datetime: String by Attributes.datetime
}

class TR(containingTag: HtmlBodyTag?): HtmlBodyTag(containingTag, "tr") {
    override val attr = BaseAttributes<TR>(this)
}
    public fun TR.td(id: String? = null, c: StyleClass? = null, contents: TD.() -> Unit = empty_contents): Unit = contentTag(TD(this), c, id, contents)
    public fun TR.th(id: String? = null, c: StyleClass? = null, contents: TH.() -> Unit = empty_contents): Unit = contentTag(TH(this), c, id, contents)

class UL(containingTag: HtmlBodyTag?): HtmlBodyTag(containingTag, "ul") {
    override val attr = BaseAttributes<UL>(this)
}
    public fun UL.li(id: String? = null, c: StyleClass? = null, contents: LI.() -> Unit = empty_contents): Unit = contentTag(LI(this), c, id, contents)

class VAR_(containingTag: HtmlBodyTag?): HtmlBodyTag(containingTag, "var") {
    override val attr = BaseAttributes<VAR_>(this)
}

class VIDEO(containingTag: HtmlBodyTag?): AllowText, HtmlBodyTag(containingTag, "video") {
    override val attr = BaseAttributes<VIDEO>(this)
    public var BaseAttributes<VIDEO>.autobuffer: Boolean by Attributes.autobuffer
    public var BaseAttributes<VIDEO>.autoplay: Boolean by Attributes.autoplay
    public var BaseAttributes<VIDEO>.controls: Boolean by Attributes.controls
    public var BaseAttributes<VIDEO>.height: String by Attributes.height
    public var BaseAttributes<VIDEO>.loop: Boolean by Attributes.loop
    public var BaseAttributes<VIDEO>.poster: String by Attributes.poster
    public var BaseAttributes<VIDEO>.src: Link by Attributes.src
    public var BaseAttributes<VIDEO>.width: String by Attributes.width
}
    public fun VIDEO.source(id: String? = null, c: StyleClass? = null, contents: SOURCE.() -> Unit = empty_contents): Unit = contentTag(SOURCE(this), c, id, contents)


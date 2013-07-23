
package kotlin.html

class A(tag: Tag<*>) : TagType(tag), CommonAllow
    public var A.href: Link by Attributes.href
    public var A.hreflang: I18LanguageCode by Attributes.hreflang
    public var A.ping: String by Attributes.ping
    public var A.rel: LinkType by Attributes.rel
    public var A.target: BrowsingContext by Attributes.target
    public var A.type_: ContentType by Attributes.aType

class ABBR(tag: Tag<*>) : TagType(tag), CommonAllow

class ADDRESS(tag: Tag<*>) : TagType(tag), CommonAllow

class AREA(tag: Tag<*>) : TagType(tag)
    public var AREA.shape: Shape by Attributes.shape
    public var AREA.alt: String by Attributes.alt
    public var AREA.coords: String by Attributes.coords
    public var AREA.href: Link by Attributes.href
    public var AREA.hreflang: I18LanguageCode by Attributes.hreflang
    public var AREA.media: String by Attributes.media
    public var AREA.ping: String by Attributes.ping
    public var AREA.rel: LinkType by Attributes.rel
    public var AREA.target: BrowsingContext by Attributes.target
    public var AREA.type_: String by Attributes.stringType

class ARTICLE(tag: Tag<*>) : TagType(tag), CommonAllow
    public var ARTICLE.pubdate: String by Attributes.pubdate

class ASIDE(tag: Tag<*>) : TagType(tag), CommonAllow

class AUDIO(tag: Tag<*>) : TagType(tag), AllowSOURCE
    public var AUDIO.autobuffer: Boolean by Attributes.autobuffer
    public var AUDIO.autoplay: Boolean by Attributes.autoplay
    public var AUDIO.controls: Boolean by Attributes.controls
    public var AUDIO.loop: Boolean by Attributes.loop
    public var AUDIO.src: Link by Attributes.src

class B(tag: Tag<*>) : TagType(tag), CommonAllow

class BDI(tag: Tag<*>) : TagType(tag), CommonAllow

class BDO(tag: Tag<*>) : TagType(tag), CommonAllow

class BLOCKQUOTE(tag: Tag<*>) : TagType(tag), CommonAllow
    public var BLOCKQUOTE.cite: Link by Attributes.cite

class BR(tag: Tag<*>) : TagType(tag)

class BUTTON(tag: Tag<*>) : TagType(tag), CommonAllow
    public var BUTTON.autofocus: Boolean by Attributes.autofocus
    public var BUTTON.disabled: Boolean by Attributes.disabled
    public var BUTTON.form: String by Attributes.form
    public var BUTTON.formaction: String by Attributes.formaction
    public var BUTTON.formenctype: Formenctype by Attributes.formenctype
    public var BUTTON.formmethod: Formmethod by Attributes.formmethod
    public var BUTTON.formnovalidate: Boolean by Attributes.formnovalidate
    public var BUTTON.formtarget: BrowsingContext by Attributes.formtarget
    public var BUTTON.name: String by Attributes.stringName
    public var BUTTON.type_: ButtonType by Attributes.buttonType
    public var BUTTON.value: String by Attributes.stringValue

class CANVAS(tag: Tag<*>) : TagType(tag)
    public var CANVAS.height: String by Attributes.height
    public var CANVAS.width: String by Attributes.width

class CAPTION(tag: Tag<*>) : TagType(tag), CommonAllow

class CITE(tag: Tag<*>) : TagType(tag), CommonAllow

class CODE(tag: Tag<*>) : TagType(tag), CommonAllow

class COL(tag: Tag<*>) : TagType(tag)
    public var COL.span: Int by Attributes.span

class COLGROUP(tag: Tag<*>) : TagType(tag), AllowCOL
    public var COLGROUP.span: Int by Attributes.span

class COMMAND(tag: Tag<*>) : TagType(tag)
    public var COMMAND.checked: Boolean by Attributes.checked
    public var COMMAND.disabled: Boolean by Attributes.disabled
    public var COMMAND.icon: String by Attributes.icon
    public var COMMAND.label: String by Attributes.label
    public var COMMAND.radiogroup: String by Attributes.radiogroup
    public var COMMAND.type_: CommandType by Attributes.commandType

class DATALIST(tag: Tag<*>) : TagType(tag), CommonAllow, AllowOPTION

class DD(tag: Tag<*>) : TagType(tag), CommonAllow

class DEL(tag: Tag<*>) : TagType(tag), CommonAllow
    public var DEL.cite: Link by Attributes.cite
    public var DEL.datetime: String by Attributes.datetime

class DETAILS(tag: Tag<*>) : TagType(tag), CommonAllow, AllowLEGEND
    public var DETAILS.open: Boolean by Attributes.open

class DFN(tag: Tag<*>) : TagType(tag), CommonAllow

class DIALOG(tag: Tag<*>) : TagType(tag), CommonAllow

class DIV(tag: Tag<*>) : TagType(tag), CommonAllow

class DL(tag: Tag<*>) : TagType(tag), AllowDD, AllowDT

class DT(tag: Tag<*>) : TagType(tag), CommonAllow

class EM(tag: Tag<*>) : TagType(tag), CommonAllow

class EMBED(tag: Tag<*>) : TagType(tag)
    public var EMBED.height: String by Attributes.height
    public var EMBED.src: Link by Attributes.src
    public var EMBED.type_: String by Attributes.stringType
    public var EMBED.width: String by Attributes.width

class FIELDSET(tag: Tag<*>) : TagType(tag), CommonAllow, AllowLEGEND
    public var FIELDSET.disabled: Boolean by Attributes.disabled
    public var FIELDSET.form: String by Attributes.form
    public var FIELDSET.name: String by Attributes.stringName

class FIGURE(tag: Tag<*>) : TagType(tag), CommonAllow, AllowLEGEND

class FOOTER(tag: Tag<*>) : TagType(tag), CommonAllow

class FORM(tag: Tag<*>) : TagType(tag), CommonAllow
    public var FORM.accept_charset: String by Attributes.accept_charset
    public var FORM.action: Link by Attributes.action
    public var FORM.autocomplete: Autocomplete by Attributes.autocomplete
    public var FORM.enctype: Enctype by Attributes.enctype
    public var FORM.method: Method by Attributes.method
    public var FORM.name: String by Attributes.stringName
    public var FORM.novalidate: Boolean by Attributes.novalidate
    public var FORM.target: BrowsingContext by Attributes.target

class H1(tag: Tag<*>) : TagType(tag), CommonAllow

class H2(tag: Tag<*>) : TagType(tag), CommonAllow

class H3(tag: Tag<*>) : TagType(tag), CommonAllow

class H4(tag: Tag<*>) : TagType(tag), CommonAllow

class H5(tag: Tag<*>) : TagType(tag), CommonAllow

class H6(tag: Tag<*>) : TagType(tag), CommonAllow

class HEADER(tag: Tag<*>) : TagType(tag), CommonAllow

class HGROUP(tag: Tag<*>) : TagType(tag), AllowH1, AllowH2, AllowH3, AllowH4, AllowH5, AllowH6

class HR(tag: Tag<*>) : TagType(tag)

class I(tag: Tag<*>) : TagType(tag), CommonAllow

class IFRAME(tag: Tag<*>) : TagType(tag)
    public var IFRAME.height: String by Attributes.height
    public var IFRAME.name: BrowsingContext by Attributes.iframeName
    public var IFRAME.sandbox: Sandbox by Attributes.sandbox
    public var IFRAME.seamless: Boolean by Attributes.seamless
    public var IFRAME.src: Link by Attributes.src
    public var IFRAME.width: String by Attributes.width

class IMG(tag: Tag<*>) : TagType(tag)
    public var IMG.alt: String by Attributes.alt
    public var IMG.height: String by Attributes.height
    public var IMG.ismap: Boolean by Attributes.ismap
    public var IMG.src: Link by Attributes.src
    public var IMG.usemap: Link by Attributes.usemap
    public var IMG.width: String by Attributes.width

class INPUT(tag: Tag<*>) : TagType(tag)
    public var INPUT.accept: String by Attributes.accept
    public var INPUT.alt: String by Attributes.alt
    public var INPUT.autocomplete: Autocomplete by Attributes.autocomplete
    public var INPUT.checked: Boolean by Attributes.checked
    public var INPUT.disabled: Boolean by Attributes.disabled
    public var INPUT.files: String by Attributes.files
    public var INPUT.form: String by Attributes.form
    public var INPUT.formaction: String by Attributes.formaction
    public var INPUT.formenctype: Formenctype by Attributes.formenctype
    public var INPUT.formmethod: Formmethod by Attributes.formmethod
    public var INPUT.formnovalidate: Boolean by Attributes.formnovalidate
    public var INPUT.formtarget: BrowsingContext by Attributes.formtarget
    public var INPUT.height: String by Attributes.height
    public var INPUT.list: String by Attributes.list
    public var INPUT.max: String by Attributes.stringMax
    public var INPUT.maxlength: String by Attributes.maxlength
    public var INPUT.min: String by Attributes.stringMin
    public var INPUT.multiple: Boolean by Attributes.multiple
    public var INPUT.name: String by Attributes.stringName
    public var INPUT.pattern: String by Attributes.pattern
    public var INPUT.placeholder: String by Attributes.placeholder
    public var INPUT.readonly: Boolean by Attributes.readonly
    public var INPUT.required: Boolean by Attributes.required
    public var INPUT.size: String by Attributes.size
    public var INPUT.src: Link by Attributes.src
    public var INPUT.step: String by Attributes.step
    public var INPUT.type_: InputType by Attributes.inputType
    public var INPUT.value: String by Attributes.stringValue
    public var INPUT.width: String by Attributes.width

class INS(tag: Tag<*>) : TagType(tag), CommonAllow
    public var INS.cite: Link by Attributes.cite
    public var INS.datetime: String by Attributes.datetime

class KBD(tag: Tag<*>) : TagType(tag), CommonAllow

class KEYGEN(tag: Tag<*>) : TagType(tag)
    public var KEYGEN.autofocus: Boolean by Attributes.autofocus
    public var KEYGEN.challenge: String by Attributes.challenge
    public var KEYGEN.disabled: Boolean by Attributes.disabled
    public var KEYGEN.form: String by Attributes.form
    public var KEYGEN.keytype: Keytype by Attributes.keytype
    public var KEYGEN.name: String by Attributes.stringName

class LABEL(tag: Tag<*>) : TagType(tag), CommonAllow
    public var LABEL.forId: String by Attributes.forId
    public var LABEL.form: String by Attributes.form

class LEGEND(tag: Tag<*>) : TagType(tag), CommonAllow

class LI(tag: Tag<*>) : TagType(tag), CommonAllow
    public var LI.value: String by Attributes.stringValue

class MAP(tag: Tag<*>) : TagType(tag), CommonAllow
    public var MAP.name: String by Attributes.stringName

class MARK(tag: Tag<*>) : TagType(tag), CommonAllow

class MATH(tag: Tag<*>) : TagType(tag), CommonAllow

class MATHML(tag: Tag<*>) : TagType(tag)

class MENU(tag: Tag<*>) : TagType(tag), CommonAllow, AllowLI
    public var MENU.label: String by Attributes.label
    public var MENU.type_: MenuType by Attributes.menuType

class METER(tag: Tag<*>) : TagType(tag), CommonAllow
    public var METER.high: Float by Attributes.high
    public var METER.low: Float by Attributes.low
    public var METER.max: Float by Attributes.floatMax
    public var METER.min: Float by Attributes.floatMin
    public var METER.optimum: Float by Attributes.optimum
    public var METER.value: Float by Attributes.floatValue

class NAV(tag: Tag<*>) : TagType(tag), CommonAllow

class OBJECT_(tag: Tag<*>) : TagType(tag), AllowPARAM
    public var OBJECT_.classid: String by Attributes.classid
    public var OBJECT_.data: Link by Attributes.data
    public var OBJECT_.form: String by Attributes.form
    public var OBJECT_.height: String by Attributes.height
    public var OBJECT_.name: BrowsingContext by Attributes.iframeName
    public var OBJECT_.type_: String by Attributes.stringType
    public var OBJECT_.usemap: Link by Attributes.usemap
    public var OBJECT_.width: String by Attributes.width

class OL(tag: Tag<*>) : TagType(tag), AllowLI
    public var OL.reversed: Boolean by Attributes.reversed
    public var OL.start: String by Attributes.start

class OPTGROUP(tag: Tag<*>) : TagType(tag), AllowOPTION
    public var OPTGROUP.disabled: Boolean by Attributes.disabled
    public var OPTGROUP.label: String by Attributes.label

class OPTION(tag: Tag<*>) : TagType(tag)
    public var OPTION.disabled: Boolean by Attributes.disabled
    public var OPTION.label: String by Attributes.label
    public var OPTION.selected: Boolean by Attributes.selected
    public var OPTION.value: String by Attributes.stringValue

class OUTPUT(tag: Tag<*>) : TagType(tag), CommonAllow
    public var OUTPUT.forId: String by Attributes.forId
    public var OUTPUT.form: String by Attributes.form
    public var OUTPUT.name: String by Attributes.stringName

class P(tag: Tag<*>) : TagType(tag), CommonAllow

class PARAM(tag: Tag<*>) : TagType(tag)
    public var PARAM.name: String by Attributes.stringName
    public var PARAM.value: String by Attributes.stringValue

class PRE(tag: Tag<*>) : TagType(tag), CommonAllow

class PROGRESS(tag: Tag<*>) : TagType(tag), CommonAllow
    public var PROGRESS.max: Float by Attributes.floatMax
    public var PROGRESS.value: Float by Attributes.floatValue

class Q(tag: Tag<*>) : TagType(tag), CommonAllow
    public var Q.cite: Link by Attributes.cite

class RP(tag: Tag<*>) : TagType(tag), CommonAllow

class RT(tag: Tag<*>) : TagType(tag), CommonAllow

class RUBY(tag: Tag<*>) : TagType(tag), CommonAllow, AllowRP, AllowRT

class SAMP(tag: Tag<*>) : TagType(tag), CommonAllow

class SECTION(tag: Tag<*>) : TagType(tag), CommonAllow

class SELECT(tag: Tag<*>) : TagType(tag), AllowOPTGROUP, AllowOPTION
    public var SELECT.autofocus: Boolean by Attributes.autofocus
    public var SELECT.disabled: Boolean by Attributes.disabled
    public var SELECT.form: String by Attributes.form
    public var SELECT.multiple: Boolean by Attributes.multiple
    public var SELECT.name: String by Attributes.stringName
    public var SELECT.size: String by Attributes.size

class SMALL(tag: Tag<*>) : TagType(tag), CommonAllow

class SOURCE(tag: Tag<*>) : TagType(tag)
    public var SOURCE.media: String by Attributes.media
    public var SOURCE.src: Link by Attributes.src
    public var SOURCE.type_: String by Attributes.stringType

class SPAN(tag: Tag<*>) : TagType(tag), CommonAllow

class STRONG(tag: Tag<*>) : TagType(tag), CommonAllow

class SUB(tag: Tag<*>) : TagType(tag), CommonAllow

class SUP(tag: Tag<*>) : TagType(tag), CommonAllow

class SVG(tag: Tag<*>) : TagType(tag)

class TABLE(tag: Tag<*>) : TagType(tag), AllowCAPTION, AllowCOLGROUP, AllowTBODY, AllowTFOOT, AllowTHEAD, AllowTR
    public var TABLE.summary: String by Attributes.summary

class TBODY(tag: Tag<*>) : TagType(tag), AllowTR

class TD(tag: Tag<*>) : TagType(tag), CommonAllow
    public var TD.colspan: Int by Attributes.colspan
    public var TD.headers: String by Attributes.headers
    public var TD.rowspan: Int by Attributes.rowspan

class TEXTAREA(tag: Tag<*>) : TagType(tag)
    public var TEXTAREA.autofocus: Boolean by Attributes.autofocus
    public var TEXTAREA.cols: Int by Attributes.cols
    public var TEXTAREA.disabled: Boolean by Attributes.disabled
    public var TEXTAREA.form: String by Attributes.form
    public var TEXTAREA.maxlength: String by Attributes.maxlength
    public var TEXTAREA.name: String by Attributes.stringName
    public var TEXTAREA.placeholder: String by Attributes.placeholder
    public var TEXTAREA.readonly: Boolean by Attributes.readonly
    public var TEXTAREA.required: Boolean by Attributes.required
    public var TEXTAREA.rows: Int by Attributes.rows
    public var TEXTAREA.wrap: Wrap by Attributes.wrap

class TFOOT(tag: Tag<*>) : TagType(tag), AllowTR

class TH(tag: Tag<*>) : TagType(tag), CommonAllow
    public var TH.colspan: Int by Attributes.colspan
    public var TH.headers: String by Attributes.headers
    public var TH.rowspan: Int by Attributes.rowspan
    public var TH.scope: Scope by Attributes.scope

class THEAD(tag: Tag<*>) : TagType(tag), AllowTR

class TIME(tag: Tag<*>) : TagType(tag), CommonAllow
    public var TIME.datetime: String by Attributes.datetime

class TR(tag: Tag<*>) : TagType(tag), AllowTD, AllowTH

class UL(tag: Tag<*>) : TagType(tag), AllowLI

class VAR_(tag: Tag<*>) : TagType(tag), CommonAllow

class VIDEO(tag: Tag<*>) : TagType(tag), AllowSOURCE
    public var VIDEO.autobuffer: Boolean by Attributes.autobuffer
    public var VIDEO.autoplay: Boolean by Attributes.autoplay
    public var VIDEO.controls: Boolean by Attributes.controls
    public var VIDEO.height: String by Attributes.height
    public var VIDEO.loop: Boolean by Attributes.loop
    public var VIDEO.poster: String by Attributes.poster
    public var VIDEO.src: Link by Attributes.src
    public var VIDEO.width: String by Attributes.width


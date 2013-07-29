
package kotlin.html

class A : TagType(), CommonBodyContent
    public var A.href: Link by Attributes.href
    public var A.hreflang: I18LanguageCode by Attributes.hreflang
    public var A.ping: String by Attributes.ping
    public var A.rel: LinkType by Attributes.rel
    public var A.target: BrowsingContext by Attributes.target
    public var A.type_: ContentType by Attributes.aType

class ABBR : TagType(), CommonBodyContent

class ADDRESS : TagType(), CommonBodyContent

class AREA : TagType(), TagWithoutText
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

class ARTICLE : TagType(), CommonBodyContent
    public var ARTICLE.pubdate: String by Attributes.pubdate

class ASIDE : TagType(), CommonBodyContent

class B : TagType(), CommonBodyContent

class BDI : TagType(), CommonBodyContent

class BDO : TagType(), CommonBodyContent

class BLOCKQUOTE : TagType(), CommonBodyContent
    public var BLOCKQUOTE.cite: Link by Attributes.cite

class BR : TagType(), TagWithoutText

class BUTTON : TagType(), CommonBodyContent
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

class CANVAS : TagType()
    public var CANVAS.height: String by Attributes.height
    public var CANVAS.width: String by Attributes.width

class CITE : TagType(), CommonBodyContent

class CODE : TagType(), CommonBodyContent

class COMMAND : TagType(), TagWithoutText
    public var COMMAND.checked: Boolean by Attributes.checked
    public var COMMAND.disabled: Boolean by Attributes.disabled
    public var COMMAND.icon: String by Attributes.icon
    public var COMMAND.label: String by Attributes.label
    public var COMMAND.radiogroup: String by Attributes.radiogroup
    public var COMMAND.type_: CommandType by Attributes.commandType

class DEL : TagType(), CommonBodyContent
    public var DEL.cite: Link by Attributes.cite
    public var DEL.datetime: String by Attributes.datetime

class DFN : TagType(), CommonBodyContent

class DIALOG : TagType(), CommonBodyContent, TagWithoutText

class DIV : TagType(), CommonBodyContent

class EM : TagType(), CommonBodyContent

class EMBED : TagType(), TagWithoutText
    public var EMBED.height: String by Attributes.height
    public var EMBED.src: Link by Attributes.src
    public var EMBED.type_: String by Attributes.stringType
    public var EMBED.width: String by Attributes.width

class FOOTER : TagType(), CommonBodyContent

class FORM : TagType(), CommonBodyContent
    public var FORM.accept_charset: String by Attributes.accept_charset
    public var FORM.action: Link by Attributes.action
    public var FORM.autocomplete: Autocomplete by Attributes.autocomplete
    public var FORM.enctype: Enctype by Attributes.enctype
    public var FORM.method: Method by Attributes.method
    public var FORM.name: String by Attributes.stringName
    public var FORM.novalidate: Boolean by Attributes.novalidate
    public var FORM.target: BrowsingContext by Attributes.target

class HEADER : TagType(), CommonBodyContent

class HR : TagType(), TagWithoutText

class I : TagType(), CommonBodyContent

class IFRAME : TagType()
    public var IFRAME.height: String by Attributes.height
    public var IFRAME.name: BrowsingContext by Attributes.iframeName
    public var IFRAME.sandbox: Sandbox by Attributes.sandbox
    public var IFRAME.seamless: Boolean by Attributes.seamless
    public var IFRAME.src: Link by Attributes.src
    public var IFRAME.width: String by Attributes.width

class IMG : TagType(), TagWithoutText
    public var IMG.alt: String by Attributes.alt
    public var IMG.height: String by Attributes.height
    public var IMG.ismap: Boolean by Attributes.ismap
    public var IMG.src: Link by Attributes.src
    public var IMG.usemap: Link by Attributes.usemap
    public var IMG.width: String by Attributes.width

class INPUT : TagType(), TagWithoutText
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

class INS : TagType(), CommonBodyContent
    public var INS.cite: Link by Attributes.cite
    public var INS.datetime: String by Attributes.datetime

class KBD : TagType(), CommonBodyContent

class KEYGEN : TagType()
    public var KEYGEN.autofocus: Boolean by Attributes.autofocus
    public var KEYGEN.challenge: String by Attributes.challenge
    public var KEYGEN.disabled: Boolean by Attributes.disabled
    public var KEYGEN.form: String by Attributes.form
    public var KEYGEN.keytype: Keytype by Attributes.keytype
    public var KEYGEN.name: String by Attributes.stringName

class LABEL : TagType(), CommonBodyContent
    public var LABEL.forId: String by Attributes.forId
    public var LABEL.form: String by Attributes.form

class MAP : TagType(), CommonBodyContent, TagWithoutText
    public var MAP.name: String by Attributes.stringName

class MARK : TagType(), CommonBodyContent

class MATH : TagType(), CommonBodyContent, TagWithoutText

class MATHML : TagType()

class METER : TagType(), CommonBodyContent
    public var METER.high: Float by Attributes.high
    public var METER.low: Float by Attributes.low
    public var METER.max: Float by Attributes.floatMax
    public var METER.min: Float by Attributes.floatMin
    public var METER.optimum: Float by Attributes.optimum
    public var METER.value: Float by Attributes.floatValue

class NAV : TagType(), CommonBodyContent

class OUTPUT : TagType(), CommonBodyContent
    public var OUTPUT.forId: String by Attributes.forId
    public var OUTPUT.form: String by Attributes.form
    public var OUTPUT.name: String by Attributes.stringName

class P : TagType(), CommonBodyContent

class PRE : TagType(), CommonBodyContent

class PROGRESS : TagType(), CommonBodyContent
    public var PROGRESS.max: Float by Attributes.floatMax
    public var PROGRESS.value: Float by Attributes.floatValue

class Q : TagType(), CommonBodyContent
    public var Q.cite: Link by Attributes.cite

class SAMP : TagType(), CommonBodyContent

class SECTION : TagType(), CommonBodyContent

class SMALL : TagType(), CommonBodyContent

class SPAN : TagType(), CommonBodyContent

class STRONG : TagType(), CommonBodyContent

class SUB : TagType(), CommonBodyContent

class SUP : TagType(), CommonBodyContent

class SVG : TagType(), TagWithoutText

class TEXTAREA : TagType()
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

class TIME : TagType(), CommonBodyContent
    public var TIME.datetime: String by Attributes.datetime

class VAR_ : TagType(), CommonBodyContent

trait CommonBodyContent : HeadersContent
    fun Tag<CommonBodyContent>.a(c: StyleClass? = null, id: String? = null, contents: Tag<A>.() -> Unit = empty_contents) = contentTag(::A, "a", c, id, contents, contentStyle = ContentStyle.propagate)
    fun Tag<CommonBodyContent>.abbr(c: StyleClass? = null, id: String? = null, contents: Tag<ABBR>.() -> Unit = empty_contents) = contentTag(::ABBR, "abbr", c, id, contents)
    fun Tag<CommonBodyContent>.address(c: StyleClass? = null, id: String? = null, contents: Tag<ADDRESS>.() -> Unit = empty_contents) = contentTag(::ADDRESS, "address", c, id, contents)
    fun Tag<CommonBodyContent>.area(c: StyleClass? = null, id: String? = null, contents: Tag<AREA>.() -> Unit = empty_contents) = contentTag(::AREA, "area", c, id, contents)
    fun Tag<CommonBodyContent>.article(c: StyleClass? = null, id: String? = null, contents: Tag<ARTICLE>.() -> Unit = empty_contents) = contentTag(::ARTICLE, "article", c, id, contents)
    fun Tag<CommonBodyContent>.aside(c: StyleClass? = null, id: String? = null, contents: Tag<ASIDE>.() -> Unit = empty_contents) = contentTag(::ASIDE, "aside", c, id, contents)
    fun Tag<CommonBodyContent>.audio(c: StyleClass? = null, id: String? = null, contents: Tag<AUDIO>.() -> Unit = empty_contents) = contentTag(::AUDIO, "audio", c, id, contents)
    fun Tag<CommonBodyContent>.b(c: StyleClass? = null, id: String? = null, contents: Tag<B>.() -> Unit = empty_contents) = contentTag(::B, "b", c, id, contents, contentStyle = ContentStyle.propagate)
    fun Tag<CommonBodyContent>.bdi(c: StyleClass? = null, id: String? = null, contents: Tag<BDI>.() -> Unit = empty_contents) = contentTag(::BDI, "bdi", c, id, contents)
    fun Tag<CommonBodyContent>.bdo(c: StyleClass? = null, id: String? = null, contents: Tag<BDO>.() -> Unit = empty_contents) = contentTag(::BDO, "bdo", c, id, contents)
    fun Tag<CommonBodyContent>.blockquote(c: StyleClass? = null, id: String? = null, contents: Tag<BLOCKQUOTE>.() -> Unit = empty_contents) = contentTag(::BLOCKQUOTE, "blockquote", c, id, contents)
    fun Tag<CommonBodyContent>.br(c: StyleClass? = null, id: String? = null, contents: Tag<BR>.() -> Unit = empty_contents) = contentTag(::BR, "br", c, id, contents, renderStyle = RenderStyle.empty)
    fun Tag<CommonBodyContent>.button(c: StyleClass? = null, id: String? = null, contents: Tag<BUTTON>.() -> Unit = empty_contents) = contentTag(::BUTTON, "button", c, id, contents)
    fun Tag<CommonBodyContent>.canvas(c: StyleClass? = null, id: String? = null, contents: Tag<CANVAS>.() -> Unit = empty_contents) = contentTag(::CANVAS, "canvas", c, id, contents)
    fun Tag<CommonBodyContent>.cite(c: StyleClass? = null, id: String? = null, contents: Tag<CITE>.() -> Unit = empty_contents) = contentTag(::CITE, "cite", c, id, contents)
    fun Tag<CommonBodyContent>.code(c: StyleClass? = null, id: String? = null, contents: Tag<CODE>.() -> Unit = empty_contents) = contentTag(::CODE, "code", c, id, contents)
    fun Tag<CommonBodyContent>.command(c: StyleClass? = null, id: String? = null, contents: Tag<COMMAND>.() -> Unit = empty_contents) = contentTag(::COMMAND, "command", c, id, contents)
    fun Tag<CommonBodyContent>.datalist(c: StyleClass? = null, id: String? = null, contents: Tag<DATALIST>.() -> Unit = empty_contents) = contentTag(::DATALIST, "datalist", c, id, contents)
    fun Tag<CommonBodyContent>.del(c: StyleClass? = null, id: String? = null, contents: Tag<DEL>.() -> Unit = empty_contents) = contentTag(::DEL, "del", c, id, contents)
    fun Tag<CommonBodyContent>.details(c: StyleClass? = null, id: String? = null, contents: Tag<DETAILS>.() -> Unit = empty_contents) = contentTag(::DETAILS, "details", c, id, contents)
    fun Tag<CommonBodyContent>.dfn(c: StyleClass? = null, id: String? = null, contents: Tag<DFN>.() -> Unit = empty_contents) = contentTag(::DFN, "dfn", c, id, contents)
    fun Tag<CommonBodyContent>.dialog(c: StyleClass? = null, id: String? = null, contents: Tag<DIALOG>.() -> Unit = empty_contents) = contentTag(::DIALOG, "dialog", c, id, contents)
    fun Tag<CommonBodyContent>.div(c: StyleClass? = null, id: String? = null, contents: Tag<DIV>.() -> Unit = empty_contents) = contentTag(::DIV, "div", c, id, contents)
    fun Tag<CommonBodyContent>.dl(c: StyleClass? = null, id: String? = null, contents: Tag<DL>.() -> Unit = empty_contents) = contentTag(::DL, "dl", c, id, contents)
    fun Tag<CommonBodyContent>.em(c: StyleClass? = null, id: String? = null, contents: Tag<EM>.() -> Unit = empty_contents) = contentTag(::EM, "em", c, id, contents, contentStyle = ContentStyle.propagate)
    fun Tag<CommonBodyContent>.embed(c: StyleClass? = null, id: String? = null, contents: Tag<EMBED>.() -> Unit = empty_contents) = contentTag(::EMBED, "embed", c, id, contents)
    fun Tag<CommonBodyContent>.fieldset(c: StyleClass? = null, id: String? = null, contents: Tag<FIELDSET>.() -> Unit = empty_contents) = contentTag(::FIELDSET, "fieldset", c, id, contents)
    fun Tag<CommonBodyContent>.figure(c: StyleClass? = null, id: String? = null, contents: Tag<FIGURE>.() -> Unit = empty_contents) = contentTag(::FIGURE, "figure", c, id, contents)
    fun Tag<CommonBodyContent>.footer(c: StyleClass? = null, id: String? = null, contents: Tag<FOOTER>.() -> Unit = empty_contents) = contentTag(::FOOTER, "footer", c, id, contents)
    fun Tag<CommonBodyContent>.form(c: StyleClass? = null, id: String? = null, contents: Tag<FORM>.() -> Unit = empty_contents) = contentTag(::FORM, "form", c, id, contents)
    fun Tag<CommonBodyContent>.header(c: StyleClass? = null, id: String? = null, contents: Tag<HEADER>.() -> Unit = empty_contents) = contentTag(::HEADER, "header", c, id, contents)
    fun Tag<CommonBodyContent>.hgroup(c: StyleClass? = null, id: String? = null, contents: Tag<HGROUP>.() -> Unit = empty_contents) = contentTag(::HGROUP, "hgroup", c, id, contents)
    fun Tag<CommonBodyContent>.hr(c: StyleClass? = null, id: String? = null, contents: Tag<HR>.() -> Unit = empty_contents) = contentTag(::HR, "hr", c, id, contents, renderStyle = RenderStyle.empty)
    fun Tag<CommonBodyContent>.i(c: StyleClass? = null, id: String? = null, contents: Tag<I>.() -> Unit = empty_contents) = contentTag(::I, "i", c, id, contents, contentStyle = ContentStyle.propagate)
    fun Tag<CommonBodyContent>.iframe(c: StyleClass? = null, id: String? = null, contents: Tag<IFRAME>.() -> Unit = empty_contents) = contentTag(::IFRAME, "iframe", c, id, contents)
    fun Tag<CommonBodyContent>.img(c: StyleClass? = null, id: String? = null, contents: Tag<IMG>.() -> Unit = empty_contents) = contentTag(::IMG, "img", c, id, contents, renderStyle = RenderStyle.empty, contentStyle = ContentStyle.text)
    fun Tag<CommonBodyContent>.input(c: StyleClass? = null, id: String? = null, contents: Tag<INPUT>.() -> Unit = empty_contents) = contentTag(::INPUT, "input", c, id, contents, renderStyle = RenderStyle.empty)
    fun Tag<CommonBodyContent>.ins(c: StyleClass? = null, id: String? = null, contents: Tag<INS>.() -> Unit = empty_contents) = contentTag(::INS, "ins", c, id, contents)
    fun Tag<CommonBodyContent>.kbd(c: StyleClass? = null, id: String? = null, contents: Tag<KBD>.() -> Unit = empty_contents) = contentTag(::KBD, "kbd", c, id, contents)
    fun Tag<CommonBodyContent>.keygen(c: StyleClass? = null, id: String? = null, contents: Tag<KEYGEN>.() -> Unit = empty_contents) = contentTag(::KEYGEN, "keygen", c, id, contents)
    fun Tag<CommonBodyContent>.label(c: StyleClass? = null, id: String? = null, contents: Tag<LABEL>.() -> Unit = empty_contents) = contentTag(::LABEL, "label", c, id, contents)
    fun Tag<CommonBodyContent>.map(c: StyleClass? = null, id: String? = null, contents: Tag<MAP>.() -> Unit = empty_contents) = contentTag(::MAP, "map", c, id, contents)
    fun Tag<CommonBodyContent>.mark(c: StyleClass? = null, id: String? = null, contents: Tag<MARK>.() -> Unit = empty_contents) = contentTag(::MARK, "mark", c, id, contents)
    fun Tag<CommonBodyContent>.math(c: StyleClass? = null, id: String? = null, contents: Tag<MATH>.() -> Unit = empty_contents) = contentTag(::MATH, "math", c, id, contents)
    fun Tag<CommonBodyContent>.menu(c: StyleClass? = null, id: String? = null, contents: Tag<MENU>.() -> Unit = empty_contents) = contentTag(::MENU, "menu", c, id, contents)
    fun Tag<CommonBodyContent>.meter(c: StyleClass? = null, id: String? = null, contents: Tag<METER>.() -> Unit = empty_contents) = contentTag(::METER, "meter", c, id, contents)
    fun Tag<CommonBodyContent>.nav(c: StyleClass? = null, id: String? = null, contents: Tag<NAV>.() -> Unit = empty_contents) = contentTag(::NAV, "nav", c, id, contents)
    fun Tag<CommonBodyContent>.object_(c: StyleClass? = null, id: String? = null, contents: Tag<OBJECT_>.() -> Unit = empty_contents) = contentTag(::OBJECT_, "object", c, id, contents)
    fun Tag<CommonBodyContent>.ol(c: StyleClass? = null, id: String? = null, contents: Tag<OL>.() -> Unit = empty_contents) = contentTag(::OL, "ol", c, id, contents)
    fun Tag<CommonBodyContent>.output(c: StyleClass? = null, id: String? = null, contents: Tag<OUTPUT>.() -> Unit = empty_contents) = contentTag(::OUTPUT, "output", c, id, contents)
    fun Tag<CommonBodyContent>.p(c: StyleClass? = null, id: String? = null, contents: Tag<P>.() -> Unit = empty_contents) = contentTag(::P, "p", c, id, contents)
    fun Tag<CommonBodyContent>.pre(c: StyleClass? = null, id: String? = null, contents: Tag<PRE>.() -> Unit = empty_contents) = contentTag(::PRE, "pre", c, id, contents)
    fun Tag<CommonBodyContent>.progress(c: StyleClass? = null, id: String? = null, contents: Tag<PROGRESS>.() -> Unit = empty_contents) = contentTag(::PROGRESS, "progress", c, id, contents)
    fun Tag<CommonBodyContent>.q(c: StyleClass? = null, id: String? = null, contents: Tag<Q>.() -> Unit = empty_contents) = contentTag(::Q, "q", c, id, contents)
    fun Tag<CommonBodyContent>.ruby(c: StyleClass? = null, id: String? = null, contents: Tag<RUBY>.() -> Unit = empty_contents) = contentTag(::RUBY, "ruby", c, id, contents)
    fun Tag<CommonBodyContent>.samp(c: StyleClass? = null, id: String? = null, contents: Tag<SAMP>.() -> Unit = empty_contents) = contentTag(::SAMP, "samp", c, id, contents)
    fun Tag<CommonBodyContent>.section(c: StyleClass? = null, id: String? = null, contents: Tag<SECTION>.() -> Unit = empty_contents) = contentTag(::SECTION, "section", c, id, contents)
    fun Tag<CommonBodyContent>.select(c: StyleClass? = null, id: String? = null, contents: Tag<SELECT>.() -> Unit = empty_contents) = contentTag(::SELECT, "select", c, id, contents)
    fun Tag<CommonBodyContent>.small(c: StyleClass? = null, id: String? = null, contents: Tag<SMALL>.() -> Unit = empty_contents) = contentTag(::SMALL, "small", c, id, contents, contentStyle = ContentStyle.propagate)
    fun Tag<CommonBodyContent>.span(c: StyleClass? = null, id: String? = null, contents: Tag<SPAN>.() -> Unit = empty_contents) = contentTag(::SPAN, "span", c, id, contents, contentStyle = ContentStyle.propagate)
    fun Tag<CommonBodyContent>.strong(c: StyleClass? = null, id: String? = null, contents: Tag<STRONG>.() -> Unit = empty_contents) = contentTag(::STRONG, "strong", c, id, contents, contentStyle = ContentStyle.propagate)
    fun Tag<CommonBodyContent>.sub(c: StyleClass? = null, id: String? = null, contents: Tag<SUB>.() -> Unit = empty_contents) = contentTag(::SUB, "sub", c, id, contents)
    fun Tag<CommonBodyContent>.sup(c: StyleClass? = null, id: String? = null, contents: Tag<SUP>.() -> Unit = empty_contents) = contentTag(::SUP, "sup", c, id, contents)
    fun Tag<CommonBodyContent>.svg(c: StyleClass? = null, id: String? = null, contents: Tag<SVG>.() -> Unit = empty_contents) = contentTag(::SVG, "svg", c, id, contents)
    fun Tag<CommonBodyContent>.table(c: StyleClass? = null, id: String? = null, contents: Tag<TABLE>.() -> Unit = empty_contents) = contentTag(::TABLE, "table", c, id, contents)
    fun Tag<CommonBodyContent>.textarea(c: StyleClass? = null, id: String? = null, contents: Tag<TEXTAREA>.() -> Unit = empty_contents) = contentTag(::TEXTAREA, "textarea", c, id, contents)
    fun Tag<CommonBodyContent>.time(c: StyleClass? = null, id: String? = null, contents: Tag<TIME>.() -> Unit = empty_contents) = contentTag(::TIME, "time", c, id, contents)
    fun Tag<CommonBodyContent>.ul(c: StyleClass? = null, id: String? = null, contents: Tag<UL>.() -> Unit = empty_contents) = contentTag(::UL, "ul", c, id, contents)
    fun Tag<CommonBodyContent>.var_(c: StyleClass? = null, id: String? = null, contents: Tag<VAR_>.() -> Unit = empty_contents) = contentTag(::VAR_, "var", c, id, contents)
    fun Tag<CommonBodyContent>.video(c: StyleClass? = null, id: String? = null, contents: Tag<VIDEO>.() -> Unit = empty_contents) = contentTag(::VIDEO, "video", c, id, contents)


// --------------------------------------------media---------------------------------

class AUDIO : TagType(), MediaContent
    public var AUDIO.autobuffer: Boolean by Attributes.autobuffer
    public var AUDIO.autoplay: Boolean by Attributes.autoplay
    public var AUDIO.controls: Boolean by Attributes.controls
    public var AUDIO.loop: Boolean by Attributes.loop
    public var AUDIO.src: Link by Attributes.src

class VIDEO : TagType(), MediaContent
    public var VIDEO.autobuffer: Boolean by Attributes.autobuffer
    public var VIDEO.autoplay: Boolean by Attributes.autoplay
    public var VIDEO.controls: Boolean by Attributes.controls
    public var VIDEO.height: String by Attributes.height
    public var VIDEO.loop: Boolean by Attributes.loop
    public var VIDEO.poster: String by Attributes.poster
    public var VIDEO.src: Link by Attributes.src
    public var VIDEO.width: String by Attributes.width

class SOURCE : TagType(), TagWithoutText
    public var SOURCE.media: String by Attributes.media
    public var SOURCE.src: Link by Attributes.src
    public var SOURCE.type_: String by Attributes.stringType

trait MediaContent
    fun Tag<MediaContent>.source(c: StyleClass? = null, id: String? = null, contents: Tag<SOURCE>.() -> Unit = empty_contents) = contentTag(::SOURCE, "source", c, id, contents)

// --------------------------------------------options---------------------------------

class DATALIST : TagType(), CommonBodyContent, OPTIONContent, TagWithoutText

class SELECT : TagType(), OPTIONContent, TagWithoutText
    public var SELECT.autofocus: Boolean by Attributes.autofocus
    public var SELECT.disabled: Boolean by Attributes.disabled
    public var SELECT.form: String by Attributes.form
    public var SELECT.multiple: Boolean by Attributes.multiple
    public var SELECT.name: String by Attributes.stringName
    public var SELECT.size: String by Attributes.size

class OPTGROUP : TagType(), OPTIONContent, TagWithoutText
    public var OPTGROUP.disabled: Boolean by Attributes.disabled
    public var OPTGROUP.label: String by Attributes.label

class OPTION : TagType()
    public var OPTION.disabled: Boolean by Attributes.disabled
    public var OPTION.label: String by Attributes.label
    public var OPTION.selected: Boolean by Attributes.selected
    public var OPTION.value: String by Attributes.stringValue

fun Tag<SELECT>.optgroup(c: StyleClass? = null, id: String? = null, contents: Tag<OPTGROUP>.() -> Unit = empty_contents) = contentTag(::OPTGROUP, "optgroup", c, id, contents)

trait OPTIONContent
    fun Tag<OPTIONContent>.option(c: StyleClass? = null, id: String? = null, contents: Tag<OPTION>.() -> Unit = empty_contents) = contentTag(::OPTION, "option", c, id, contents)

// --------------------------------------------fieldset---------------------------------

class FIELDSET : TagType(), CommonBodyContent
    public var FIELDSET.disabled: Boolean by Attributes.disabled
    public var FIELDSET.form: String by Attributes.form
    public var FIELDSET.name: String by Attributes.stringName
class LEGEND : TagType(), CommonBodyContent

fun Tag<FIELDSET>.legend(c: StyleClass? = null, id: String? = null, contents: Tag<LEGEND>.() -> Unit = empty_contents) = contentTag(::LEGEND, "legend", c, id, contents)

// --------------------------------------------details---------------------------------

class DETAILS : TagType(), CommonBodyContent
    public var DETAILS.open: Boolean by Attributes.open
class SUMMARY : TagType(), CommonBodyContent

fun Tag<DETAILS>.summary(c: StyleClass? = null, id: String? = null, contents: Tag<SUMMARY>.() -> Unit = empty_contents) = contentTag(::SUMMARY, "summary", c, id, contents)

// --------------------------------------------figure---------------------------------

class FIGURE : TagType(), CommonBodyContent
class FIGCAPTION : TagType(), CommonBodyContent

fun Tag<FIGURE>.figcaption(c: StyleClass? = null, id: String? = null, contents: Tag<FIGCAPTION>.() -> Unit = empty_contents) = contentTag(::FIGCAPTION, "figcaption", c, id, contents)

// --------------------------------------------object---------------------------------

class OBJECT_ : TagType()
    public var OBJECT_.classid: String by Attributes.classid
    public var OBJECT_.data: Link by Attributes.data
    public var OBJECT_.form: String by Attributes.form
    public var OBJECT_.height: String by Attributes.height
    public var OBJECT_.name: BrowsingContext by Attributes.iframeName
    public var OBJECT_.type_: String by Attributes.stringType
    public var OBJECT_.usemap: Link by Attributes.usemap
    public var OBJECT_.width: String by Attributes.width

class PARAM : TagType(), TagWithoutText
    public var PARAM.name: String by Attributes.stringName
    public var PARAM.value: String by Attributes.stringValue

fun Tag<OBJECT_>.param(c: StyleClass? = null, id: String? = null, contents: Tag<PARAM>.() -> Unit = empty_contents) = contentTag(::PARAM, "param", c, id, contents)

// --------------------------------------------ruby---------------------------------

class RUBY : TagType(), CommonBodyContent

class RP : TagType(), CommonBodyContent
class RT : TagType(), CommonBodyContent

fun Tag<RUBY>.rp(c: StyleClass? = null, id: String? = null, contents: Tag<RP>.() -> Unit = empty_contents) = contentTag(::RP, "rp", c, id, contents)
fun Tag<RUBY>.rt(c: StyleClass? = null, id: String? = null, contents: Tag<RT>.() -> Unit = empty_contents) = contentTag(::RT, "rt", c, id, contents)

// --------------------------------------------list---------------------------------

class MENU : TagType(), CommonBodyContent, ListContent, TagWithoutText
    public var MENU.label: String by Attributes.label
    public var MENU.type_: MenuType by Attributes.menuType

class OL : TagType(), ListContent, TagWithoutText
    public var OL.reversed: Boolean by Attributes.reversed
    public var OL.start: String by Attributes.start

class UL : TagType(), ListContent, TagWithoutText

class LI : TagType(), CommonBodyContent
    public var LI.value: String by Attributes.stringValue

trait ListContent
    fun Tag<ListContent>.li(c: StyleClass? = null, id: String? = null, contents: Tag<LI>.() -> Unit = empty_contents) = contentTag(::LI, "li", c, id, contents)

// --------------------------------------------dl---------------------------------

class DL : TagType(), TagWithoutText

class DD : TagType(), CommonBodyContent
class DT : TagType(), CommonBodyContent

fun Tag<DL>.dd(c: StyleClass? = null, id: String? = null, contents: Tag<DD>.() -> Unit = empty_contents) = contentTag(::DD, "dd", c, id, contents, contentStyle = ContentStyle.propagate)
fun Tag<DL>.dt(c: StyleClass? = null, id: String? = null, contents: Tag<DT>.() -> Unit = empty_contents) = contentTag(::DT, "dt", c, id, contents, contentStyle = ContentStyle.propagate)

// --------------------------------------------headers---------------------------------

class HGROUP : TagType(), HeadersContent, TagWithoutText

class Headers : TagType(), CommonBodyContent

trait HeadersContent
    fun Tag<HeadersContent>.h1(c: StyleClass? = null, id: String? = null, contents: Tag<Headers>.() -> Unit = empty_contents) = contentTag(::Headers, "h1", c, id, contents)
    fun Tag<HeadersContent>.h2(c: StyleClass? = null, id: String? = null, contents: Tag<Headers>.() -> Unit = empty_contents) = contentTag(::Headers, "h2", c, id, contents)
    fun Tag<HeadersContent>.h3(c: StyleClass? = null, id: String? = null, contents: Tag<Headers>.() -> Unit = empty_contents) = contentTag(::Headers, "h3", c, id, contents)
    fun Tag<HeadersContent>.h4(c: StyleClass? = null, id: String? = null, contents: Tag<Headers>.() -> Unit = empty_contents) = contentTag(::Headers, "h4", c, id, contents)
    fun Tag<HeadersContent>.h5(c: StyleClass? = null, id: String? = null, contents: Tag<Headers>.() -> Unit = empty_contents) = contentTag(::Headers, "h5", c, id, contents)
    fun Tag<HeadersContent>.h6(c: StyleClass? = null, id: String? = null, contents: Tag<Headers>.() -> Unit = empty_contents) = contentTag(::Headers, "h6", c, id, contents)

// --------------------------------------------table-----------------------------------

fun Tag<TABLE>.caption(c: StyleClass? = null, id: String? = null, contents: Tag<CAPTION>.() -> Unit = empty_contents) = contentTag(::CAPTION, "caption", c, id, contents)
fun Tag<TABLE>.colgroup(c: StyleClass? = null, id: String? = null, contents: Tag<COLGROUP>.() -> Unit = empty_contents) = contentTag(::COLGROUP, "colgroup", c, id, contents)
fun Tag<TABLE>.tbody(c: StyleClass? = null, id: String? = null, contents: Tag<TBODY>.() -> Unit = empty_contents) = contentTag(::TBODY, "tbody", c, id, contents)
fun Tag<TABLE>.thead(c: StyleClass? = null, id: String? = null, contents: Tag<THEAD>.() -> Unit = empty_contents) = contentTag(::THEAD, "thead", c, id, contents)
fun Tag<TABLE>.tfoot(c: StyleClass? = null, id: String? = null, contents: Tag<TFOOT>.() -> Unit = empty_contents) = contentTag(::TFOOT, "tfoot", c, id, contents)

fun Tag<COLGROUP>.col(c: StyleClass? = null, id: String? = null, contents: Tag<COL>.() -> Unit = empty_contents) = contentTag(::COL, "col", c, id, contents)

trait TRContent
    fun Tag<TRContent>.tr(c: StyleClass? = null, id: String? = null, contents: Tag<TR>.() -> Unit = empty_contents) = contentTag(::TR, "tr", c, id, contents)

fun Tag<TR>.td(c: StyleClass? = null, id: String? = null, contents: Tag<TD>.() -> Unit = empty_contents) = contentTag(::TD, "td", c, id, contents)
fun Tag<TR>.th(c: StyleClass? = null, id: String? = null, contents: Tag<TH>.() -> Unit = empty_contents) = contentTag(::TH, "th", c, id, contents)

class TABLE : TagType(), TRContent, TagWithoutText
    public var TABLE.summary: String by Attributes.summary

class CAPTION : TagType(), CommonBodyContent

class COLGROUP : TagType(), TagWithoutText
    public var COLGROUP.span: Int by Attributes.span

class COL : TagType(), TagWithoutText
    public var COL.span: Int by Attributes.span


class TBODY : TagType(), TRContent, TagWithoutText
class THEAD : TagType(), TRContent, TagWithoutText
class TFOOT : TagType(), TRContent, TagWithoutText

class TR : TagType(), TagWithoutText

class TH : TagType(), CommonBodyContent
    public var TH.colspan: Int by Attributes.colspan
    public var TH.headers: String by Attributes.headers
    public var TH.rowspan: Int by Attributes.rowspan
    public var TH.scope: Scope by Attributes.scope

class TD : TagType(), CommonBodyContent
    public var TD.colspan: Int by Attributes.colspan
    public var TD.headers: String by Attributes.headers
    public var TD.rowspan: Int by Attributes.rowspan

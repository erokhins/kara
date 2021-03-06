
package kotlin.html

public enum class Shape(override val value: String): EnumValues<Shape> {
    circle: Shape("circle")
    default: Shape("default")
    poly: Shape("poly")
    rect: Shape("rect")
}

public enum class Autocomplete(override val value: String): EnumValues<Autocomplete> {
    off: Autocomplete("off")
    on: Autocomplete("on")
}

public class BrowsingContext(override val value: String): StrEnumValues<BrowsingContext> {
    class object {
        val _blank = BrowsingContext("_blank")
        val _parent = BrowsingContext("_parent")
        val _self = BrowsingContext("_self")
        val _top = BrowsingContext("_top")
    }
}

public class ContentType(override val value: String): StrEnumValues<ContentType> {
    class object {
        val text_asa = ContentType("text/asa")
        val text_asp = ContentType("text/asp")
        val text_css = ContentType("text/css")
        val text_html = ContentType("text/html")
        val text_javascript = ContentType("text/javascript")
        val text_plain = ContentType("text/plain")
        val text_scriptlet = ContentType("text/scriptlet")
        val text_x_component = ContentType("text/x-component")
        val text_x_html_insertion = ContentType("text/x-html-insertion")
        val text_xml = ContentType("text/xml")
    }
}

public enum class Dir(override val value: String): EnumValues<Dir> {
    ltr: Dir("ltr")
    rtl: Dir("rtl")
}

public enum class Draggable(override val value: String): EnumValues<Draggable> {
    auto: Draggable("auto")
    false_: Draggable("false")
    true_: Draggable("true")
}

public enum class Enctype(override val value: String): EnumValues<Enctype> {
    application_x_www_form_urlencoded: Enctype("application/x-www-form-urlencoded")
    multipart_form_data: Enctype("multipart/form-data")
    text_plain: Enctype("text/plain")
}

public enum class Formenctype(override val value: String): EnumValues<Formenctype> {
    application_x_www_form_urlencoded: Formenctype("application/x-www-form-urlencoded")
    multipart_form_data: Formenctype("multipart/form-data")
    text_plain: Formenctype("text/plain")
}

public enum class Formmethod(override val value: String): EnumValues<Formmethod> {
    delete: Formmethod("delete")
    get: Formmethod("get")
    post: Formmethod("post")
    put: Formmethod("put")
}

public class I18LanguageCode(override val value: String): StrEnumValues<I18LanguageCode> {
    class object {
        val aa = I18LanguageCode("aa")
        val ab = I18LanguageCode("ab")
        val ace = I18LanguageCode("ace")
        val ach = I18LanguageCode("ach")
        val ada = I18LanguageCode("ada")
        val ady = I18LanguageCode("ady")
        val ae = I18LanguageCode("ae")
        val af = I18LanguageCode("af")
        val afa = I18LanguageCode("afa")
        val afh = I18LanguageCode("afh")
        val ak = I18LanguageCode("ak")
        val akk = I18LanguageCode("akk")
        val ale = I18LanguageCode("ale")
        val alg = I18LanguageCode("alg")
        val am = I18LanguageCode("am")
        val an = I18LanguageCode("an")
        val ang = I18LanguageCode("ang")
        val apa = I18LanguageCode("apa")
        val ar = I18LanguageCode("ar")
        val ar_ae = I18LanguageCode("ar-ae")
        val ar_bh = I18LanguageCode("ar-bh")
        val ar_dz = I18LanguageCode("ar-dz")
        val ar_eg = I18LanguageCode("ar-eg")
        val ar_iq = I18LanguageCode("ar-iq")
        val ar_jo = I18LanguageCode("ar-jo")
        val ar_kw = I18LanguageCode("ar-kw")
        val ar_lb = I18LanguageCode("ar-lb")
        val ar_ly = I18LanguageCode("ar-ly")
        val ar_ma = I18LanguageCode("ar-ma")
        val ar_om = I18LanguageCode("ar-om")
        val ar_qa = I18LanguageCode("ar-qa")
        val ar_sa = I18LanguageCode("ar-sa")
        val ar_sy = I18LanguageCode("ar-sy")
        val ar_tn = I18LanguageCode("ar-tn")
        val ar_ye = I18LanguageCode("ar-ye")
        val arc = I18LanguageCode("arc")
        val arn = I18LanguageCode("arn")
        val arp = I18LanguageCode("arp")
        val art = I18LanguageCode("art")
        val arw = I18LanguageCode("arw")
        val as_ = I18LanguageCode("as")
        val ast = I18LanguageCode("ast")
        val ath = I18LanguageCode("ath")
        val aus = I18LanguageCode("aus")
        val av = I18LanguageCode("av")
        val awa = I18LanguageCode("awa")
        val ay = I18LanguageCode("ay")
        val az = I18LanguageCode("az")
        val ba = I18LanguageCode("ba")
        val bad = I18LanguageCode("bad")
        val bai = I18LanguageCode("bai")
        val bal = I18LanguageCode("bal")
        val ban = I18LanguageCode("ban")
        val bas = I18LanguageCode("bas")
        val bat = I18LanguageCode("bat")
        val be = I18LanguageCode("be")
        val bej = I18LanguageCode("bej")
        val bem = I18LanguageCode("bem")
        val ber = I18LanguageCode("ber")
        val bg = I18LanguageCode("bg")
        val bh = I18LanguageCode("bh")
        val bho = I18LanguageCode("bho")
        val bi = I18LanguageCode("bi")
        val bik = I18LanguageCode("bik")
        val bin = I18LanguageCode("bin")
        val bla = I18LanguageCode("bla")
        val bm = I18LanguageCode("bm")
        val bn = I18LanguageCode("bn")
        val bnt = I18LanguageCode("bnt")
        val bo = I18LanguageCode("bo")
        val br = I18LanguageCode("br")
        val bra = I18LanguageCode("bra")
        val bs = I18LanguageCode("bs")
        val btk = I18LanguageCode("btk")
        val bua = I18LanguageCode("bua")
        val bug = I18LanguageCode("bug")
        val byn = I18LanguageCode("byn")
        val ca = I18LanguageCode("ca")
        val cad = I18LanguageCode("cad")
        val cai = I18LanguageCode("cai")
        val car = I18LanguageCode("car")
        val cau = I18LanguageCode("cau")
        val ce = I18LanguageCode("ce")
        val ceb = I18LanguageCode("ceb")
        val cel = I18LanguageCode("cel")
        val ch = I18LanguageCode("ch")
        val chb = I18LanguageCode("chb")
        val chg = I18LanguageCode("chg")
        val chk = I18LanguageCode("chk")
        val chm = I18LanguageCode("chm")
        val chn = I18LanguageCode("chn")
        val cho = I18LanguageCode("cho")
        val chp = I18LanguageCode("chp")
        val chr = I18LanguageCode("chr")
        val chy = I18LanguageCode("chy")
        val cmc = I18LanguageCode("cmc")
        val co = I18LanguageCode("co")
        val cop = I18LanguageCode("cop")
        val cpe = I18LanguageCode("cpe")
        val cpf = I18LanguageCode("cpf")
        val cpp = I18LanguageCode("cpp")
        val cr = I18LanguageCode("cr")
        val crh = I18LanguageCode("crh")
        val crp = I18LanguageCode("crp")
        val cs = I18LanguageCode("cs")
        val csb = I18LanguageCode("csb")
        val cu = I18LanguageCode("cu")
        val cus = I18LanguageCode("cus")
        val cv = I18LanguageCode("cv")
        val cy = I18LanguageCode("cy")
        val da = I18LanguageCode("da")
        val dak = I18LanguageCode("dak")
        val dar = I18LanguageCode("dar")
        val day = I18LanguageCode("day")
        val de = I18LanguageCode("de")
        val de_at = I18LanguageCode("de-at")
        val de_be = I18LanguageCode("de-be")
        val de_ch = I18LanguageCode("de-ch")
        val de_de = I18LanguageCode("de-de")
        val de_li = I18LanguageCode("de-li")
        val de_lu = I18LanguageCode("de-lu")
        val del = I18LanguageCode("del")
        val den = I18LanguageCode("den")
        val dgr = I18LanguageCode("dgr")
        val din = I18LanguageCode("din")
        val div = I18LanguageCode("div")
        val doi = I18LanguageCode("doi")
        val dra = I18LanguageCode("dra")
        val dsb = I18LanguageCode("dsb")
        val dua = I18LanguageCode("dua")
        val dum = I18LanguageCode("dum")
        val dyu = I18LanguageCode("dyu")
        val dz = I18LanguageCode("dz")
        val ee = I18LanguageCode("ee")
        val efi = I18LanguageCode("efi")
        val egy = I18LanguageCode("egy")
        val eka = I18LanguageCode("eka")
        val el = I18LanguageCode("el")
        val elx = I18LanguageCode("elx")
        val en = I18LanguageCode("en")
        val en_au = I18LanguageCode("en-au")
        val en_bz = I18LanguageCode("en-bz")
        val en_ca = I18LanguageCode("en-ca")
        val en_gb = I18LanguageCode("en-gb")
        val en_ie = I18LanguageCode("en-ie")
        val en_jm = I18LanguageCode("en-jm")
        val en_nz = I18LanguageCode("en-nz")
        val en_ph = I18LanguageCode("en-ph")
        val en_tt = I18LanguageCode("en-tt")
        val en_us = I18LanguageCode("en-us")
        val en_za = I18LanguageCode("en-za")
        val en_zw = I18LanguageCode("en-zw")
        val enm = I18LanguageCode("enm")
        val eo = I18LanguageCode("eo")
        val es = I18LanguageCode("es")
        val es_ar = I18LanguageCode("es-ar")
        val es_bo = I18LanguageCode("es-bo")
        val es_cl = I18LanguageCode("es-cl")
        val es_co = I18LanguageCode("es-co")
        val es_do = I18LanguageCode("es-do")
        val es_ec = I18LanguageCode("es-ec")
        val es_es = I18LanguageCode("es-es")
        val es_gt = I18LanguageCode("es-gt")
        val es_hn = I18LanguageCode("es-hn")
        val es_mx = I18LanguageCode("es-mx")
        val es_pa = I18LanguageCode("es-pa")
        val es_pe = I18LanguageCode("es-pe")
        val es_pr = I18LanguageCode("es-pr")
        val es_py = I18LanguageCode("es-py")
        val es_sv = I18LanguageCode("es-sv")
        val es_us = I18LanguageCode("es-us")
        val es_uy = I18LanguageCode("es-uy")
        val es_ve = I18LanguageCode("es-ve")
        val et = I18LanguageCode("et")
        val eu = I18LanguageCode("eu")
        val ewo = I18LanguageCode("ewo")
        val fa = I18LanguageCode("fa")
        val fan = I18LanguageCode("fan")
        val fat = I18LanguageCode("fat")
        val ff = I18LanguageCode("ff")
        val fi = I18LanguageCode("fi")
        val fil = I18LanguageCode("fil")
        val fiu = I18LanguageCode("fiu")
        val fj = I18LanguageCode("fj")
        val fo = I18LanguageCode("fo")
        val fon = I18LanguageCode("fon")
        val fr = I18LanguageCode("fr")
        val fr_be = I18LanguageCode("fr-be")
        val fr_ca = I18LanguageCode("fr-ca")
        val fr_ch = I18LanguageCode("fr-ch")
        val fr_fr = I18LanguageCode("fr-fr")
        val fr_lu = I18LanguageCode("fr-lu")
        val fr_mc = I18LanguageCode("fr-mc")
        val frm = I18LanguageCode("frm")
        val fro = I18LanguageCode("fro")
        val fur = I18LanguageCode("fur")
        val fy = I18LanguageCode("fy")
        val ga = I18LanguageCode("ga")
        val gaa = I18LanguageCode("gaa")
        val gay = I18LanguageCode("gay")
        val gba = I18LanguageCode("gba")
        val gd = I18LanguageCode("gd")
        val gem = I18LanguageCode("gem")
        val gez = I18LanguageCode("gez")
        val gil = I18LanguageCode("gil")
        val gl = I18LanguageCode("gl")
        val gmh = I18LanguageCode("gmh")
        val gn = I18LanguageCode("gn")
        val goh = I18LanguageCode("goh")
        val gon = I18LanguageCode("gon")
        val gor = I18LanguageCode("gor")
        val got = I18LanguageCode("got")
        val grb = I18LanguageCode("grb")
        val grc = I18LanguageCode("grc")
        val gu = I18LanguageCode("gu")
        val gv = I18LanguageCode("gv")
        val gwi = I18LanguageCode("gwi")
        val ha = I18LanguageCode("ha")
        val hai = I18LanguageCode("hai")
        val haw = I18LanguageCode("haw")
        val he = I18LanguageCode("he")
        val hi = I18LanguageCode("hi")
        val hil = I18LanguageCode("hil")
        val him = I18LanguageCode("him")
        val hit = I18LanguageCode("hit")
        val hmn = I18LanguageCode("hmn")
        val ho = I18LanguageCode("ho")
        val hr = I18LanguageCode("hr")
        val hsb = I18LanguageCode("hsb")
        val hu = I18LanguageCode("hu")
        val hup = I18LanguageCode("hup")
        val hy = I18LanguageCode("hy")
        val hz = I18LanguageCode("hz")
        val ia = I18LanguageCode("ia")
        val iba = I18LanguageCode("iba")
        val id = I18LanguageCode("id")
        val ie = I18LanguageCode("ie")
        val ig = I18LanguageCode("ig")
        val ii = I18LanguageCode("ii")
        val ijo = I18LanguageCode("ijo")
        val ik = I18LanguageCode("ik")
        val ilo = I18LanguageCode("ilo")
        val inc = I18LanguageCode("inc")
        val ine = I18LanguageCode("ine")
        val inh = I18LanguageCode("inh")
        val io = I18LanguageCode("io")
        val ira = I18LanguageCode("ira")
        val iro = I18LanguageCode("iro")
        val is_ = I18LanguageCode("is")
        val it = I18LanguageCode("it")
        val it_ch = I18LanguageCode("it-ch")
        val it_it = I18LanguageCode("it-it")
        val iu = I18LanguageCode("iu")
        val ja = I18LanguageCode("ja")
        val jbo = I18LanguageCode("jbo")
        val jpr = I18LanguageCode("jpr")
        val jrb = I18LanguageCode("jrb")
        val jv = I18LanguageCode("jv")
        val ka = I18LanguageCode("ka")
        val kaa = I18LanguageCode("kaa")
        val kab = I18LanguageCode("kab")
        val kac = I18LanguageCode("kac")
        val kam = I18LanguageCode("kam")
        val kar = I18LanguageCode("kar")
        val kaw = I18LanguageCode("kaw")
        val kbd = I18LanguageCode("kbd")
        val kg = I18LanguageCode("kg")
        val kha = I18LanguageCode("kha")
        val khi = I18LanguageCode("khi")
        val kho = I18LanguageCode("kho")
        val ki = I18LanguageCode("ki")
        val kj = I18LanguageCode("kj")
        val kk = I18LanguageCode("kk")
        val kl = I18LanguageCode("kl")
        val km = I18LanguageCode("km")
        val kmb = I18LanguageCode("kmb")
        val kn = I18LanguageCode("kn")
        val ko = I18LanguageCode("ko")
        val kok = I18LanguageCode("kok")
        val kos = I18LanguageCode("kos")
        val kpe = I18LanguageCode("kpe")
        val kr = I18LanguageCode("kr")
        val krc = I18LanguageCode("krc")
        val kro = I18LanguageCode("kro")
        val kru = I18LanguageCode("kru")
        val kum = I18LanguageCode("kum")
        val kut = I18LanguageCode("kut")
        val kv = I18LanguageCode("kv")
        val ky = I18LanguageCode("ky")
        val la = I18LanguageCode("la")
        val lad = I18LanguageCode("lad")
        val lah = I18LanguageCode("lah")
        val lam = I18LanguageCode("lam")
        val lb = I18LanguageCode("lb")
        val lez = I18LanguageCode("lez")
        val lg = I18LanguageCode("lg")
        val ln = I18LanguageCode("ln")
        val lo = I18LanguageCode("lo")
        val lol = I18LanguageCode("lol")
        val loz = I18LanguageCode("loz")
        val lt = I18LanguageCode("lt")
        val lu = I18LanguageCode("lu")
        val lua = I18LanguageCode("lua")
        val lui = I18LanguageCode("lui")
        val lun = I18LanguageCode("lun")
        val luo = I18LanguageCode("luo")
        val lus = I18LanguageCode("lus")
        val lv = I18LanguageCode("lv")
        val mad = I18LanguageCode("mad")
        val mag = I18LanguageCode("mag")
        val mai = I18LanguageCode("mai")
        val mak = I18LanguageCode("mak")
        val map = I18LanguageCode("map")
        val mas = I18LanguageCode("mas")
        val mdf = I18LanguageCode("mdf")
        val mdr = I18LanguageCode("mdr")
        val men = I18LanguageCode("men")
        val mg = I18LanguageCode("mg")
        val mga = I18LanguageCode("mga")
        val mh = I18LanguageCode("mh")
        val mi = I18LanguageCode("mi")
        val mic = I18LanguageCode("mic")
        val min = I18LanguageCode("min")
        val mis = I18LanguageCode("mis")
        val mk = I18LanguageCode("mk")
        val mkh = I18LanguageCode("mkh")
        val ml = I18LanguageCode("ml")
        val mn = I18LanguageCode("mn")
        val mnc = I18LanguageCode("mnc")
        val mni = I18LanguageCode("mni")
        val mno = I18LanguageCode("mno")
        val mo = I18LanguageCode("mo")
        val moh = I18LanguageCode("moh")
        val mos = I18LanguageCode("mos")
        val mr = I18LanguageCode("mr")
        val ms = I18LanguageCode("ms")
        val mt = I18LanguageCode("mt")
        val mul = I18LanguageCode("mul")
        val mun = I18LanguageCode("mun")
        val mus = I18LanguageCode("mus")
        val mwl = I18LanguageCode("mwl")
        val mwr = I18LanguageCode("mwr")
        val my = I18LanguageCode("my")
        val myn = I18LanguageCode("myn")
        val myv = I18LanguageCode("myv")
        val na = I18LanguageCode("na")
        val nap = I18LanguageCode("nap")
        val nb = I18LanguageCode("nb")
        val nd = I18LanguageCode("nd")
        val nds = I18LanguageCode("nds")
        val ne = I18LanguageCode("ne")
        val ne_in = I18LanguageCode("ne-in")
        val ne_np = I18LanguageCode("ne-np")
        val new = I18LanguageCode("new")
        val ng = I18LanguageCode("ng")
        val nia = I18LanguageCode("nia")
        val nic = I18LanguageCode("nic")
        val niu = I18LanguageCode("niu")
        val nl = I18LanguageCode("nl")
        val nl_be = I18LanguageCode("nl-be")
        val nl_nl = I18LanguageCode("nl-nl")
        val nn = I18LanguageCode("nn")
        val no = I18LanguageCode("no")
        val nog = I18LanguageCode("nog")
        val non = I18LanguageCode("non")
        val nr = I18LanguageCode("nr")
        val nso = I18LanguageCode("nso")
        val nub = I18LanguageCode("nub")
        val nv = I18LanguageCode("nv")
        val nwc = I18LanguageCode("nwc")
        val ny = I18LanguageCode("ny")
        val nym = I18LanguageCode("nym")
        val nyn = I18LanguageCode("nyn")
        val nyo = I18LanguageCode("nyo")
        val nzi = I18LanguageCode("nzi")
        val oc = I18LanguageCode("oc")
        val oj = I18LanguageCode("oj")
        val om = I18LanguageCode("om")
        val or = I18LanguageCode("or")
        val os = I18LanguageCode("os")
        val osa = I18LanguageCode("osa")
        val ota = I18LanguageCode("ota")
        val oto = I18LanguageCode("oto")
        val pa = I18LanguageCode("pa")
        val paa = I18LanguageCode("paa")
        val pag = I18LanguageCode("pag")
        val pal = I18LanguageCode("pal")
        val pam = I18LanguageCode("pam")
        val pap = I18LanguageCode("pap")
        val pau = I18LanguageCode("pau")
        val peo = I18LanguageCode("peo")
        val phi = I18LanguageCode("phi")
        val phn = I18LanguageCode("phn")
        val pi = I18LanguageCode("pi")
        val pl = I18LanguageCode("pl")
        val pon = I18LanguageCode("pon")
        val pro = I18LanguageCode("pro")
        val ps = I18LanguageCode("ps")
        val pt = I18LanguageCode("pt")
        val pt_br = I18LanguageCode("pt-br")
        val pt_pt = I18LanguageCode("pt-pt")
        val qu = I18LanguageCode("qu")
        val raj = I18LanguageCode("raj")
        val rap = I18LanguageCode("rap")
        val rar = I18LanguageCode("rar")
        val rm = I18LanguageCode("rm")
        val rn = I18LanguageCode("rn")
        val ro = I18LanguageCode("ro")
        val roa = I18LanguageCode("roa")
        val rom = I18LanguageCode("rom")
        val ru = I18LanguageCode("ru")
        val rw = I18LanguageCode("rw")
        val sa = I18LanguageCode("sa")
        val sad = I18LanguageCode("sad")
        val sah = I18LanguageCode("sah")
        val sai = I18LanguageCode("sai")
        val sal = I18LanguageCode("sal")
        val sam = I18LanguageCode("sam")
        val sas = I18LanguageCode("sas")
        val sat = I18LanguageCode("sat")
        val sc = I18LanguageCode("sc")
        val scn = I18LanguageCode("scn")
        val sco = I18LanguageCode("sco")
        val sd = I18LanguageCode("sd")
        val se = I18LanguageCode("se")
        val sel = I18LanguageCode("sel")
        val sem = I18LanguageCode("sem")
        val sg = I18LanguageCode("sg")
        val sga = I18LanguageCode("sga")
        val sgn = I18LanguageCode("sgn")
        val shn = I18LanguageCode("shn")
        val si = I18LanguageCode("si")
        val sid = I18LanguageCode("sid")
        val sio = I18LanguageCode("sio")
        val sit = I18LanguageCode("sit")
        val sk = I18LanguageCode("sk")
        val sl = I18LanguageCode("sl")
        val sla = I18LanguageCode("sla")
        val sm = I18LanguageCode("sm")
        val sma = I18LanguageCode("sma")
        val smi = I18LanguageCode("smi")
        val smj = I18LanguageCode("smj")
        val smn = I18LanguageCode("smn")
        val sms = I18LanguageCode("sms")
        val sn = I18LanguageCode("sn")
        val snk = I18LanguageCode("snk")
        val so = I18LanguageCode("so")
        val sog = I18LanguageCode("sog")
        val son = I18LanguageCode("son")
        val sq = I18LanguageCode("sq")
        val sr = I18LanguageCode("sr")
        val srr = I18LanguageCode("srr")
        val ss = I18LanguageCode("ss")
        val ssa = I18LanguageCode("ssa")
        val st = I18LanguageCode("st")
        val su = I18LanguageCode("su")
        val suk = I18LanguageCode("suk")
        val sus = I18LanguageCode("sus")
        val sux = I18LanguageCode("sux")
        val sv = I18LanguageCode("sv")
        val sv_fi = I18LanguageCode("sv-fi")
        val sv_se = I18LanguageCode("sv-se")
        val sw = I18LanguageCode("sw")
        val syr = I18LanguageCode("syr")
        val ta = I18LanguageCode("ta")
        val tai = I18LanguageCode("tai")
        val te = I18LanguageCode("te")
        val tem = I18LanguageCode("tem")
        val ter = I18LanguageCode("ter")
        val tet = I18LanguageCode("tet")
        val tg = I18LanguageCode("tg")
        val th = I18LanguageCode("th")
        val ti = I18LanguageCode("ti")
        val tig = I18LanguageCode("tig")
        val tiv = I18LanguageCode("tiv")
        val tk = I18LanguageCode("tk")
        val tkl = I18LanguageCode("tkl")
        val tl = I18LanguageCode("tl")
        val tlh = I18LanguageCode("tlh")
        val tli = I18LanguageCode("tli")
        val tmh = I18LanguageCode("tmh")
        val tn = I18LanguageCode("tn")
        val to = I18LanguageCode("to")
        val tog = I18LanguageCode("tog")
        val tpi = I18LanguageCode("tpi")
        val tr = I18LanguageCode("tr")
        val ts = I18LanguageCode("ts")
        val tsi = I18LanguageCode("tsi")
        val tt = I18LanguageCode("tt")
        val tum = I18LanguageCode("tum")
        val tup = I18LanguageCode("tup")
        val tut = I18LanguageCode("tut")
        val tvl = I18LanguageCode("tvl")
        val tw = I18LanguageCode("tw")
        val ty = I18LanguageCode("ty")
        val tyv = I18LanguageCode("tyv")
        val udm = I18LanguageCode("udm")
        val ug = I18LanguageCode("ug")
        val uga = I18LanguageCode("uga")
        val uk = I18LanguageCode("uk")
        val umb = I18LanguageCode("umb")
        val und = I18LanguageCode("und")
        val ur = I18LanguageCode("ur")
        val uz = I18LanguageCode("uz")
        val vai = I18LanguageCode("vai")
        val ve = I18LanguageCode("ve")
        val vi = I18LanguageCode("vi")
        val vo = I18LanguageCode("vo")
        val vot = I18LanguageCode("vot")
        val wa = I18LanguageCode("wa")
        val wak = I18LanguageCode("wak")
        val wal = I18LanguageCode("wal")
        val war = I18LanguageCode("war")
        val was = I18LanguageCode("was")
        val wen = I18LanguageCode("wen")
        val wo = I18LanguageCode("wo")
        val xal = I18LanguageCode("xal")
        val xh = I18LanguageCode("xh")
        val yao = I18LanguageCode("yao")
        val yap = I18LanguageCode("yap")
        val yi = I18LanguageCode("yi")
        val yo = I18LanguageCode("yo")
        val ypk = I18LanguageCode("ypk")
        val za = I18LanguageCode("za")
        val zap = I18LanguageCode("zap")
        val zen = I18LanguageCode("zen")
        val zh = I18LanguageCode("zh")
        val zh_cn = I18LanguageCode("zh-cn")
        val zh_gan = I18LanguageCode("zh-gan")
        val zh_guoyu = I18LanguageCode("zh-guoyu")
        val zh_hakka = I18LanguageCode("zh-hakka")
        val zh_hk = I18LanguageCode("zh-hk")
        val zh_min = I18LanguageCode("zh-min")
        val zh_min_nan = I18LanguageCode("zh-min-nan")
        val zh_mo = I18LanguageCode("zh-mo")
        val zh_sg = I18LanguageCode("zh-sg")
        val zh_tw = I18LanguageCode("zh-tw")
        val zh_wuu = I18LanguageCode("zh-wuu")
        val zh_xiang = I18LanguageCode("zh-xiang")
        val zh_yue = I18LanguageCode("zh-yue")
        val znd = I18LanguageCode("znd")
        val zu = I18LanguageCode("zu")
        val zun = I18LanguageCode("zun")
    }
}

public enum class Keytype(override val value: String): EnumValues<Keytype> {
    rsa: Keytype("rsa")
}

public class LinkType(override val value: String): StrEnumValues<LinkType> {
    class object {
        val alternate = LinkType("Alternate")
        val appendix = LinkType("Appendix")
        val bookmark = LinkType("Bookmark")
        val chapter = LinkType("Chapter")
        val contents = LinkType("Contents")
        val copyright = LinkType("Copyright")
        val glossary = LinkType("Glossary")
        val help = LinkType("Help")
        val index = LinkType("Index")
        val next = LinkType("Next")
        val prev = LinkType("Prev")
        val section = LinkType("Section")
        val start = LinkType("Start")
        val stylesheet = LinkType("Stylesheet")
        val subsection = LinkType("Subsection")
    }
}

public enum class Method(override val value: String): EnumValues<Method> {
    delete: Method("delete")
    get: Method("get")
    post: Method("post")
    put: Method("put")
}

public enum class Runat(override val value: String): EnumValues<Runat> {
    server: Runat("server")
}

public enum class Sandbox(override val value: String): EnumValues<Sandbox> {
    allow_forms: Sandbox("allow-forms")
    allow_same_origin: Sandbox("allow-same-origin")
    allow_scripts: Sandbox("allow-scripts")
}

public enum class Scope(override val value: String): EnumValues<Scope> {
    col: Scope("col")
    colgroup: Scope("colgroup")
    row: Scope("row")
    rowgroup: Scope("rowgroup")
}

public enum class ButtonType(override val value: String): EnumValues<ButtonType> {
    button: ButtonType("button")
    reset: ButtonType("reset")
    submit: ButtonType("submit")
}

public enum class CommandType(override val value: String): EnumValues<CommandType> {
    checkbox: CommandType("checkbox")
    command: CommandType("command")
    radio: CommandType("radio")
}

public enum class InputType(override val value: String): EnumValues<InputType> {
    button: InputType("button")
    checkbox: InputType("checkbox")
    color: InputType("color")
    date: InputType("date")
    datetime: InputType("datetime")
    datetime_local: InputType("datetime-local")
    email: InputType("email")
    file: InputType("file")
    hidden: InputType("hidden")
    image: InputType("image")
    month: InputType("month")
    number: InputType("number")
    password: InputType("password")
    radio: InputType("radio")
    range: InputType("range")
    reset: InputType("reset")
    search: InputType("search")
    submit: InputType("submit")
    tel: InputType("tel")
    text: InputType("text")
    time: InputType("time")
    url: InputType("url")
    week: InputType("week")
}

public enum class MenuType(override val value: String): EnumValues<MenuType> {
    context: MenuType("context")
    list: MenuType("list")
    toolbar: MenuType("toolbar")
}

public enum class Wrap(override val value: String): EnumValues<Wrap> {
    hard: Wrap("hard")
    soft: Wrap("soft")
}


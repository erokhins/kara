package kotlin.html

trait AttributesMap {
    public fun get(attName: String): String
    public fun set(attName: String, attValue: String)
}

public abstract class Attribute<T>(val name: String) {
    fun get(attMap: AttributesMap, property: PropertyMetadata): T {
        return decode(attMap[name]);
    }
    fun set(attMap: AttributesMap, property: PropertyMetadata, value: T) {
        attMap[name] = encode(value);
    }

    abstract fun encode(t: T): String
    abstract fun decode(s: String): T
}

public open class StringAttribute(name: String) : Attribute<String>(name) {
    override fun encode(t: String): String {
        return t // TODO: it actually might need HTML esaping
    }

    override fun decode(s: String): String {
        return s // TODO: it actually might need decode
    }
}

public class ClassAttribute(name: String) : Attribute<StyleClass>(name) {
    override fun encode(t: StyleClass): String {
        return t.name()
    }

    override fun decode(s: String): StyleClass {
        // Can't really be implemented unless all classes are registered somewhere
        throw UnsupportedOperationException()
    }
}

public class TextAttribute(name: String) : StringAttribute(name)
public class RegexpAttribute(name: String) : StringAttribute(name)
public class IdAttribute(name: String) : StringAttribute(name)
public class MimeAttribute(name: String) : StringAttribute(name)
public class DateTimeAttribute(name: String) : StringAttribute(name)

public class FloatAttribute(name: String) : Attribute<Float>(name) {
    override fun encode(t: Float): String {
        return t.toString()
    }

    override fun decode(s: String): Float {
        return s.toFloat()
    }
}

public open class IntAttribute(name: String) : Attribute<Int>(name) {
    override fun encode(t: Int): String {
        return t.toString()
    }

    override fun decode(s: String): Int {
        return s.toInt()
    }
}
public class PositiveIntAttribute(name: String) : IntAttribute(name)

public open class BooleanAttribute(name: String, val trueValue: String = "true", val falseValue: String = "false") : Attribute<Boolean>(name) {
    override fun encode(t: Boolean): String {
        return if (t) trueValue else falseValue
    }

    override fun decode(s: String): Boolean {
        return when (s) {
            trueValue -> true
            falseValue -> false
            else -> throw RuntimeException("Unknown value for $name=$s")
        }
    }
}

public class TickerAttribute(name: String) : BooleanAttribute(name, name, "")

public class LinkAttribute(name: String) : Attribute<Link>(name) {
    override fun encode(t: Link): String {
        return t.href()
    }

    override fun decode(s: String): Link {
        return DirectLink(s)
    }
}

public trait EnumValues<T : Enum<T>> : Enum<T> {
    val value: String get() = name()
}

public class EnumAttribute<T : EnumValues<T>>(name: String, val klass: Class<T>) : Attribute<T>(name) {
    override fun encode(t: T): String {
        return t.value
    }

    override fun decode(s: String): T {
        for (c in klass.getEnumConstants()!!) {
            if (encode(c) == s) return c
        }

        throw RuntimeException("Can't decode '$s' as value of '${klass.getName()}'")
    }
}

public trait StrEnumValues<T> {
    val value: String
}

public class StrEnumAttribute<T : StrEnumValues<T>>(name: String, val klass : Class<T>): Attribute<T>(name) {
    override fun encode(t: T): String {
        return t.value
    }
    override fun decode(s: String): T {
        return getObjForValue(s)
    }

    fun getObjForValue(value: String): T {
        val obj = klass.getDeclaredField("object\$").get(null)
        val objClass = klass.getClasses().find { it.getSimpleName() == "object" }
        if (objClass != null) {
            for (method in objClass.getMethods()) {
                try {
                    if (method.getName()!!.startsWith("get")) {
                        val property = method.invoke(obj) as T
                        if (property.value == value) {
                            return property
                        }
                    }
                } catch (e : Exception) {
                    // do nothing
                }
            }
        }
        return createNewObject(value)
    }

    fun createNewObject(value: String): T {
        return klass.getConstructors()[0].newInstance(value) as T
    }
}


public class MimeTypesAttribute(name: String) : Attribute<List<String>>(name) {

    override fun encode(t: List<String>): String {
        return t.makeString(",")
    }
    override fun decode(s: String): List<String> {
        return s.split(',').map { it.trim() }
    }
}

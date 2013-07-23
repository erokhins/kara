package kotlin.html


enum class LinearUnits(val value: String) {
    percent : LinearUnits("%")
    em : LinearUnits("em")
    px : LinearUnits("px")
    auto: LinearUnits("auto")
    fun toString(): String {
        return value
    }
}

/** Represents a single linear dimension.
 */
class LinearDimension(var value: Double, var units: LinearUnits) {
    class object {
        /** Creates a linear dimension froma string literal */
        fun fromString(s: String): LinearDimension {
            if (s.endsWith("em"))
                return LinearDimension(s.substring(0, s.length() - 2).toDouble(), LinearUnits.em)
            if (s.endsWith("px"))
                return LinearDimension(s.substring(0, s.length() - 2).toDouble(), LinearUnits.px)
            if (s.endsWith("%"))
                return LinearDimension(s.substring(0, s.length() - 1).toDouble(), LinearUnits.percent)
            throw Exception("Invalid linear dimension: ${s}")
        }
    }

    fun toString(): String {
        if (units == LinearUnits.auto)
            return "auto"
        return "$value$units"
    }
}

/** Use this instance to specify the auto keyword for linear dimensions. */
public val auto: LinearDimension = LinearDimension(0.0, LinearUnits.auto)

/** Returns true if the given string represents a valid linear dimension */
fun isLinearDimension(s: String): Boolean {
    return s.endsWith("px") || s.endsWith("em") || s.endsWith("%")
}

/** Extenion property to convert a double to a LinearDimension with units em. */
val Double.em: LinearDimension
    get() {
        return LinearDimension(this, LinearUnits.em)
    }

/** Extenion property to convert an int to a LinearDimension with units em. */
val Int.em: LinearDimension
    get() {
        return LinearDimension(this.toDouble(), LinearUnits.em)
    }

/** Extenion property to convert a double to a LinearDimension with units px. */
val Double.px: LinearDimension
    get() {
        return LinearDimension(this, LinearUnits.px)
    }

/** Extenion property to convert an int to a LinearDimension with units px. */
public val Int.px: LinearDimension
    get() {
        return LinearDimension(this.toDouble(), LinearUnits.px)
    }

/** Extenion property to convert a double to a LinearDimension with units percent. */
val Double.percent: LinearDimension
    get() {
        return LinearDimension(this, LinearUnits.percent)
    }

/** Extenion property to convert an int to a LinearDimension with units percent. */
val Int.percent: LinearDimension
    get() {
        return LinearDimension(this.toDouble(), LinearUnits.percent)
    }

/** Stores 4 linear dimensions that describe a box, like padding and margin.
 */
class BoxDimensions(var top: LinearDimension, var right: LinearDimension, var bottom: LinearDimension, var left: LinearDimension) {

    fun toString(): String {
        return "$top $right $bottom $left"
    }
}

/** Convenience function for making a BoxDimensions with all dimensions the same. */
inline fun box(all: LinearDimension): BoxDimensions {
    return BoxDimensions(all, all, all, all)
}

/** Convenience function for making a BoxDimensions with top/bottom and left/right values. */
inline fun box(topBottom: LinearDimension, leftRight: LinearDimension): BoxDimensions {
    return BoxDimensions(topBottom, leftRight, topBottom, leftRight)
}

/** Convenience function for making a BoxDimensions with all four dimensions. */
inline fun box(top: LinearDimension, right: LinearDimension, bottom: LinearDimension, left: LinearDimension): BoxDimensions {
    return BoxDimensions(top, right, bottom, left)
}

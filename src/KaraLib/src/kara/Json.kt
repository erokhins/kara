package kara

import javax.servlet.http.HttpServletResponse
import java.util.*

/** JSON Action Result.
 */
class JsonResult(val json: JsonElement) : ActionResult {
    override fun writeResponse(context: ActionContext) {
        val jsonpCallback = context.params.optStringParam("callback")
        val result = StringBuilder()

        if (jsonpCallback != null) result.append(jsonpCallback).append("(")
        json.build(result)
        if (jsonpCallback != null) result.append(")")

        val out = context.response.writer
        out.print(result.toString())
        out.flush()
    }
}

fun jsonString(value: String): JsonValue = JsonValue(value.replace("\\", "\\\\").replace("\"", "\\\"").replace("\r\n", "\n").replace("\n", "\\n").replace("\t", "    "))

interface JsonElement {
    fun build(builder: StringBuilder)
}

class JsonValue(val value: Any) : JsonElement {
    override fun build(builder: StringBuilder) {
        when (value) {
            is Int -> builder.append(value)
            is Long -> builder.append(value)
            is Boolean -> builder.append(value)
            else -> builder.append("\"${value}\"")
        }
    }
}

class JsonRoot : JsonElement {
    private var _element : JsonElement? = null
    fun set(element : JsonElement) { _element = element }
    override fun build(builder: StringBuilder) = _element?.build(builder)
}

class JsonArray : JsonElement {
    private val elements = ArrayList<JsonElement>()

    fun add(value: JsonElement) = elements.add(value)

    override fun build(builder: StringBuilder) {
        builder.append("[")
        var first = true
        for(item in elements) {
            if (!first)
                builder.append(",")
            item.build(builder)
            first = false
        }
        builder.append("]")
    }
}

class JsonObject : JsonElement {
    private val properties = LinkedHashMap<String, JsonElement>()
    fun put(name: String, value: JsonElement) = properties.put(name, value)

    override fun build(builder: StringBuilder) {
        builder.append("{")
        var first = true
        for((key, value) in properties) {
            if (!first)
                builder.append(",")
            builder.append("\"${key}\"")
            builder.append(":")
            value.build(builder)
            first = false
        }
        builder.append("}")
    }

    fun isEmpty(): Boolean {
        return properties.isEmpty()
    }
}

class JsonCode(val code: String) : JsonElement {
    override fun build(builder: StringBuilder) {
        builder.append(code)
    }
}

fun JsonArray.jsonValue(value: String) = add(jsonString(value))
fun JsonArray.jsonValue(value: Number) = add(JsonValue(value))
fun JsonArray.jsonValue(value: Boolean) = add(JsonValue(value))
fun JsonObject.jsonValue(name: String, value: String) = put(name, jsonString(value))
fun JsonObject.jsonValue(name: String, value: Number) = put(name, JsonValue(value))
fun JsonObject.jsonValue(name: String, value: Boolean) = put(name, JsonValue(value))

inline fun JsonArray.jsonObject(body: JsonObject.() -> Unit) {
    val value = JsonObject()
    value.body()
    add(value)
}

inline fun JsonArray.jsonArray(body: JsonArray.() -> Unit) {
    val value = JsonArray()
    value.body()
    add(value)
}

inline fun JsonObject.jsonObject(name: String, body: JsonObject.() -> Unit) {
    val value = JsonObject()
    value.body()
    put(name, value)
}

inline fun JsonObject.jsonArray(name: String, body: JsonArray.() -> Unit) {
    val value = JsonArray()
    value.body()
    put(name, value)
}

inline fun JsonRoot.jsonArray(body: JsonArray.() -> Unit) {
    val array = JsonArray()
    array.body()
    set(array)
}

inline fun JsonRoot.jsonObject(body: JsonObject.() -> Unit){
    val obj = JsonObject()
    obj.body()
    set(obj)
}

inline fun jsonArray(body: JsonArray.() -> Unit) : JsonElement {
    val array = JsonArray()
    array.body()
    return array
}

inline fun jsonObject(body: JsonObject.() -> Unit) : JsonElement {
    val obj = JsonObject()
    obj.body()
    return obj
}

inline fun json(body: JsonRoot.() -> Unit) : JsonResult {
    val json = JsonRoot()
    json.body()
    return JsonResult(json)
}

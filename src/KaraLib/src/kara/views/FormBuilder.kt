package kara

import java.lang.reflect.Method
import org.apache.log4j.Logger
import kara.internal.*
import kotlin.html.*
import kotlin.html.InputType.*

public trait FormModel<P> {
    fun modelName(): String
    fun propertyValue(property: P): String
    fun propertyName(property: P): String
}

class BeanFormModel(val model: Any) : FormModel<String> {
    val modelName = model.javaClass.getSimpleName().toLowerCase()

    override fun modelName(): String {
        return modelName
    }

    override fun propertyValue(property: String): String {
        return model.propertyValue(property).toString() // TODO: Use provided parameter serialization instead of toString
    }

    override fun propertyName(property: String): String {
        return property
    }
}

fun <P,M:FormModel<P>> Tag<CommonAllow>.formForModel(model: M, action : Link, formMethod : Method = Method.post, contents: FormBuilder<P,M>.() -> Unit) {
    builder.contentTag(this, {
        val builder = FormBuilder(model)
        builder.attr.action = action
        builder.attr.method = formMethod
        builder
    }) {
        contents()
        if (hasFiles) {
            attr.enctype = Enctype.multipart_form_data
        }
    }
}

fun Tag<CommonAllow>.formForBean(bean: Any, action : Link, formMethod : Method = Method.post, contents : FormBuilder<String, FormModel<String>>.() -> Unit) {
    formForModel(BeanFormModel(bean), action, formMethod, contents)
}

/**
 * Allows forms to be built based on a model object.
 */
class FormBuilder<P, M:FormModel<P>>(val model : M) : Tag<FORM>(::FORM, "form") {
    val logger = Logger.getLogger(this.javaClass)!!

    /** If true, the form will have enctype="multipart/form-data" */
    var hasFiles : Boolean = false

    fun propertyValue(property: P) : String {
        return model.propertyValue(property)
    }

    fun propertyName(property: P) : String {
        return "${model.modelName()}[${model.propertyName(property)}]"
    }

    fun propertyId(property: P) : String {
        return "form-${model.modelName()}-${model.propertyName(property)}"
    }

    /**
     * Creates a label element for the given property.
     *
     * @param text the text to use for the label (defaults to the property name)
     */
    public fun Tag<CommonAllow>.labelFor(property: P, text : String? = null, c : StyleClass? = null) {
        label(c = c) {
            attr.forId = propertyId(property)
            +(text ?: model.propertyName(property).decamel().capitalize())
        }
    }

    /**
     * Creates an input of the given type for the given property.
     * This method should not generally be used, as all valid input types are mapped to their own methods.
     * It may be convenient, however, if you're trying to assign the input type programmatically.
     */
    public fun Tag<CommonAllow>.inputFor(inputType : InputType, property: P, contents : Tag<INPUT>.() -> Unit = empty_contents) {
        val value = propertyValue(property)
        input(id = propertyId(property)) {
            attr {
                this.type_ = inputType
                this.name = propertyName(property)
                this.value = value
            }
            this.contents()
        }
    }

    /**
     * Creates a textarea for the given property.
     */
    public fun Tag<CommonAllow>.textAreaFor(property: P, contents : Tag<TEXTAREA>.() -> Unit = empty_contents) {
        val value = propertyValue(property)
        textarea(id=propertyId(property)) {
            attr {
                name=propertyName(property)
                text=value
            }
            contents()
        }
    }

    /**
     * Creates a submit button for the form, with an optional name.
     */
    public fun Tag<CommonAllow>.submitButton(value : String, name : String = "submit", contents : Tag<INPUT>.() -> Unit = empty_contents) {
        input() {
            attr {
                this.type_ = InputType.submit
                this.value = value
                this.name = name
            }
            contents()
        }
    }

    /**
     * Creates an input of type text for the given property.
     */
    public fun Tag<CommonAllow>.textFieldFor(property: P, contents : Tag<INPUT>.() -> Unit = empty_contents) {
        inputFor(InputType.text, property, contents)
    }

    /**
     * Creates an input of type password for the given property.
     */
    public fun Tag<CommonAllow>.passwordFieldFor(property: P, contents : Tag<INPUT>.() -> Unit = empty_contents) {
        inputFor(InputType.password, property, contents)
    }

    /**
     * Creates an input of type email for the given property.
     */
    public fun Tag<CommonAllow>.emailFieldFor(property: P, contents : Tag<INPUT>.() -> Unit = empty_contents) {
        inputFor(InputType.email, property, contents)
    }

    /**
     * Creates an input of type tel for the given property.
     */
    public fun Tag<CommonAllow>.telFieldFor(property: P, contents : Tag<INPUT>.() -> Unit = empty_contents) {
        inputFor(InputType.tel, property, contents)
    }

    /**
     * Creates an input of type date for the given property.
     */
    public fun Tag<CommonAllow>.dateFieldFor(property: P, contents : Tag<INPUT>.() -> Unit = empty_contents) {
        inputFor(InputType.date, property, contents)
    }

    /**
     * Creates an input of type datetime for the given property.
     */
    public fun Tag<CommonAllow>.dateTimeFieldFor(property: P, contents : Tag<INPUT>.() -> Unit = empty_contents) {
        inputFor(InputType.datetime, property, contents)
    }

    /**
     * Creates an input of type color for the given property.
     */
    public fun Tag<CommonAllow>.colorFieldFor(property: P, contents : Tag<INPUT>.() -> Unit = empty_contents) {
        inputFor(InputType.color, property, contents)
    }

    /**
     * Creates an input of type number for the given property.
     */
    public fun Tag<CommonAllow>.numberFieldFor(property: P, contents : Tag<INPUT>.() -> Unit = empty_contents) {
        inputFor(InputType.number, property, contents)
    }

    /**
     * Creates an input of type month for the given property.
     */
    public fun Tag<CommonAllow>.monthFieldFor(property: P, contents : Tag<INPUT>.() -> Unit = empty_contents) {
        inputFor(month, property, contents)
    }

    /**
     * Creates an input of type range for the given property.
     */
    public fun Tag<CommonAllow>.rangeFieldFor(property: P, contents : Tag<INPUT>.() -> Unit = empty_contents) {
        inputFor(range, property, contents)
    }

    /**
     * Creates an input of type search for the given property.
     */
    public fun Tag<CommonAllow>.searchFieldFor(property: P, contents : Tag<INPUT>.() -> Unit = empty_contents) {
        inputFor(search, property, contents)
    }

    /**
     * Creates an input of type time for the given property.
     */
    public fun Tag<CommonAllow>.timeFieldFor(property: P, contents : Tag<INPUT>.() -> Unit = empty_contents) {
        inputFor(time, property, contents)
    }

    /**
     * Creates an input of type url for the given property.
     */
    public fun Tag<CommonAllow>.urlFieldFor(property: P, contents : Tag<INPUT>.() -> Unit = empty_contents) {
        inputFor(url, property, contents)
    }

    /**
     * Creates an input of type week for the given property.
     */
    public fun Tag<CommonAllow>.weekFieldFor(property: P, contents : Tag<INPUT>.() -> Unit = empty_contents) {
        inputFor(week, property, contents)
    }

    /**
     * Creates an input of type file for the given property.
     */
    public fun Tag<CommonAllow>.fileFieldFor(property: P, contents : Tag<INPUT>.() -> Unit = empty_contents) {
        inputFor(file, property, contents)
        if (!hasFiles) {
            hasFiles = true
            logger.debug("Setting enctype=multipart/form-data for form due to a file field")
        }
    }

    /**
     * Creates a radio button for the given property and value.
     */
    public fun Tag<CommonAllow>.radioFor(property: P, value : String, contents : Tag<INPUT>.() -> Unit = empty_contents) {
        val modelValue = propertyValue(property)
        input(id = propertyId(property)) {
            attr {
                this.name = propertyName(property)
                this.type_ = radio
                this.value = value
                checked = value.equalsIgnoreCase(modelValue)
            }
            contents()
        }
    }

    /**
     * Creates a checkbox for the given property.
     */
    public fun Tag<CommonAllow>.checkBoxFor(property: P, contents : Tag<INPUT>.() -> Unit = empty_contents) {
        val modelValue = propertyValue(property)
        input(id = propertyId(property)) {
            attr {
                this.type_ = checkbox
                this.name = propertyName(property)
                checked = modelValue == "true"
            }
            contents()
        }
    }
}


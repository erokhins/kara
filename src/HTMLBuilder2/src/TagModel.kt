/*
 * Copyright 2010-2013 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package kotlin.html

import java.util.HashMap
import java.util.ArrayList


trait HtmlBuilder {
    fun <T : TagType> contentTag(containingTag: Tag<*>, tagType: () -> T, contents: Tag<T>.() -> Unit)
    fun AbstractTag.appendText(text: String)
    fun getText(tag: AbstractTag): String?
    fun setText(tag: AbstractTag, value: String?)

    fun renderElement(tag: AbstractTag, strBuilder: StringBuilder, indent: String)
}

enum class RenderStyle {
    adaptive
    expanded
    empty
}

enum class ContentStyle {
    block
    text
    propagate
}

trait TagMetadata: AttributesMap {
    var renderStyle: RenderStyle
    var contentStyle: ContentStyle
    var tagName: String?
}

open class TagType: CommonAttributeGroup, AttributesMap {
    var metadataManager: TagMetadata? = null // must be set!
    val assertMetadataManager: TagMetadata
        get() {
            return metadataManager!!
        }

    public override fun get(attName: String): String {
        return assertMetadataManager[attName]
    }
    public override fun set(attName: String, attValue: String) {
        assertMetadataManager[attName] = attValue
    }
}

trait TagWithText

trait DeprecateTags

abstract class AbstractTag(val builder: HtmlBuilder = DefaultHtmlBuilder()) {
    val attributes = HashMap<String, String>()
    val children: MutableList<AbstractTag> = ArrayList<AbstractTag>()

    var metada = object : TagMetadata {
        override var tagName: String? = null
        override var renderStyle: RenderStyle = RenderStyle.expanded
        override var contentStyle: ContentStyle = ContentStyle.block

        public override fun get(attName: String): String {
            val answer = attributes[attName]
            if (answer == null) throw RuntimeException("Atrribute $attName is missing")
            return answer
        }
        public override fun set(attName: String, attValue: String) {
            attributes[attName] = attValue
        }
    }

    public open fun renderElement(strBuilder: StringBuilder, indent: String) {
        builder.renderElement(this, strBuilder, indent)
    }

    public fun String.plus() {
        assertAllowText()
        with(builder) {
            appendText(this@plus)
        }
    }

    public var text: String?
        get() {
            assertAllowText()
            return builder.getText(this@AbstractTag)
        }
        set(value) {
            assertAllowText()
            builder.setText(this@AbstractTag, value)
        }

    protected abstract fun assertAllowText()
}

class Tag<out T>(val tagType: () -> T, tagName: String? = null, builder: HtmlBuilder = DefaultHtmlBuilder()) : AbstractTag(builder), DeprecateTags {
    {
        metada.tagName = tagName
    }
    protected override fun assertAllowText() {
        if (tagType() !is TagWithText) {
            throw IllegalStateException("Text not allow in tag: ${metada.tagName}")
        }
    }
}

fun <T : TagType> Tag<*>.contentTag(tag: () -> T, tagName: String, c: StyleClass? = null, id: String? = null,
                                    contents: Tag<T>.() -> Unit = empty_contents,
                                    renderStyle: RenderStyle = RenderStyle.expanded,
                                    contentStyle: ContentStyle = ContentStyle.block) {
    builder.contentTag(this, tag) {
        metada.tagName = tagName
        metada.renderStyle = renderStyle
        metada.contentStyle = contentStyle
        if (c != null) attr.c = c
        if (id != null) attr.id = id

        contents()
    }
}

val <T : TagType> Tag<T>.attr: T
    get() {
        val tagType = tagType()
        tagType.metadataManager = metada
        return tagType
    }
fun <T : TagType> Tag<T>.attr(f: T.() -> Unit) {
    attr.f()
}

fun <T : TagType> Tag<T>.style(init: StyledElement.()->Unit) {
    val element = StyledElement("inline")
    element.init()
    val builder = StringBuilder()
    for ((k, v) in element.attributes) {
        builder.append("$k:$v;")
    }
    this.attr.style = builder.toString()
}


val <T> empty_contents: T.() -> Unit = { }

class InvalidHtmlException(val message: String) : RuntimeException(message)

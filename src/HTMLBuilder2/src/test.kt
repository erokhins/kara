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

import kotlin.html5.*
import kotlin.html5.deprecated.*


class FOO(tag: Tag<*>) : TagType(tag), CommonAllow
    var FOO.bar = 2

fun Tag<CommonAllow>.foo(id: String? = null, c: StyleClass? = null, contents: Tag<FOO>.() -> Unit = empty_contents) = contentTag(::FOO, "foo", c, id, contents)

deprecated("") fun Tag<Any>.foo(id: String? = null, c: StyleClass? = null, contents: Tag<FOO>.() -> Unit = empty_contents) {}

fun TagWithText<DIV>.f() {
    +""
    attr {
        id = ""
    }
    div {
        foo {
            attr.bar = 2
            attr {
                bar = 4
                id = "id34"
            }
            span {

            }
        }
        table {
            td {

            }
            div {

            }
            foo {}
            tr {
                +""
                td {
                    foo {}
                    +""
                    keygen {
                        attr.name = "sdg"
                        attr {
                            form = "form"
                        }
                        +""
                        table {
                            foo {}
                        }
                    }
                }
            }
        }
    }
}

fun main(args: Array<String>) {
    TagWithText<DIV>(null, ::DIV, "div").f()
    println()
}
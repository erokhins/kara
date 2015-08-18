package kara.tests.controllers


import kara.Application
import kotlin.test.*
import javax.servlet.http.*
import kara.tests.mock.*
import org.apache.log4j.AppenderSkeleton
import org.junit.Test
import org.junit.Before
import org.apache.log4j.BasicConfigurator
import org.apache.log4j.spi.LoggingEvent
import kotlin.html.htmlEscapeTo


/** Tests for executing actions */
class ActionTests() {
    Before fun setUp() {
        BasicConfigurator.configure()
    }

    Test fun basicHtmlLayout() {
        val response = mockDispatch("GET", "/")
        val output = response.stringOutput()
        assertEquals("text/html", response._contentType, "Content type should be html")

        assertTrue(output?.contains("Default Layout") as Boolean, "Home view contains layout")
        assertTrue(output?.contains("Welcome Home") as Boolean, "Home view contains view")
        assertTrue(output?.contains("&lt;h2&gt;MakeSureThisIsEscaped&lt;/h2&gt;") as Boolean, "Proper escaping not applied : $output")
    }

    Test fun runActionTests() {
        assertResponse("blank", "/foo/blank")
        assertResponse("bar", "/foo/bar")
        assertResponse("list: bar", "/foo/bar/list")
        assertResponse("complex: bar id = 42", "/foo/complex/bar/list/42")
        assertResponse("complex: bar id = 42", "/foo/complex/bar/list/42?param")
        assertResponse("show 42", "/crud/42")
        assertResponse("compute: 42, 3.12", "/foo/compute/42/3.12")
        assertResponse("compute: 42, 3.12", "/foo/compute?anInt=42&aFloat=3.12")
    }

    Test fun doubleSlashesOK() {
        assertResponse("blank", "/foo//blank")
        assertResponse("bar", "/foo////bar")
        assertResponse("list: bar", "/foo///bar//list")
        assertResponse("complex: bar id = 42", "/foo/complex/bar//list//42")
        assertResponse("complex: bar id = 42", "/foo//complex/bar/list/42?param")

    }

    Test fun optionalTests() {
        assertResponse("optional/null", "/optional")
        assertResponse("optional/44", "/optional/44")
        assertEquals("/optional", Routes.Optional(null).href())
        assertEquals("/optional/44", Routes.Optional("44").href())
    }

    Test fun redirect() {
        val response = mockDispatch("GET", "/foo/redirect")
        assertEquals(HttpServletResponse.SC_MOVED_TEMPORARILY, response.status)
        assertEquals("/foo/bar", response.stringOutput())
    }

    Test fun externalForm() {
        assertEquals("/test", Routes.Test().href())
        assertEquals("/foo/bar", Routes.Foo.Bar().href())
        assertEquals("/foo/compute?anInt=42&aFloat=3.1415", Routes.Foo.ComputeQuery(42, 3.1415.toFloat()).href())
        assertEquals("/foo/compute/42/3.1415", Routes.Foo.Compute(42, 3.1415.toFloat()).href())
    }

    Test fun htmlReplacement() {
        val builder = StringBuilder()
        "foo<x>bar".htmlEscapeTo(builder)
        assertEquals("foo&lt;x&gt;bar", builder.toString())
    }

    Test fun errorLogged() {
        TestAppender.register()
        val response = mockDispatch("GET", Routes.Error(false).href())
        assertTrue(TestAppender.smthWasLogged)
        assertEquals(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, response._status)
    }

    Test fun socketErrorNotLogged() {
        TestAppender.register()
        val response = mockDispatch("GET", Routes.Error(true).href())
        assertFalse(TestAppender.smthWasLogged)
        assertEquals(HttpServletResponse.SC_OK, response._status)
    }

    fun assertResponse(expected : String, url : String) {
        val response = mockDispatch("GET", url)
        assertEquals(expected, response.stringOutput())
    }

    object TestAppender : AppenderSkeleton() {

        var smthWasLogged: Boolean = false

        override fun close() {
            Application.logger.removeAppender(this)
        }

        override fun requiresLayout(): Boolean = false

        override fun append(p0: LoggingEvent?) {
            smthWasLogged = true
        }

        fun register() {
            smthWasLogged = false
            Application.logger.addAppender(this)
        }
    }
}

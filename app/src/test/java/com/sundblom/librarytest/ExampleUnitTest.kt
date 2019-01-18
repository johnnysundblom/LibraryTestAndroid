package com.sundblom.librarytest

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import org.junit.Test

import org.junit.Assert.*
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.runners.MockitoJUnitRunner
import org.robolectric.RobolectricTestRunner
import org.mockito.Mockito.`when`

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */

@RunWith(RobolectricTestRunner::class)
class ExampleUnitTest {
    private val expectedString = "This is the test string!"

    @Test
    fun testMyClass() {
        val context: Context = ApplicationProvider.getApplicationContext<Context>()
        val myClass = MyClass(context)
        assertEquals(expectedString, myClass.getTestString())
    }
}

@RunWith(MockitoJUnitRunner::class)
class ExampleUnitTestMock {
    private val expectedString = "This is the test string!"

    @Mock
    private lateinit var context: Context

    @Test
    fun testMyClassMock() {
        `when`(context.getString(R.string.test)).thenReturn(expectedString)

        val myClass = MyClass(context)
        val value =  myClass.getTestString()
        assertEquals(expectedString, value)
    }
}

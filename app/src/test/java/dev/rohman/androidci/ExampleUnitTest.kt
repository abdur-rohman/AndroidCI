package dev.rohman.androidci

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        // given
        val expected = 4

        // when
        val sum = { x: Int, y: Int -> x + y }

        // result
        assertEquals(expected, sum(2, 2))
    }
}
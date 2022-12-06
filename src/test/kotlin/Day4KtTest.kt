import advent.of.code.day4.day4Part1
import advent.of.code.day4.day4Part2

import kotlin.test.Test
import kotlin.test.assertEquals

class Day4KtTest {
    private val inputString = """
        2-4,6-8
        2-3,4-5
        5-7,7-9
        2-8,3-7
        6-6,4-6
        2-6,4-8
    """.trimIndent()

    @Test
    fun day4Part1() {
        assertEquals(2, day4Part1(inputString))
    }

    @Test
    fun day4Part2() {
        assertEquals(4, day4Part2(inputString))
    }
}
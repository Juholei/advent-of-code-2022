import advent.of.code.day1.day1Part1
import advent.of.code.day1.day1Part2
import kotlin.test.Test
import kotlin.test.assertEquals

class Day1Test {
    private val inputString =
        """
        1000
        2000
        3000
    
        4000
    
        5000
        6000
    
        7000
        8000
        9000
    
        10000
        """.trimIndent()

    @Test
    fun testDay1Part1() {
        assertEquals(24000, day1Part1(inputString))
    }

    @Test
    fun testDay1Part2() {
        assertEquals(45000, day1Part2(inputString))
    }
}
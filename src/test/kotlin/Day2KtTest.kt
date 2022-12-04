import advent.of.code.day2.day2Part1
import kotlin.test.Test
import kotlin.test.assertEquals

class Day2KtTest {
    private val inputString = """
        A Y
        B X
        C Z
        """.trimIndent()

    @Test
    fun day2Part1() {
        assertEquals(15, day2Part1(inputString))
    }
}
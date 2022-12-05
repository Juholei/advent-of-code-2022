import advent.of.code.day3.day3Part1
import advent.of.code.day3.day3Part2
import kotlin.test.Test
import kotlin.test.assertEquals

class Day3KtTest {

    private val inputString = """
        vJrwpWtwJgWrhcsFMMfFFhFp
        jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL
        PmmdzqPrVvPwwTWBwg
        wMqvLMZHhHMvwLHjbvcjnnSBnvTQFn
        ttgJtRGJQctTZtZT
        CrZsJsPPZsGzwwsLwLmpwMDw
    """.trimIndent()

    @Test
    fun day3Part1() {
        assertEquals(157, day3Part1(inputString))
    }

    @Test
    fun day3Part2() {
        assertEquals(70, day3Part2(inputString))
    }
}
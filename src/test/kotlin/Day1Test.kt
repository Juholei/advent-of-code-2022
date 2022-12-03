import kotlin.test.Test
import kotlin.test.assertEquals

class Day1Test {
    @Test
    fun testDay1() {
        val inputString =
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
        assertEquals(24000, day1(inputString))
    }
}
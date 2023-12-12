import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class SolutionTest {

    private val solution = Solution()

    @Test
    fun numDecodings1() {
        assertEquals(0, solution.numDecodings(""))
    }
    @Test
    fun numDecodings2() {
        assertEquals(0, solution.numDecodings("0"))
    }
    @Test
    fun numDecodings4() {
        assertEquals(3, solution.numDecodings("226"))
    }
    @Test
    fun numDecodings5() {
        assertEquals(9, solution.numDecodings("123123"))
    }
    @Test
    fun numDecodings6() {
        assertEquals(1836311903, solution.numDecodings("111111111111111111111111111111111111111111111"))
    }
}
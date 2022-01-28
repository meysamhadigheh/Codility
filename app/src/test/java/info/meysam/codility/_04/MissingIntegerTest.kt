package info.meysam.codility._04

import org.junit.Assert.*

import org.junit.Test

class MissingIntegerTest {

    @Test
    fun solution() {

        val missingInteger =MissingInteger()


        assertEquals(5,missingInteger.solution(listOf<Int>(1, 3, 6, 4, 1, 2).toIntArray()))
        assertEquals(4,missingInteger.solution(listOf<Int>(1, 2, 3).toIntArray()))
        assertEquals(1,missingInteger.solution(listOf<Int>(-1,-3).toIntArray()))
    }
}
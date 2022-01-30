package info.meysam.codility._10

import org.junit.Assert.*

import org.junit.Test

class CountFactorsTest {

    @Test
    fun solution() {



        val countFactors=CountFactors()

        assertEquals(8,countFactors.solution(24))
        assertEquals(9,countFactors.solution(36))
    }
}
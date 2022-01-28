package info.meysam.codility._06

import org.junit.Assert.*

import org.junit.Test

class DistinctTest {

    @Test
    fun solution() {

        val distinct=Distinct()

        assertEquals(3,distinct.solution(intArrayOf(2,1,1,2,3,1)))
    }
}
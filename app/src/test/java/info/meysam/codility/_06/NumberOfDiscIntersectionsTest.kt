package info.meysam.codility._06

import org.junit.Assert.*

import org.junit.Test

class NumberOfDiscIntersectionsTest {

    @Test
    fun solution() {


        val numberOfDiscIntersections=NumberOfDiscIntersections()

        assertEquals(11,numberOfDiscIntersections.solution(intArrayOf(1,5,2,1,4,0)))
    }
}
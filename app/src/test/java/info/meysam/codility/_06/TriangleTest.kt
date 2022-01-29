package info.meysam.codility._06

import org.junit.Assert.*

import org.junit.Test

class TriangleTest {

    @Test
    fun solution() {

        val triangle =Triangle()

        assertEquals(1,triangle.solution(intArrayOf(10,2,5,1,8,20)))
        assertEquals(0,triangle.solution(intArrayOf(10,50,5,1)))
    }
}
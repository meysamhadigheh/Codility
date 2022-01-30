package info.meysam.codility._10

import org.junit.Assert.*

import org.junit.Test

class PeaksTest {

    @Test
    fun solution() {

        val peaks =Peaks()

        assertEquals(3,peaks.solution(intArrayOf(1,2,3,4,3,4,1,2,3,4,6,2)))
    }
}
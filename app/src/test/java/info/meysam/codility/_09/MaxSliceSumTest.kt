package info.meysam.codility._09

import org.junit.Assert.*

import org.junit.Test

class MaxSliceSumTest {

    @Test
    fun solution() {

        val maxSliceSum= MaxSliceSum()

        assertEquals(5,maxSliceSum.solution(intArrayOf(3,2,-6,4,0)))
    }
}
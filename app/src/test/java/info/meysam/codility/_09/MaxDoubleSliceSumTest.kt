package info.meysam.codility._09

import org.junit.Assert.*

import org.junit.Test

class MaxDoubleSliceSumTest {

    @Test
    fun solution() {


        val maxDoubleSliceSum=MaxDoubleSliceSum()

        assertEquals(17,maxDoubleSliceSum.solution(intArrayOf(3,2,6,-1,4,5,-1,2)))


    }
}
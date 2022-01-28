package info.meysam.codility._05

import org.junit.Assert.*

import org.junit.Test

class MinAvgTwoSliceTest {

    @Test
    fun solution() {

        val minAvgTwoSlice=MinAvgTwoSlice()

        assertEquals(1,minAvgTwoSlice.solution(listOf(4,2,2,5,1,5,8).toIntArray()))
    }
}
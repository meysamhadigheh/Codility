package info.meysam.codility._09

import org.junit.Assert.*

import org.junit.Test

class MaxProfitTest {

    @Test
    fun solution() {


        val maxProfit=MaxProfit()

        assertEquals(356,maxProfit.solution(intArrayOf(23171,21011,21123,21366,21013,21367)))


    }
}
package info.meysam.codility._04

import org.junit.Assert.*

import org.junit.Test

class MaxCountersTest {

    @Test
    fun solution() {


        val maxCounters=MaxCounters()


        assertArrayEquals( listOf(3, 2, 2, 4, 2).toIntArray(),maxCounters.solution(5, listOf(3,4,4,6,1,4,4).toIntArray()))
    }
}
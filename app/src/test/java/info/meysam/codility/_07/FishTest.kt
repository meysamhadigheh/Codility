package info.meysam.codility._07

import org.junit.Assert.*

import org.junit.Test

class FishTest {

    @Test
    fun solution() {

        val fish =Fish()

        assertEquals(2,fish.solution(intArrayOf(4,3,2,1,5), intArrayOf(0,1,0,0,0)))
        assertEquals(1,fish.solution(intArrayOf(4,3,2,1,5), intArrayOf(0,1,1,1,0)))
    }
}
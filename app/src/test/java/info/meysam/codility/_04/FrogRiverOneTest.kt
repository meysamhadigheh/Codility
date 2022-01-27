package info.meysam.codility._04

import org.junit.Assert.*

import org.junit.Test

class FrogRiverOneTest {

    @Test
    fun solution() {


        val frogRiverOne=FrogRiverOne()

        assertEquals(6,frogRiverOne.solution(5,listOf(1,3,1,4,2,3,5,4).toIntArray()))
        assertEquals(-1,frogRiverOne.solution(4,listOf(1,3,1,4,3,5,4).toIntArray()))
    }
}
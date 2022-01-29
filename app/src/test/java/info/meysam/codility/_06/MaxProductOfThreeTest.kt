package info.meysam.codility._06

import org.junit.Assert.*

import org.junit.Test

class MaxProductOfThreeTest {

    @Test
    fun solution() {

        val maxProductOfThree=MaxProductOfThree()

        assertEquals(60,maxProductOfThree.solution(intArrayOf(-3,1,2,-2,5,6)))
    }
}
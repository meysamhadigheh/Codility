package info.meysam.codility._02

import org.junit.Assert.*

import org.junit.Test

class OddOccurrencesInArrayTest {

    @Test
    fun solution() {

        val oddOccurrencesInArray=OddOccurrencesInArray()


        assertEquals(7,oddOccurrencesInArray.solution(listOf(2,5,9,3,9,3,9,7,9,5,2).toIntArray()))
    }
}
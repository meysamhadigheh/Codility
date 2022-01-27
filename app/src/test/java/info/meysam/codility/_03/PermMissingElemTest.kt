package info.meysam.codility._03

import org.junit.Assert.*

import org.junit.Test

class PermMissingElemTest {

    @Test
    fun solution() {

        val permMissingElem=PermMissingElem()

        assertEquals(4,permMissingElem.solution(listOf(1,2,3,5).toIntArray()))
    }
}
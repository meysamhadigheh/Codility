package info.meysam.codility._03

import org.junit.Assert.*

import org.junit.Test

class FrogJmpTest {

    @Test
    fun solution() {

        val frogJmp=FrogJmp()

        assertEquals(3,frogJmp.solution(10,85,30))
    }
}
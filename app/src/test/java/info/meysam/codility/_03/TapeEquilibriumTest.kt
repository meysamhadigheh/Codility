package info.meysam.codility._03

import org.junit.Assert.*

import org.junit.Test

class TapeEquilibriumTest {

    @Test
    fun solution() {


        val tapeEquilibrium= TapeEquilibrium()

        assertEquals(1, tapeEquilibrium.solution(listOf(3,1,2,4,3).toIntArray()))
    }
}
package info.meysam.codility._04

import org.junit.Assert.*

import org.junit.Test

class PermCheckTest {

    @Test
    fun solution() {



        val permCheck= PermCheck()

        assertEquals(1, permCheck.solution(listOf<Int>(4,1,3,2).toIntArray()))
        assertEquals(0, permCheck.solution(listOf<Int>(4,1,3).toIntArray()))
    }
}
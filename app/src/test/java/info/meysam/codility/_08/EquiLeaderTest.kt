package info.meysam.codility._08

import org.junit.Assert.*

import org.junit.Test

class EquiLeaderTest {

    @Test
    fun solution() {

        var equiLeader =EquiLeader()

        assertEquals(2,equiLeader.solution(intArrayOf(4,3,4,4,4,2)))
    }
}
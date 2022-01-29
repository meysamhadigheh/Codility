package info.meysam.codility._07

import org.junit.Assert.*

import org.junit.Test

class StoneWallTest {

    @Test
    fun solution() {



        val stoneWall=StoneWall()
        assertEquals(7,stoneWall.solution(intArrayOf(8,8,5,7,9,8,7,4,8)))
    }
}
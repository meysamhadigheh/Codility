package info.meysam.codility._08

import org.junit.Assert.*

import org.junit.Test

class DominatorTest {

    @Test
    fun solution() {

        val dominator =Dominator()

        assertEquals(0,dominator.solution(intArrayOf(3,4,3,2,3,-1,3,3)))
    }
}
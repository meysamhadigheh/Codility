package info.meysam.unikie

import org.junit.Assert.*

import org.junit.Test

class demoTest {

    @Test
    fun solution() {

        var demo=demo()


        assertEquals(5,demo.solution(intArrayOf(1, 3, 6, 4, 1, 2)))
        assertEquals(4,demo.solution(intArrayOf(1,2,3)))
        assertEquals(1,demo.solution(intArrayOf(-1,-3)))
    }
}
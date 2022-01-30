package info.meysam.unikie

import org.junit.Assert.*

import org.junit.Test

class test2Test {

    @Test
    fun solution() {


        val test2=test2()

        assertEquals("SUMMER",test2.solution(intArrayOf(-3,-14,-5,7,8,42,8,3)))
        assertEquals("WINTER",test2.solution(intArrayOf(-3,78,-5,7,8,42,8,3)))
        assertEquals("SPRING",test2.solution(intArrayOf(-3,-14,-55,7,8,42,8,3)))
        assertEquals("AUTUMN",test2.solution(intArrayOf(2,-3,3,1,10,8,2,5,13,-5,3,-18)))
    }
}
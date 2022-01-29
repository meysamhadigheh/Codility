package info.meysam.codility._07

import org.junit.Assert.*

import org.junit.Test

class NestingTest {

    @Test
    fun solution() {

        var nesting =Nesting()

        assertEquals(1,nesting.solution("(()(())())"))
        assertEquals(0,nesting.solution("())"))
    }
}
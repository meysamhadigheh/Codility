package info.meysam.codility._07

import org.junit.Assert.*

import org.junit.Test

class BracketsTest {

    @Test
    fun solution() {

        val brackets =Brackets()


        assertEquals(1,brackets.solution("{[()()]}"))
        assertEquals(0,brackets.solution("([)()]"))
    }
}
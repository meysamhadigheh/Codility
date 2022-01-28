package info.meysam.codility._05

import org.junit.Assert.*

import org.junit.Test

class CountDivTest {

    @Test
    fun solution() {


        val countDiv=CountDiv()

        assertEquals(999999998,countDiv.solution(6,2_000_000_000,2))
    }
}
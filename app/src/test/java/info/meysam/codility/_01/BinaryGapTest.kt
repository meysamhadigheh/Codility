package info.meysam.codility._01

import org.junit.Assert
import org.junit.Assert.*

import org.junit.Test

class BinaryGapTest {

    @Test
    fun solution() {

        val binaryGap=BinaryGap()


        assertEquals(4,binaryGap.solution(529))
        assertEquals(5,binaryGap.solution(1041))
    }
}
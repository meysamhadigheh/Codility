package info.meysam.codility._02

import org.junit.Assert
import org.junit.Test


class CyclicRotationTest {

    @Test
    fun solution() {


        var A = listOf<Int>(3, 8, 9, 7, 6).toIntArray()
        var K = 3

        var cyclicRotation=CyclicRotation()


        Assert.assertArrayEquals(cyclicRotation.solution(A,K),listOf(9, 7, 6, 3, 8).toIntArray())


    }
}
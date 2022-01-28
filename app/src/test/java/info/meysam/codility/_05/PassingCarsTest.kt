package info.meysam.codility._05

import org.junit.Assert.*

import org.junit.Test

class PassingCarsTest {

    @Test
    fun solution() {


        val passingCars =PassingCars()

        assertEquals(5,passingCars.solution(listOf(0,1,0,1,1).toIntArray()))
    }
}
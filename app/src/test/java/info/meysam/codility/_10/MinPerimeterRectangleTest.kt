package info.meysam.codility._10

import org.junit.Assert.*

import org.junit.Test

class MinPerimeterRectangleTest {

    @Test
    fun solution() {


        val minPerimeterRectangle=MinPerimeterRectangle()

        assertEquals(22,minPerimeterRectangle.solution(30))
        assertEquals(24,minPerimeterRectangle.solution(32))
    }
}
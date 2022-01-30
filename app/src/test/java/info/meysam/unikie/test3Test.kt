package info.meysam.unikie

import org.junit.Assert.*

import org.junit.Test

class test3Test {

    @Test
    fun solution() {


        val test3 =test3()

        //OK
        //Wrong answer
        //Time limit exceeded
        //Runtime error


        assertEquals(20,test3.solution(arrayOf("test1a", "test2","test1b","test1c","test3","test14","test15a"),arrayOf("Wrong answer", "OK", "Runtime error","OK","Time limit exceeded","Time limit exceeded","Time limit exceeded")))
    }
}
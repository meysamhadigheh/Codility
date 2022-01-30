package info.meysam.unikie

import org.junit.Test
import org.junit.Assert.*


class Test1Test {
    @Test
    fun solution() {


        val test1=Test1()


        assertEquals(2,test1.solution(intArrayOf(1,2,5,9,9),5))

    }
    @Test
    fun solution2() {


        val test1=Test1()



        assertEquals(4,test1.solution(intArrayOf(1,2,5,8,9),9))

    }
    @Test
    fun solution3() {


        val test1=Test1()


        assertEquals(3,test1.solution(intArrayOf(1,2,5,8,9),8))

    }
    @Test
    fun solution4() {


        val test1=Test1()



        assertEquals(1,test1.solution(intArrayOf(1,2,5,8,9),2))

    }
    @Test
    fun solution5() {


        val test1=Test1()



        assertEquals(0,test1.solution(intArrayOf(1,2,5,8,9),1))
    }

    @Test
    fun solution6() {


        val test1=Test1()



        assertEquals(4,test1.solution(intArrayOf(1,2,5,9,9),9))
    }
    @Test
    fun solution7() {


        val test1=Test1()



        assertEquals(4,test1.solution(intArrayOf(1,2,5,9,9),9))
    }

    @Test
    fun solution8() {


        val test1=Test1()



        assertEquals(-1,test1.solution(intArrayOf(1,2,5,9,9),10))
    }
    @Test
    fun solution9() {


        val test1=Test1()



        assertEquals(-1,test1.solution(intArrayOf(1,2,5,9,9),0))
    }
    @Test
    fun solution10() {


        val test1=Test1()



        assertEquals(-1,test1.solution(intArrayOf(-2,-1,5,9,9),-3))
    }
    @Test
    fun solution11() {


        val test1=Test1()



        assertEquals(-1,test1.solution(intArrayOf(-2),1))
        assertEquals(0,test1.solution(intArrayOf(-2),-2))
        assertEquals(-1,test1.solution(intArrayOf(-2),-3))
    }
    @Test
    fun solution12() {


        val test1=Test1()



        assertEquals(4,test1.solution(intArrayOf(-2000000000,-2,5,10,2000000000),2000000000))
        assertEquals(0,test1.solution(intArrayOf(-2000000000,-2,5,10,2000000000),-2000000000))
        assertEquals(-1,test1.solution(intArrayOf(-2000000000,-2,5,10,2000000000),-2000000001))
        assertEquals(0,test1.solution(intArrayOf(-2),-2))
        assertEquals(-1,test1.solution(intArrayOf(-2),-3))
    }

    @Test
    fun solution13() {


        val test1=Test1()




        assertEquals(3,test1.solution(intArrayOf(1,2,2,5,6),5))

    }

}
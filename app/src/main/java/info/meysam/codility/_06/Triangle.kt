package info.meysam.codility._06

import java.util.*

class Triangle {

    fun solution(A: IntArray): Int {
        // write your code in Kotlin 1.3.11 (Linux)


        //region answer mine
        Arrays.sort(A)


        for (i in 0 .. A.size-3){

            if(A[i].toLong()+A[i+1].toLong()>A[i+2].toLong()){

                return 1
            }
        }

        return 0

        //endregion

    }
}
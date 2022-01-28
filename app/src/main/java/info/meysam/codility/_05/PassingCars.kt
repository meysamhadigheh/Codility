package info.meysam.codility._05

import java.util.*

class PassingCars {

    fun solution(A: IntArray): Int {
        // write your code in Kotlin 1.3.11 (Linux)


        // region mine
//        var sum=0
//
//        for ( i in 0..A.size-2){
//
//            if (A[i]==0){
//                sum += Collections.frequency(A.takeLast(A.size-i-1), 1)
//            }
//        }
//
//        return sum


        //endregion


        // note: find number of pairs (P, Q)
        // where P < Q (important)
        // try to use "one pass" solution (low time complexity)
        var num_east = 0 // initial

        var num_pass = 0 // initial


        for (i in A.indices) {
            if (A[i] == 0) { // to east
                num_east++
            }
            if (A[i] == 1) { // to west
                num_pass += num_east
            }
            // note: just look back "num_east"
            //       that will be the number of cars can be paired
            //       (with the current car)
        }


        // note 1: can use "_" for a big value
        // note 2: "num_pass < 0" is for the "overflow" cases
        //         when "overflow" occurs, the value will "< 0" (important)
        return if (num_pass > 1000000000 || num_pass < 0) -1 else num_pass
    }
}
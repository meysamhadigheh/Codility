package info.meysam.codility._03

import kotlin.math.abs

class TapeEquilibrium {


    fun solution(A: IntArray): Int {
        // write your code in Kotlin 1.3.11 (Linux)

        // region mine
//        var len = A.size
//        var flag = true
//        var min = 0
//        for (i in 1..A.size) {
//
//            var right = (A.take(i)).sum()
//            var left = (A.takeLast(len - i)).sum()
//
//            var minus = abs(right - left)
//
//            if (flag) {
//
//                min = minus
//                flag = false
//            } else {
//
//                if (minus < min) {
//
//                    min = minus
//                }
//
//            }
//        }
//
//
//        return min

        // endregion


        // write your code in Java SE 8

        // First, compute the sum (will be used for several times)
        // write your code in Java SE 8

        // Using the concept of Sum
        // and, (sum of the 2nd part) = Sum - (sum of the 1st part)
        // importantly, difference = |(sum of the 2nd part) - (sum of the 1st part)|

        // First, compute the sum (will be used for several times)
        var sum = 0 // initial

        for (element in A) {
            sum += element
        }

        // then, find the minimum difference
        var min_diff = Int.MAX_VALUE // initial setting: Integer.MAX_VALUE


        var sum_part_one = 0
        var sum_part_two = 0
        var diff = 0



        // try to compute the above values in "one pass"!
        // for the possible partition-point P
        for (p in 1 until A.size) {
            /* no need to use the second for loop (important)
            for(int j=0; j< p; j++){ // to compute the sum of the 1st part
                sum_part_one = sum_part_one + A[j];
            }
            */
            sum_part_one += A[p - 1] // the sum of part one
            sum_part_two = sum - sum_part_one // the sum of part two
            diff = sum_part_one - sum_part_two // the difference

            min_diff = Math.min(min_diff, abs(diff)) // min difference
        }
        return min_diff // return the min difference

    }
}
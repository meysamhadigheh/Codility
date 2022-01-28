package info.meysam.codility._05

import kotlin.math.floor

class CountDiv {

    fun solution(A: Int, B: Int, K: Int): Int {
        // write your code in Kotlin 1.3.11 (Linux)



        // region mine
//        var sum=0
//        for(i in A .. B){
//            if(i%K==0) sum++
//        }
//
//        return sum

        //endregion

        // need to achieve low complexity O(1)
        // using math equation (low complexity)

        // number of divisible values smaller than B
        val num_B = floor((B / K).toDouble()).toInt()
        // note: take "Math.floor" which is the basic number

        // number of divisible values smaller than A
        val num_A = floor((A / K).toDouble()).toInt()
        // note: take "Math.floor" which is the basic number

        // number of divisible numbers
        var num_div = num_B - num_A

        // note: plus one (if A % K == 0)
        // because "A" is also divisible
        // without "plus", "A" will be deducted
        var plus = 0
        if (A % K == 0) plus = 1

        // num_div + plus
        num_div += plus

        // return the number of K-divisible values between A and B
        return num_div
    }
}
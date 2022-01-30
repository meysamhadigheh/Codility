package info.meysam.codility._10

import kotlin.math.sqrt

class CountFactors {

    fun solution(N: Int): Int {
        // write your code in Kotlin 1.3.11 (Linux)



        // region mine wrong some cases
//        if (N==1) return 1
//
//        var reminder= N
//        val factors:HashMap<Int,Int> = HashMap()
//        while (reminder!=1){
//
//            for (i in 2 .. N){
//                if (reminder%i==0){
//
//                    if (factors.containsKey(i)){
//
//                        var number:Int= factors[i]!!
//                        number +=1
//                        factors[i] =number
//
//
//                    }else{
//                        factors[i]=1
//                    }
//
//                    reminder /= i
//                    break
//
//
//                }
//            }
//        }
//
//        var result =1
//        val values= factors.values.toIntArray()
//
//        for (i in 0 until factors.size){
//
//            result *=(values[i]+1)
//
//        }
//
//        return if (values.size==1)  2 else result

        //endregion


        // main idea:
        // check from 1 to "sqrt_of_N"
        // then, taking its pair into consideration
        // ---> numFactor = numFactor * 2;
        val sqrtN = sqrt(N.toDouble()).toInt()
        var numFactor = 0 // number of factors


        // check if i is a factor or not (by using N % i ==0)
        for (i in 1..sqrtN) {
            if (N % i == 0) {
                numFactor++
            }
        }

        numFactor *= 2 // add its pair


        // be careful: check if "sqrtN * sqrtN == N"
        if (sqrtN * sqrtN == N) {
            numFactor -= 1 // minus one: avoid double counting
        }

        return numFactor


    }
}
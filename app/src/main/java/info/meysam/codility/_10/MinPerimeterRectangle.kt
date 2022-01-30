package info.meysam.codility._10

import kotlin.math.sqrt

class MinPerimeterRectangle {

    fun solution(N: Int): Int {
        // write your code in Kotlin 1.3.11 (Linux)

        val sqrtN = sqrt(N.toDouble()).toInt()
        var numFactor = 0 // number of factors


        // check if i is a factor or not (by using N % i ==0)
        for (i in sqrtN downTo 1) {
            if (N % i == 0) {
                numFactor =i
                break
            }
        }

        return (numFactor + N/numFactor)*2
    }
}
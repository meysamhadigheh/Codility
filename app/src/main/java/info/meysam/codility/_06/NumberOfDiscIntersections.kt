package info.meysam.codility._06

import java.util.*

class NumberOfDiscIntersections {

    fun solution(A: IntArray): Int {
        // write your code in Kotlin 1.3.11 (Linux)

        // main idea:
        // 1. store all the "lower points" and "upper points" of the discs
        // 2. count the intersections (if one upper point > one lower point)

        // note: use "long" for big numbers (be careful)
        val lower = LongArray(A.size)
        val upper = LongArray(A.size)

        for (i in A.indices) {
            lower[i] = i - A[i].toLong() // note: lower = center - A[i]
            upper[i] = i + A[i].toLong() // note: upper = center + A[i]
        }

        // "sort" the "lower points" and "upper points"
        Arrays.sort(upper)
        Arrays.sort(lower)

        var intersection = 0 // number of intersections

        var j = 0 // for the lower points

        // scan the upper points
        for (i in A.indices) {

            // for the current "j" (lower point)
            while (j < A.size && upper[i] >= lower[j]) {
                intersection += j // add j intersections
                intersection -= i // minus "i" (avoid double count)
                j++
            }
        }


        // for the overflow cases
        return if (intersection > 10000000) -1 else intersection  // number of intersections


    }
}
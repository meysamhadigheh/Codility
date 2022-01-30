package info.meysam.codility._09

class MaxSliceSum {

    fun solution(A: IntArray): Int {
        // write your code in Kotlin 1.3.11 (Linux)


        // initial setting A[0]
        var maxEndingPrevious = A[0]
        var maxEndingHere = A[0]
        var maxSoFar = A[0]


        // note: for i=0, it will return A[0] (also for "one element" cases)
        for (i in 1 until A.size) {
            maxEndingHere = Math.max(A[i], maxEndingPrevious + A[i]) // <--- key point~!!
            maxEndingPrevious = maxEndingHere
            maxSoFar = Math.max(maxSoFar, maxEndingHere) // update the max (be careful)
        }

        return maxSoFar // can be used for "all negative" cases

    }
}
package info.meysam.codility._06

import java.util.*

class Distinct {

    fun solution(A: IntArray): Int {
        // write your code in Kotlin 1.3.11 (Linux)


        //region mine
//        val set:MutableSet<Int> = HashSet()
//
//        for (i in A){
//            set.add(i)
//        }
//
//        return set.size

        //endregion

        // special case
        if (A.isEmpty()) return 0


        // initial setting: one distinct number
        var result = 1

        // Using "Arrays.sort(A)" (important)
        Arrays.sort(A)

        // for counting the distinct numbers
        for (i in 1 until A.size) {
            if (A[i] != A[i - 1]) { // distinct
                result++
            }
        }

        return result // return the number of distinct values

    }
}
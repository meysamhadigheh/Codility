package info.meysam.codility._06

import java.util.*

class MaxProductOfThree {

    fun solution(A: IntArray): Int {
        // write your code in Kotlin 1.3.11 (Linux)


        //region wrong solution mine
//        val map: MutableMap<Int, Int> = HashMap()
//        for (i in A.indices) {
//            map[i] = A[i]
//        }
//
//        val result = map.toList().sortedBy { (_, value) -> value}.toMap()
//
//        val keys= result.keys.toList()
//
//        for (i in A.size-1 downTo 0){
//
//            if (keys[i]>keys[i-1]){
//                if (keys[i-1]>keys[i-2]){
//
//                    return result[keys[i]]!!* result[keys[i-1]]!! * result[keys[i-2]]!!
//                }
//            }
//        }

        //endregion



        // main idea:
        // max_1 = positive * positive * positive
        // max_2 = negative * negative * positive
        // max = Math.max(max_1, max_1)
        // just need to sort the integer array

        // sort the array
        Arrays.sort(A)

        // max_1 = 1st biggest * 2nd biggest * 3rd biggest
        val max_1 = A[A.size - 1] * A[A.size - 2] * A[A.size - 3]

        // max_2 = 1st smallest * 2nd smallest * 1st biggest
        val max_2 = A[0] * A[1] * A[A.size - 1]

        // take the maximum

        return Math.max(max_1, max_2)


    }
}
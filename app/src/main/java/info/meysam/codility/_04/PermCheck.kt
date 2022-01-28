package info.meysam.codility._04

class PermCheck {

    fun solution(A: IntArray): Int {
        // write your code in Kotlin 1.3.11 (Linux)


        // region mine
//        val set: MutableSet<Int> = HashSet()
//
//        for (i in 1..A.size) {
//            set.add(i)
//        }
//
//        for ( i in set){
//
//            if (!A.contains(i)){
//                return 0
//            }
//
//        }
//
//        return 1

        // endregion


        // to check "permutation"
        // the main idea is as follows:
        // 1. use set to remember which elements have appeared
        // 2. use "for loop" to check if all the elements from "1 to A.length" appeared
        // If all the elements have appeared, then "yes".
        // Otherwise, "no".

        val set: MutableSet<Int> = HashSet()

        for (element in A) {
            set.add(element)
        }

        // check if "all" the elements from "1 to A.length" appeared

        // check if "all" the elements from "1 to A.length" appeared
        for (i in 1..A.size) {
            if (!set.contains(i)) return 0 // not a permutation (A[i] is missing)
        }

        // if it contains all the elements (from "1 to A.length")
        // then, "yes"

        // if it contains all the elements (from "1 to A.length")
        // then, "yes"
        return 1
    }
}
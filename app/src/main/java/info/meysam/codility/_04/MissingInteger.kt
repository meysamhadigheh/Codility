package info.meysam.codility._04

class MissingInteger {

    fun solution(A: IntArray): Int {
        // write your code in Kotlin 1.3.11 (Linux)


        // region mine
//        A.sort()
//
//        if (A.takeLast(1)[0] <= 0) {
//            return 1
//
//        } else {
//
//
//            for (i in 0 .. A.size-2) {
//
//                if (!(A[i + 1] == A[i] || A[i + 1] == A[i] + 1)) {
//
//                    return A[i] + 1
//
//                }
//            }
//
//            return A.takeLast(1)[0] + 1
//
//        }

        //endregion


        //special case
        if (A.isEmpty()) {
            return 1
        }


        // Using "set" to check if an element has appeared
        // note: need to "import java.util.*" (important)
        var set: MutableSet<Int> = HashSet()

        // add elements into the set
        for (element in A) {
            set.add(element)
        }



        // note: the missing number is not possible bigger than (A.length)
        //       because there are only (A.length) numbers
        for (i in 1..A.size) {
            if (!set.contains(i)) // the 1st missing element
                return i
        }


        // means: there are no missing numbers from 1 to A.length
        // Therefore, the missing number is "A.length+1" (important)
        return A.size + 1

    }
}
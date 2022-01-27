package info.meysam.codility._04

class FrogRiverOne {

    fun solution(X: Int, A: IntArray): Int {
        // write your code in Kotlin 1.3.11 (Linux)

        // write your code in Java SE 8

        // the main ideas:
        // 1. create a "set", and put "1~X" into the set first.
        // 2. when a number matches a number in the set,
        //    then remove the number from the set.
        // 3. when the set becomes "empty",
        //    all the numbers "1~X" have appeared

        // write your code in Java SE 8

        // the main ideas:
        // 1. create a "set", and put "1~X" into the set first.
        // 2. when a number matches a number in the set,
        //    then remove the number from the set.
        // 3. when the set becomes "empty",
        //    all the numbers "1~X" have appeared
        val set: MutableSet<Int> = HashSet()

        // put "1~X" into the set first
        for (i in 1..X) {
            set.add(i)
        }

        for (i in A.indices) {
            if (set.contains(A[i])) { // when a number appears,
                set.remove(A[i]) // then, remove it from the set
            }
            if (set.isEmpty()) {        // nothing in the set
                return i // In second i, "1~X" have all appeared
            }
        }

        // not all the elements "1~X" appeared

        // not all the elements "1~X" appeared
        return -1
    }
}
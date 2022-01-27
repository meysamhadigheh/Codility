package info.meysam.codility._02

class OddOccurrencesInArray {

    fun solution(A: IntArray): Int {
        // write your code in Java SE 8

        // Using the concept of "XOR" (^)
        // when there is a pair A and B
        // A^B will be zero
        // A^B^C (where C is not paired),
        // then A^B^C = C

        // special case
        if (A.isEmpty()) return 0
        var unpaired: Int
        unpaired = A[0] // initial
        for (i in 1 until A.size) {
            unpaired = unpaired xor A[i] // xor
        }
        return unpaired // return the unpaired value
    }
}
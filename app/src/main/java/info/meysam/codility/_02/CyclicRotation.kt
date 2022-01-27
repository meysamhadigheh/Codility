package info.meysam.codility._02

class CyclicRotation {

    fun solution(A: IntArray, K: Int): IntArray? {
        // write your code in Java SE 8

        // Using the concept of "mod" (to make it cyclic)
        val new_array = IntArray(A.size) // a new array

        for (i in A.indices) {
            val new_position = (i + K) % A.size // using "mod" to do Cyclic Rotation
            new_array[new_position] = A[i] // put A[i] to the new position
        }
        return new_array // return new array
    }
}
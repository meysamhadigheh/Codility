package info.meysam.codility._03

class PermMissingElem {

    fun solution(A: IntArray): Int {
        // write your code in Java SE 8

        // Using the concept of "Sum = (ceiling + floor) * height /2"
        // So---> Sum = (1 + N+1) * N /2
        // the missing element can be found by minus other elements

        // note: need to use "long" to avoid potential bugs (large numbers)
        val ceiling = (A.size + 1).toLong()
        val floor: Long = 1
        val height = (A.size + 1).toLong() // note: need to plus extra "1"
        // because there is one element "missing"!
        // be careful about this (important)
        val sum = (ceiling + floor) * height / 2 // main idea
        /*
        int high = A.length +1;
        int low = 1;
        int height = A.length + 1;
        int sum = (high +low) * height /2; // main idea
        */
        var missing_number = sum // initial setting (sum)
        for (i in A.indices) {
            missing_number = missing_number - A[i] // minus other elements
        }
        return missing_number.toInt() // return the missing element (long->int)
    }
}
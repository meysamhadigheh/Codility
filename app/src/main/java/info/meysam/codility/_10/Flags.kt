package info.meysam.codility._10

class Flags {
//use binary search to search through all the possible flags.

    fun solution(A: IntArray): Int {
        // write your code in Kotlin 1.3.11 (Linux)

        val array = ArrayList<Int>()
        for (i in 1 until A.size - 1) {
            if (A[i - 1] < A[i] && A[i + 1] < A[i]) {
                array.add(i)
            }
        }
        if (array.size == 1 || array.size == 0) {
            return array.size
        }
        var sf = 1
        var ef: Int = array.size
        var result = 1
        while (sf <= ef) {
            val flag = (sf + ef) / 2
            var suc = false
            var used = 0
            var mark = array[0]
            for (i in 0 until array.size) {
                if (array[i] >= mark) {
                    used++
                    mark = array[i] + flag
                    if (used == flag) {
                        suc = true
                        break
                    }
                }
            }
            if (suc) {
                result = flag
                sf = flag + 1
            } else {
                ef = flag - 1
            }
        }
        return result
    }
}
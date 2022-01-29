package info.meysam.codility._08

class Dominator {

    fun solution(A: IntArray): Int {
        // write your code in Kotlin 1.3.11 (Linux)


        // Using "hashMap" for counting
        val map: MutableMap<Int, Int> = HashMap()

        // 1. Counting
        // map(key, value) ---> map(number, count)
        for (i in A.indices) {
            if (!map.containsKey(A[i])) { // new number
                map[A[i]] = 1 // "put" new number
            } else {
                val count = map[A[i]]!! // "get" count
                map[A[i]] = count + 1 // count++
            }
        }

        // 2. find the max number of counts
        var max_Number = 0
        var max_Count = 0

        // note: use "map.keySet()" in for loop
        for (key in map.keys) {
            val cur_Count = map[key]!! // get value
            if (cur_Count > max_Count) {
                max_Count = cur_Count // update max count
                max_Number = key
            }
        }

        // 3. check if there is a "dominator" or not
        if (max_Count > A.size / 2) {
            // then, max_Number is the "dominator"
        } else {
            return -1 // no dominator
        }

        // 4. return "any index" of "the dominator"
        for (i in A.indices) {
            if (A[i] == max_Number) {
                return i // return the index
            }
        }

        return -1
    }

}
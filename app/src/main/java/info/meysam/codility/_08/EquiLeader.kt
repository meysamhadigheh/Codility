package info.meysam.codility._08

class EquiLeader {

    fun solution(A: IntArray): Int {
        // write your code in Kotlin 1.3.11 (Linux)

        // special case
        if (A.isEmpty()) return 0

        // The key point:
        // Only the "leader of the whole array" can have an "equi leader"
        // Assume a value Y is "not" the leader of the whole array.
        // Can value Y have an equi leader?
        // The answer is NO.

        // Based on this condition, to solve this problem,
        // 1. we first find the leader of the whole array.
        // 2. after finding a leader (if any),
        //    we then scan the whole array again.

        // 1. find the leader of an array
        // ---> we use "hashMap"
        val map: MutableMap<Int, Int> = HashMap()

        // map(key, value) ---> map(number, count)
        for (i in A.indices) {
            if (!map.containsKey(A[i])) {
                map[A[i]] = 1
            } else {
                map[A[i]] = map[A[i]]!! + 1
            }
        }


        // find the max_Value and max_Count
        var max_Value = A[0]
        var max_Count = 1

        // important: Using "for( int j: map.keySet() )"
        for (j in map.keys) {
            val cur_Count = map[j]!!
            if (cur_Count > max_Count) {
                max_Count = cur_Count
                max_Value = j
            }
        }


        // check "if there is a leader"
        var leader_Value = 0
        var leader_Count = 0
        if (max_Count > 0.5 * A.size) {
            leader_Value = max_Value
            leader_Count = max_Count
        } else {
            return 0 // no leader ---> no equi leaders
        }

        // note: cannot use (1/2) * (A.length)
        // This is because (1/2) will be "zero"
        // Instead, we can use (0.5) * (A.length) (be careful)

        // 2. scan the whole array again
        var num_Equi_leaders = 0 // number of equi leaders

        var left_Leader_Count = 0 // number of leaders in left side

        // scan the array
        for (i in A.indices) {

            // find a leader (in left side)
            if (A[i] == leader_Value) {
                left_Leader_Count++
            }

            // if the leader is "a leader in left side" (more than half)
            if (left_Leader_Count > 0.5 * (i + 1)) {
                // then, check right side
                val right_Leader_Count = leader_Count - left_Leader_Count
                // if the leader is "a leader in right side" (more than half)
                if (right_Leader_Count > 0.5 * (A.size - i - 1)) {
                    num_Equi_leaders++ // leader in both sides (then, equi leaders++)
                }
            }
        }

        // return number of equi leaders
        return num_Equi_leaders
    }
}
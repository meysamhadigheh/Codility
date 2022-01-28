package info.meysam.codility._05


class GenomicRangeQuery {

    fun solution(S: String, P: IntArray, Q: IntArray): IntArray {
        // write your code in Kotlin 1.3.11 (Linux)


        //region mine
//        val result= ArrayList<Int>()
//        for (i in P.indices){
//
//            var temp =S.substring(P[i],Q[i])
//
//            when {
//                temp.contains("A") -> {
//                    result.add(1)
//                }
//                temp.contains("C") -> {
//                    result.add(2)
//                }
//                temp.contains("G") -> {
//                    result.add(3)
//                }
//                else -> {
//                    result.add(4)
//                }
//            }
//
//        }
//
//        return result.toIntArray()

        //endregion

        // result: the minimal impact of each query
        val result = IntArray(P.size)


        // to count "A"、"C"、"G"、"T"
        // A[i] means: num of 'a' from 0 to i-1
        val A = IntArray(S.length + 1)
        val C = IntArray(S.length + 1)
        val G = IntArray(S.length + 1)
        val T = IntArray(S.length + 1)
        // note: we use "S.length()+1"
        // which will let A[0]=0, C[0]=0, G[0]=0, T[0]=0
        // becasue we will compute number of 'a' by "A[Q+1] - A[P]"
        // we actually shift to right by one, and assume the beginning is a dummy '0'

        // counting ( note: A[0]=0, C[0]=0, G[0]=0, T[0]=0 )
        for (i in S.indices) {
            when {
                S[i] == 'A' -> {
                    A[i + 1] = A[i] + 1
                    C[i + 1] = C[i]
                    G[i + 1] = G[i]
                    T[i + 1] = T[i]
                }
                S[i] == 'C' -> {
                    A[i + 1] = A[i]
                    C[i + 1] = C[i] + 1
                    G[i + 1] = G[i]
                    T[i + 1] = T[i]
                }
                S[i] == 'G' -> {
                    A[i + 1] = A[i]
                    C[i + 1] = C[i]
                    G[i + 1] = G[i] + 1
                    T[i + 1] = T[i]
                }
                S[i] == 'T' -> {
                    A[i + 1] = A[i]
                    C[i + 1] = C[i]
                    G[i + 1] = G[i]
                    T[i + 1] = T[i] + 1
                }
            }
        }


        // to handle the queries
        val num_of_query: Int = P.size // or Q.length

        for (i in 0 until num_of_query) {
            val a = A[Q[i] + 1] - A[P[i]] // num of 'a' between P and Q
            val c = C[Q[i] + 1] - C[P[i]] // num of 'c' between P and Q
            val g = G[Q[i] + 1] - G[P[i]] // num of 'g' between P and Q
            if (a > 0) { // there is 'a'
                result[i] = 1
            } else if (c > 0) { // there is 'c'
                result[i] = 2
            } else if (g > 0) { // there is 'g'
                result[i] = 3
            } else { // there is only 'T'
                result[i] = 4
            }
        }

        return result
    }
}
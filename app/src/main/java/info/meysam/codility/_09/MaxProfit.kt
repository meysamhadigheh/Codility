package info.meysam.codility._09

class MaxProfit {

    fun solution(A: IntArray): Int {
        // write your code in Kotlin 1.3.11 (Linux)


        //region mine
//        val map =A.mapIndexed { index: Int, value: Int -> index to value }.toMap()
//
//
//        val sortedMap = map.toList().sortedBy { (_, value) -> value}.toMap()
//
//        sortedMap.onEachIndexed { index, entry ->
//
//            for (i in A.size-1 downTo index){
//
//                val key = sortedMap.keys.toIntArray()[i]
//                if (entry.key< key){
//
//                    return sortedMap[key]!! - entry.value
//                }
//            }
//        }
//
//
//        return 0

        //endregion

        // main idea (One Pass Solution):
        // We can maintain two variables
        // 1) minprice (key point~!!)
        // 2) maxprofit (corresponding to the smallest valley)

        // special case
        if (A.size <= 1) return 0 // no profit


        // two variables (and initial setting)
        var minPrice = A[0]
        var maxProfit = 0


        // one pass solution
        for (i in 1 until A.size) {
            if (A[i] < minPrice) // case 1: from high to low
                minPrice = A[i]
            else {               // case 2: from low to high
                val curProfit = A[i] - minPrice
                if (curProfit > maxProfit) // update max profit
                    maxProfit = curProfit
            }
        }

        return maxProfit

    }
}
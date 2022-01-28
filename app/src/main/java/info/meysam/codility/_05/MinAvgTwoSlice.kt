package info.meysam.codility._05

class MinAvgTwoSlice {

    fun solution(A: IntArray): Int {
        // write your code in Kotlin 1.3.11 (Linux)



        //region mine
//        var avg=Double.MAX_VALUE
//        var position=0
//        for (i in 0 .. A.size-2){
//            for (j in i+1 until A.size){
//                val slice=A.sliceArray(i..j)
//                val average:Double= (slice.sum().toDouble()/slice.size)
//                if (average<avg){
//                    avg=average
//                    position=i
//
//                }
//            }
//        }
//
//        return position

        //endregion


        // main idea:
        // we know from the problem description
        // that the slices have a minimum length of 2.
        // The trick to this problem is
        // that the min average slice has "the length of 2 or 3"
        // So, we only need to calculate the avg of the slices of length 2 and 3

        // note: return the start position (of the min average slice)

        // note: because we will use "/", we need to use "float" (not "int")
        var min = Int.MAX_VALUE.toFloat()
        var min_start_position = 0 // to store the start position

        // note: for "i< A.length -2"
        for (i in 0 until A.size - 2) {

            // note: need to use "float"
            val avg_2 = (A[i] + A[i + 1]).toFloat() / 2 // avg of length of 2
            val avg_3 = (A[i] + A[i + 1] + A[i + 2]).toFloat() / 3 // avg of length of 3

            // for debugging
            // System.out.println(i + " " + avg_2 + " " + avg_3);

            // take the smaller one
            val cur_min_avg = Math.min(avg_2, avg_3)

            // keep the smallest one
            if (cur_min_avg < min) {
                min = cur_min_avg
                min_start_position = i
            }
        }

        // note: for the last missing case
        // case: avg of length of 2 "A[A.length-2] + A[A.length-1]"
        val avg_2 = (A[A.size - 2] + A[A.size - 1]) / 2
        if (avg_2 < min) {
            min = avg_2.toFloat()
            min_start_position = A.size - 2
        }

        return min_start_position


    }
}
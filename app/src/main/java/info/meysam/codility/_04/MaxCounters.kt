package info.meysam.codility._04

class MaxCounters {

    fun solution(N: Int, A: IntArray): IntArray {
        // write your code in Kotlin 1.3.11 (Linux)


        // region mine
//        var counters=IntArray(N)
//        var max=0
//
//        for(i in A){
//            if (i in 1..N){
//                counters[i-1] +=1
//                if (counters[i-1]>max){
//                    max=counters[i-1]
//                }
//            } else if (i ==N+1){
//                counters =IntArray(N) { max }
//            }
//        }
//        return counters

        //endregion

        // 1. key point: maintain the max value
        var max = 0


        // 2. key point: maintain the current_min (very important!!!)
        // so, we can move "the 2nd for-loop" outside "the 1st for-loop"
        // by maintaining "min"
        var min = 0


        // new integer array
        val my_array = IntArray(N)


        /* no need to initialize (because the values are "0" by default)
        for(int i=0; i<my_array.length; i++){
            my_array[i] =0;
        }
        */for (i in A.indices) {
            if (A[i] in 1..N) { // normal case

                // important: check the "min" before "increasing by 1"
                if (my_array[A[i] - 1] < min) {
                    my_array[A[i] - 1] = min // update it to "min"
                }
                my_array[A[i] - 1]++ // increased by 1
                if (my_array[A[i] - 1] > max) { // maintain max
                    max = my_array[A[i] - 1]
                }
            } else if (A[i] == N + 1) {      // special case
                /* cannot use for-loop (will take too much time)
                for(int j=0; j<my_array.length; j++){
                    my_array[j] = max;
                }
                // instead, we maintain "min", so we can move the for-loop outside */
                min = max // all the values should be bigger than "max"
                // therefore, "min = max"
            }
        }

        // move the 2nd for-loop outside the 1st for-loop
        // update some elements who have not been updated yet
        for (j in my_array.indices) {
            if (my_array[j] < min) {
                my_array[j] = min // update it to "min"
            }
        }

        return my_array


    }
}
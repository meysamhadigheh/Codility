package info.meysam.codility._01



class BinaryGap {

    fun solution(number: Int): Int {


        var N:Int=number
        var max_gap = 0
        var current_gap = 0
        var counting = false

        // Using the "concept of bit manipulation" and "& operation"
        while (N != 0) {
            if (!counting) {    // for the first "1"
                if (N and 1 == 1) {      // note: cannot use n&1 withoug "()"
                    counting = true // start to count
                }
            } else {                    // counting = true
                if (N and 1 == 0) {      // note: cannot use n&1 withoug "()"
                    current_gap++
                } else { // N & 1 == 1
                    max_gap = Math.max(max_gap, current_gap)
                    current_gap = 0 // reset
                }
            }
            N = N shr 1 // shift by one (right side)

            // note: cannot just write "N >> 1"
        }
        return max_gap
    }
}
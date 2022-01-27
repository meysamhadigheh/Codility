package info.meysam.codility._03

class FrogJmp {

    fun solution(X: Int, Y: Int, D: Int): Int {
        // write your code in Java SE 8
        val difference = (Y - X).toLong()
        var plus: Long = 0 // note: need to decide if to "plus one" or not
        if (difference % D != 0L) // using "mod" to decide
            plus = 1 // if not "perfectly Divisible", then plus one
        var hop: Long = 0 // number of hops the frog needs to jump
        hop = difference / D
        hop += plus
        return hop.toInt() // return number of hops (long -> int)
    }
}
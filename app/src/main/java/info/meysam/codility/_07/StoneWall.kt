package info.meysam.codility._07

import java.util.*

class StoneWall {

    fun solution(H: IntArray): Int {
        // write your code in Kotlin 1.3.11 (Linux)

        val stack:Stack<Int> = Stack()
        var blockCount=0

        H.forEach {h->

            while (!stack.isEmpty() && stack.peek()>h){

                stack.pop()

            }

            if (stack.isEmpty() || stack.peek() != h) {
                stack.push(h)
                blockCount++
            }
        }

        return blockCount
    }
}
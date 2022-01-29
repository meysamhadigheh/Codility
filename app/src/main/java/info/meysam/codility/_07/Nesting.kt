package info.meysam.codility._07

import java.util.*

class Nesting {

    fun solution(S: String): Int {
        // write your code in Kotlin 1.3.11 (Linux)

        if (S.isEmpty()) return 1

        // new Stack<Character>()
        val stack: Stack<Char> = Stack()

        // scan the string (just one pass)
        for (i in S.indices) {

            if (S[i] == '(') {
                stack.push(')')
            } else if (S[i] == ')') {

                if (stack.isEmpty()) {
                    return 0
                } else {

                    val temp: Char = stack.pop() // check if the stack is empty before pop!!!
                    if (temp != S[i])   return 0 // not a pair

                }
            }
        }

        return if (!stack.isEmpty()) {
            0
        } else {
            1
        }
    }
}
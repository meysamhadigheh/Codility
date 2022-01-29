package info.meysam.codility._07

import java.util.*

class Brackets {

    fun solution(S: String): Int {
        // write your code in Kotlin 1.3.11 (Linux)

        // main idea: use "Stack" (push and pop)

        //special case
        if (S.isEmpty()) return 1

        // new Stack<Character>()
        val stack: Stack<Char> = Stack()

        // scan the string (just one pass)
        for (i in S.indices) {
            // note: push "its pair"
            if (S[i] == '(') {
                stack.push(')')
            } else if (S[i] == '[') {
                stack.push(']')
            } else if (S[i] == '{') {
                stack.push('}')
            } else if (S[i] == ')' || S[i] == ']' || S[i] == '}') {
                // important: check if the stack is empty or not (be careful)
                if (stack.isEmpty()) {
                    return 0
                } else {
                    val temp: Char = stack.pop() // check if the stack is empty before pop!!!
                    if (temp != S[i]) { // not a pair
                        return 0
                    }
                }
            }

            println(stack)
        }

        // note: check if the stack is empty or not (be careful)
        return if (!stack.isEmpty()) {
            0
        } else {
            1
        }
    }
}
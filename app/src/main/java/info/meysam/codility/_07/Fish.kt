package info.meysam.codility._07

import java.util.*

class Fish {

    fun solution(A: IntArray, B: IntArray): Int {
        // write your code in Kotlin 1.3.11 (Linux)

        // special case: no fish
        if (A.isEmpty()) return 0


        // main idea: use "stack" to store the fishes with B[i]==1
        // that is, "push" the downstream fishes into "stack"
        // note: "push" the Size of the downstream fish
        val st: Stack<Int> = Stack()
        var numAlive: Int = A.size

        for (i in A.indices) {

            // case 1; for the fish going to downstream
            // push the fish to "stack", so we can keep them from the "last" one
            if (B[i] == 1) {
                st.push(A[i]) // push the size of the downstream fish
            }
            // case 2: for the fish going upstream
            // check if there is any fish going to downstream
            if (B[i] == 0) {
                while (!st.isEmpty()) {
                    // if the downstream fish is bigger (eat the upstream fish)
                    if (st.peek() > A[i]) {
                        numAlive--
                        break // the upstream fish is eaten (ending)
                    } else if (st.peek() < A[i]) {
                        numAlive--
                        st.pop() // the downstream fish is eaten (not ending)
                    }
                }
            }
        }

        return numAlive
    }
}
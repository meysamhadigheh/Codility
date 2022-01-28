package info.meysam.codility._05

import org.junit.Assert.*

import org.junit.Test

class GenomicRangeQueryTest {

    @Test
    fun solution() {

        val genomicRangeQuery=GenomicRangeQuery()

        val S ="CAGCCTA"
        val P:IntArray= listOf(2,5,0).toIntArray()
        val Q:IntArray= listOf(4,5,6).toIntArray()

        assertArrayEquals(listOf(2, 4, 1).toIntArray(),genomicRangeQuery.solution(S,P,Q))
    }
}
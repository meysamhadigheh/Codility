package info.meysam.unikie

import java.util.*
import kotlin.math.abs

class test2 {

    fun solution(T: IntArray): String {
        // write your code in Kotlin 1.3.11 (Linux)

        val slice = T.size / 4

        val winter = T.slice(0 until slice).toIntArray()
        val spring = T.slice(slice until 2 * slice).toIntArray()
        val summer = T.slice(2 * slice until 3 * slice).toIntArray()
        val autumn = T.slice(3 * slice until 4 * slice).toIntArray()

        Arrays.sort(winter)
        Arrays.sort(spring)
        Arrays.sort(summer)
        Arrays.sort(autumn)

        val winterAmp = abs(winter[0] - winter[slice - 1])
        val springAmp = abs(spring[0] - spring[slice - 1])
        val summerAmp = abs(summer[0] - summer[slice - 1])
        val autumnAmp = abs(autumn[0] - autumn[slice - 1])


        val amps = intArrayOf(winterAmp, springAmp, summerAmp, autumnAmp)


        var max = amps[0]
        var season = 0
        for (i in 1 until amps.size) {

            if (max < amps[i]) {
                max = amps[i]
                season = i
            }

        }


        return when (season) {
            0 -> "WINTER"
            1 -> "SPRING"
            2 -> "SUMMER"
            3 -> "AUTUMN"
            else -> "WINTER"
        }

    }
}
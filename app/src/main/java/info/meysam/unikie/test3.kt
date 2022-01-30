package info.meysam.unikie

import java.util.ArrayList


fun title(string:String): String{

    for (i in string.length-1 downTo 0 ){

        return if (string[i].isDigit()){
            string
        }else{

            string.slice(0 until i)
        }

    }

    return ""

}

class test3 {

    fun solution(T: Array<String>, R: Array<String>): Int {
        // write your code in Kotlin 1.3.11 (Linux)

        var i = 0
        T[0].forEachIndexed { index, c ->
            if (c.isDigit()) {
                i = index

            }
        }


        var numbersGroup: HashMap<String, ArrayList<String>> = HashMap()

        T.forEachIndexed { index, s ->
            //var title = s.slice(0..i)
            var title = title(s)

            if (numbersGroup.containsKey(title)) {

                var value: ArrayList<String> = numbersGroup[title]!!

                value.add(R[index])

                numbersGroup[title] = value

            } else {


                var value = ArrayList<String>()
                value.add(R[index])
                numbersGroup[title] = value

            }

        }

        var total = 0

        numbersGroup.forEach { (key, value) ->


            var state = true
            value.forEach {
                if (it != "OK") {
                    state = false
                }
            }

            if (state) {
                total++
            }


        }


        return Math.floor((total * 100.0) / numbersGroup.size).toInt()

    }
}
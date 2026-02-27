package Baekjun_Programmars.String

class Solution_create_odd_string_2 {
    fun solution(s: String): String {
        return s.split(" ").joinToString(" "){ word ->
            word.mapIndexed { i, ch ->
                if (i % 2 == 0) ch.uppercase() else ch.lowercase()
            }.joinToString("")
        }
    }
}

class Solution_create_odd_string_1 {
    fun solution(s: String): String {
        val sb = StringBuilder()
        var idx = 0

        for (ch in s) {
            if (ch == ' ') {
                sb.append(ch)
                idx = 0
            } else {
                if (idx % 2 == 0) {
                    sb.append(ch.uppercase())
                } else {
                    sb.append(ch.lowercase())
                }
            }
            idx++
        }
        return sb.toString()
    }
}
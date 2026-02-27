package Baekjun_Programmars.Sort

//문자열 내림차순으로 배치하기
private class Solution_pro_string_descending_num_2 {
    fun solution(s: String): String {
        return s.toList().sortedDescending().joinToString("")
    }
}

private class Solution_pro_string_descending_num_1 {
    fun solution(s: String): String {
        val lowerSb = StringBuilder()
        val UpperSb = StringBuilder()

        for (ch in s) {
            if (ch.isLowerCase()) {
                lowerSb.append(ch)
            } else {
                UpperSb.append(ch)
            }
        }

        return lowerSb.toList().sortedDescending().joinToString("") +
                UpperSb.toList().sortedDescending().joinToString("")
    }
}
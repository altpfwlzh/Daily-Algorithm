package Baekjun_Programmars.HASH

private class Solution_personal_info_valid_period {
    fun solution(today: String, terms: Array<String>, privacies: Array<String>): IntArray {
        val answer = mutableListOf<Int>()

        val termMap = terms.associate { //	{A=6, B=12, C=3}
            val (kind, months) = it.split(" ")
            kind to months.toInt()
        }

        val todayDays = toDay(today) // 679551

        for (i in privacies.indices) {
            val (signDate, kind) = privacies[i].split(" ").map { it }
            val expireDate = toDay(signDate) + termMap.getValue(kind) * 28 - 1

            if (todayDays > expireDate) answer.add(i + 1)
        }

        return answer.toIntArray()
    }

    private fun toDay(date: String): Int {
        val (y, m, d) = date.split(".").map { it.toInt() }
        return (y * 12 + m) * 28 + d
    }
}
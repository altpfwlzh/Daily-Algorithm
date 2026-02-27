package Baekjun_Programmars.Sort

// [6, 10, 2]	"6210"
private class Solution_pro_biggest_number_1 {
    fun solution(numbers: IntArray): String {

        val sortedNum = numbers.sortedWith { num1, num2 ->
            "$num2$num1".compareTo("$num1$num2")
        }

        if (sortedNum[0] == 0) return "0"

        return sortedNum.joinToString("")
    }
}

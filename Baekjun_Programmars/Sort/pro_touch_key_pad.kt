package Baekjun_Programmars.Sort

import kotlin.math.abs

/*
키패드 누르기 => 다시 해보기
* */
private class Solution_pro_touch_key_pad {
    fun solution(numbers: IntArray, hand: String): String {
        val answer = StringBuilder()

        var left = 10
        var right = 12

        for (num in numbers) {
            var target = if(num == 0) 11 else num

            when(num) {
                1, 4, 7 -> {
                    answer.append("L")
                    left = target
                }
                3, 6, 9 -> {
                    answer.append("R")
                    right = target
                }
                2, 5, 8, 0 -> {
                    val leftDist = distance(left, target)
                    val rightDist = distance(right, target)

                    if (leftDist < rightDist) {
                        answer.append("L")
                        left = target
                    } else if (rightDist < leftDist) {
                        answer.append("R")
                        right = target
                    } else {
                        if (hand == "left") {
                            answer.append("L")
                            left = target
                        } else {
                            answer.append("R")
                            right = target
                        }
                    }
                }
            }
        }

        return answer.toString()
    }

    private fun distance(from: Int, to: Int): Int {
        val fromRow = (from - 1) / 3
        val fromCol = (from - 1) % 3
        val toRow = (to - 1) / 3
        val toCol = (to - 1) % 3

        return abs(fromRow - toRow) + abs(fromCol - toCol)
    }
}
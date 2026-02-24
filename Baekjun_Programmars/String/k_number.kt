package Baekjun_Programmars.String

private class Solution_k_number_1 {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        val answerArray = IntArray(commands.size)

        for (i in commands.indices){
            val slicedList = array.slice(commands[i][0] - 1..commands[i][1]).sorted()
            answerArray[i] = slicedList[commands[i][2] - 1]
        }

        return answerArray
    }
}






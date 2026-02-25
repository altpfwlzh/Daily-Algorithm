package Baekjun_Programmars.Sort

/*
 시간 복잡도 :
 방법 : 정렬
    - 반복한다
        - commands 인덱스 보고 자르고
        - 정렬
        - K번째 수 추출
*/
private class Solution_k_number_1 {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        val answerArray = IntArray(commands.size)

        for (i in commands.indices) {
            val slicedList = array.slice(commands[i][0] - 1..commands[i][1]).sorted()
            answerArray[i] = slicedList[commands[i][2] - 1]
        }

        return answerArray
    }
}
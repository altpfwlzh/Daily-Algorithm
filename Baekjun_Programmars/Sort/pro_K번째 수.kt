package Baekjun_Programmars.Sort

/*
 시간 복잡도 :
 방법 : 정렬
    - 반복한다
        - commands 인덱스 보고 자르고
        - 정렬
        - K번째 수 추출
*/

class Solution {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        var answer = IntArray(commands.size)

        for (i in commands.indices) {
            val ansArr = array.sliceArray(IntRange(commands[i][0] - 1, commands[i][1] - 1)).sortedArray()
            answer[i] = ansArr[commands[i][2] - 1]
        }

        return answer
    }
}

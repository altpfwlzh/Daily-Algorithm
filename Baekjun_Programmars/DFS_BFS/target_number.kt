package Baekjun_Programmars.DFS_BFS

private class SolutionTargetNumber() {
    fun solution(numbers: IntArray, target: Int): Int {
        var answer = 0

        fun dfs(sum: Int, idx: Int) {
            if (idx < numbers.size -1 ) {
                dfs(sum+numbers[idx], idx+1)
                dfs(sum-numbers[idx], idx+1)
            } else {
                if(sum+numbers[idx] == target) answer++
                if(sum-numbers[idx] == target) answer++
            }
        }

        dfs(0,0)
        return answer
    }
}

fun main() {
    val numbers = intArrayOf(4,1,2,1)
    val idx = 4
    SolutionTargetNumber().solution(numbers, idx)
}


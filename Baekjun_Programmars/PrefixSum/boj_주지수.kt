package Baekjun_Programmars.PrefixSum

import java.io.*

private val br = BufferedReader(InputStreamReader(System.`in`))
private val bw = BufferedWriter(OutputStreamWriter(System.out))

/*
 시간 복잡도 : O(N*M)
 방법 : 누적합
 - 누적합 2차원 배열로 변경 : D[i][j] = D[i-1][j] + D[i][j-1] - D[i-1][j-1] + A[i][j]
 - 누적합 2차원 특정 범위 계산(x,y)(x2,y2) : (x2, y2) - (x1-1, y2) - (x2, y1-1) + (x1-1, y1-1)
*/

fun main() {
    val (N: Int, M: Int) = br.readLine().split(" ").map { it.toInt() }

    // 2차원 누적합 배열 만들기
    val sumArr: Array<IntArray> = Array(N + 1) { IntArray(M + 1) }
    for (x in 1..N) {
        val row: List<Int> = br.readLine().split(" ").map { it.toInt() }
        for (y in 1..M) {
            sumArr[x][y] = sumArr[x-1][y] + sumArr[x][y-1] - sumArr[x-1][y-1] + row[y-1]
        }
    }

    //답 범위 계산하고 답 누적하기
    repeat(br.readLine().toInt()) {
        val (x1: Int, y1: Int, x2: Int, y2: Int) = br.readLine().split(" ").map { it.toInt() }
        val result: Int = sumArr[x2][y2] - sumArr[x1-1][y2] - sumArr[x2][y1-1] + sumArr[x1-1][y1-1]
        bw.write(result.toString() + "\n")
    }

    //답 출력
    bw.flush()
    bw.close()
}

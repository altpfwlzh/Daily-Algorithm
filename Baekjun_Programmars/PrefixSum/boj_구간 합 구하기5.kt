package Baekjun_Programmars.PrefixSum

import java.io.*

private val br = BufferedReader(InputStreamReader(System.`in`))
private val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() {
    val (N: Int, M: Int) = br.readLine().split(" ").map { it.toInt() }

    val arr: Array<IntArray> = makeArray(N)

    printResult(M, arr)
}

//2차원 배열 만드는 함수
fun makeArray(N: Int): Array<IntArray> {
    val arr: Array<IntArray> = Array(N+1) { IntArray(N+1) }
    // -> 배열 기본 값이 숫자 0으로 세팅된다. N+1인 첫 번째 행과 열을 0으로 설정하기 위해서(바로 아래에 x-1, y-1 있음)
    for (x in 1..N) {
        val row: List<Int> = br.readLine().split(" ").map { it.toInt() }
        for (y in 1..N) {
            arr[x][y] = arr[x][y-1] + arr[x-1][y] - arr[x-1][y-1] + row[y-1]
        }
    }
    return arr
}

fun printResult(M: Int, arr: Array<IntArray>) {
    repeat(M) {
        val (x1: Int, y1: Int, x2: Int, y2: Int) = br.readLine().split(" ").map { it.toInt() }
        val result: Int = arr[x2][y2] - arr[x2][y1-1] - arr[x1-1][y2] + arr[x1-1][y1-1]

        bw.write(result.toString() + "\n")
    }

    bw.flush()
    bw.close()
}
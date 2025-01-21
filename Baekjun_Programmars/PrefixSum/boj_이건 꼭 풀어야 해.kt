package Baekjun_Programmars.PrefixSum

import java.io.*

private val br = BufferedReader(InputStreamReader(System.`in`))
private val bw = BufferedWriter(OutputStreamWriter(System.out))

/*
 시간 복잡도 : O(N*logN)
  - 정렬 : O(N log N)
  - 누적합 : O(N)
 방법 : 누적합, 정렬
  - 입력 받는다
  - 오름차순 정렬한다
  - 누적합 공식(배열 크기는 N+1) : S[R] - S[L-1]
*/

fun main() {
    val (N: Int, Q: Int) = br.readLine().split(" ").map { it.toInt() }
    val arr: IntArray = br.readLine().split(" ").map { it.toInt() }.sorted().toIntArray()
    val sumArr: IntArray = IntArray(N + 1)

    for(i in 1..N) {
        sumArr[i] = sumArr[i - 1] + arr[i - 1]
    }

    repeat(Q) {
        val (L: Int, R: Int) = br.readLine().split(" ").map { it.toInt() }
        val result: Int = sumArr[R] - sumArr[L-1]
        bw.write(result.toString() + "\n")
    }

    bw.flush()
    bw.close()
}
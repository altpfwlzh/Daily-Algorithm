package Baekjun_Programmars.TwoPointer

import java.io.*

private val br = BufferedReader(InputStreamReader(System.`in`))
private val bw = BufferedWriter(OutputStreamWriter(System.out))

/*
* 시간 복잡도 : O(N + 100,001)
* 방법 : 투 포인터 + 슬라이딩 윈도우
* */

fun main() {
    val (N: Int, K: Int) = br.readLine().split(" ").map { it.toInt() }
    val arr: IntArray = br.readLine().split(" ").map { it.toInt() }.toIntArray()

    val numCnt = IntArray(100_001)
    var left = 0
    var right = 0
    var maxLength = 0

    while (right < N) {
        val curNum: Int = arr[right]
        numCnt[curNum]++

        while (numCnt[curNum] > K) {
            numCnt[arr[left]]--
            left++
        }

        maxLength = maxOf(maxLength,right - left + 1)
        right++
    }

    bw.write("$maxLength")
    bw.flush()
    bw.close()
}
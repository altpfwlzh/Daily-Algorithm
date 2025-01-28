package Baekjun_Programmars.TwoPointer

import java.io.*

private val br = BufferedReader(InputStreamReader(System.`in`))
private val bw = BufferedWriter(OutputStreamWriter(System.out))

/*
 시간 복잡도 : O(n)
    - n은 target
 방법 : 투 포인터
*/

fun main() {
    val target: Int = br.readLine().toInt()
    var left: Int = 1
    var right: Int = 1
    var sum: Int = 1
    var resultCnt: Int = 1

    while (right < (target / 2 + 1.5)) {
        if (sum == target) {
            resultCnt++
            sum -= left
            left++
            right++
            sum += right
        } else if (sum > target) {
            sum -= left
            left++
        } else {
            right++
            sum += right
        }
    }

    if (target == 1 || target == 2) resultCnt = 1

    bw.write((resultCnt).toString())
    bw.flush()
    bw.close()
}
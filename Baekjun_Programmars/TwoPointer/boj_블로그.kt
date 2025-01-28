package Baekjun_Programmars.TwoPointer

import java.io.*

private val br = BufferedReader(InputStreamReader(System.`in`))
private val bw = BufferedWriter(OutputStreamWriter(System.out))

/*
 시간 복잡도 : O(N)
 방법 : 슬라이딩 윈도우
    * var curCnt = visitArr.take(X).sum() => 윈도우 크기만큼 초기값 설정
    * for (i in X until N) => X 부터 arr 끝까지 반복
    * curCnt += visitArr[i] - visitArr[i - X] => visitArr[i]는 더하고 visitArr[i - X] 빼서 윈도우 옮겨서 갱신
 */

fun main() {
    val (N: Int, X: Int) = br.readLine().split(" ").map { it.toInt() }
    val visitArr: IntArray = br.readLine().split(" ").map { it.toInt() }.toIntArray()
    var curCnt = visitArr.take(X).sum()
    var peekCnt = curCnt
    var peekPeriodCnt = 1

    for (i in X until N) {
        curCnt += visitArr[i] - visitArr[i - X]

        if (curCnt > peekCnt) {
            peekCnt = curCnt
            peekPeriodCnt = 1
        } else if (curCnt == peekCnt) {
            peekPeriodCnt++
        }
    }

    if (peekCnt == 0 ) bw.write("SAD")
    else bw.write("$peekCnt\n$peekPeriodCnt")

    bw.flush()
    bw.close()
}
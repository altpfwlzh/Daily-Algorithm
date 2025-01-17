package Baekjun_Programmars.PrefixSum

import java.io.*

private val br = BufferedReader(InputStreamReader(System.`in`))
private val bw = BufferedWriter(OutputStreamWriter(System.out))

/*
 시간 복잡도 : O(n)
 방법 : 누적합
 - 입력 받기, 동시에 누적합 배열도 만들기(10개 입력 모두 받아야 함)
 - 결과값 갱신
    - 누적합 100 이하 : 무조건 갱신
    - 누적합 100 초과 : (지금 누적합 - 100 <= 100 - 바로 이전 누적합) 일 때 갱신
*/

fun main() {
    val sumArr: IntArray = IntArray(11)
    var resultPoint: Int = 0

    for (i in 1..10) {
        sumArr[i] = sumArr[i - 1] + br.readLine().toInt()

        if (sumArr[i] <= 100) {
            resultPoint =  sumArr[i]
        }
        if ((sumArr[i] > 100) && ((sumArr[i] - 100) <= (100 - sumArr[i-1]) )) {
            resultPoint = sumArr[i]
        }
    }

    bw.write(resultPoint.toString())
    bw.flush()
}


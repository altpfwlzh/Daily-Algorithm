package Baekjun_Programmars.PrefixSum

import java.io.*

private val br = BufferedReader(InputStreamReader(System.`in`))
private val bw = BufferedWriter(OutputStreamWriter(System.out))

/*
 시간 복잡도 : O(N+KlogK)
    - O(N) : HashMap에 이벤트 기록
    - O(K log K) : 키 정렬
 방법 : 누적합(HashMap.getOrDefault 의 값 누적을 사용해서 문제를 푼다.)
    - 입력 받으면서 HashMap에 __모기의 출입 시간을 key__로 하고 그에 따라 __값에 +1 or -1__를 한다.
    - HashMap을 key순서대로(시간 순서대로) List 정렬한다.
    - 시간 순서에 따라 현재 모기 수와 최대 모기 수를 갱신한다.
*/

fun main() {
    val totalMosCnt: Int = br.readLine().toInt()
    val mosTimeMap: HashMap<Int, Int> = HashMap()

    repeat(totalMosCnt) {
        val (enterTime: Int, exitTime: Int) = br.readLine().split(" ").map { it.toInt() }

        mosTimeMap[enterTime] = mosTimeMap.getOrDefault(enterTime, 0) + 1
        mosTimeMap[exitTime] = mosTimeMap.getOrDefault(exitTime, 0) - 1
    }

    // 시간 순서대로 모기 출입 진행하기
    val mosTime: List<Int> = mosTimeMap.keys.sorted() // 시간 순으로 정렬

    var curMosCnt: Int = 0
    var maxMosCnt: Int = 0
    var masMosEnterTime: Int = 0
    var masMosExitTime: Int = 0
    var isMaxTime: Boolean = false

    mosTime.forEach {
        curMosCnt += mosTimeMap[it]!! // 현재 모기 수를 갱신

        if (curMosCnt > maxMosCnt) {
            // 최대 모기 수를 갱신(등호 빠진 이유 : 최대 수가 동일 시에 빠른 시간이 정답 구간임)
            maxMosCnt = curMosCnt
            masMosEnterTime = it
            isMaxTime = true
        } else if (curMosCnt < maxMosCnt && isMaxTime) {
            // 최대 모기 구간의 끝을 기록한다.
            masMosExitTime = it
            isMaxTime = false
        }
    }

    bw.write("$maxMosCnt\n")
    bw.write("$masMosEnterTime $masMosExitTime")
    bw.flush()
    bw.close()
}
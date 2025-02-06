package Baekjun_Programmars.TwoPointer

import java.io.*
import kotlin.math.abs

private val br = BufferedReader(InputStreamReader(System.`in`))
private val bw = BufferedWriter(OutputStreamWriter(System.out))

/*
* 시간 복잡도 :
* 방법 : 투 포인터 2개
    * 눈덩이를 정렬한다.
    * 투 포인터1(i, j) :
        * 첫 번째 눈사람에 쓸 눈덩이를 고정한다.(i = 0, j = i+3 으로 해서 둘 사이에 두 번째 눈 사람을 위한 눈덩이를 확보한다.)
    * 투 포인터2(l, r) :
        * 첫 번째 눈사람에 쓴 눈덩이 사이의 눈덩이 두 개로 두 번째 눈 사람을 만든다.
        * 첫 번째 눈사람 > 두 번째 눈사람 -> l++
        * 첫 번째 눈사람 < 두 번째 눈사람 -> r--
        * 첫 번째 눈사람 = 두 번째 눈사람 -> 즉시 종료
* */

fun main() {
    val N: Int = br.readLine().toInt()
    val snowArr: IntArray = br.readLine().split(" ").map { it.toInt() }.toIntArray().sortedArray()

    var minDiff = Int.MAX_VALUE

    for (i in 0 until N) {
        for (j in i + 3 until N) {
            var l = i + 1
            var r = j - 1

            while (l < r) {
                val snow1 = snowArr[i] + snowArr[j]
                val snow2 = snowArr[l] + snowArr[r]

                minDiff = minOf(minDiff, abs(snow1 - snow2))

                if (minDiff == 0) break

                if ( snow1 > snow2 ) {
                    l++
                } else {
                    r--
                }
            }
        }
    }

    bw.write("${minDiff}")
    bw.flush()
    bw.close()
}
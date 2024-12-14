package Baekjun_Programmars.ZLegacy

/*
* 문제 및 설명 : https://yellow-shurup.tistory.com/entry/Baekjoon11399ATMKotlin%EA%B5%AC%EA%B0%84%ED%95%A9
* */

import java.io.*
private val br = BufferedReader(InputStreamReader(System.`in`))
private val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() {

    val N : Int = br.readLine().toInt()

    //입력 받고 정렬하기
    val Pi : IntArray = br.readLine().split(" ").map { it.toInt() }.sorted().toIntArray()

    val PiSum : IntArray = IntArray(N+1)
    var minTime : Int = 0

    //합배열 만들고 전체 합 출력 하기
    for(i in 1 .. N){
        PiSum[i] = PiSum[i-1] + Pi[i-1]
        minTime += PiSum[i]
    }

    bw.write(minTime.toString())
    bw.flush()


}
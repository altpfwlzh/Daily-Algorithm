package Baekjun.Sort

/*
* 문제 및 설명 : https://yellow-shurup.tistory.com/entry/Baekjoon11660%EA%B5%AC%EA%B0%84-%ED%95%A9-%EA%B5%AC%ED%95%98%EA%B8%B0-5KotlinPrefix
* */

import java.io.*

private val br = BufferedReader(InputStreamReader(System.`in`))
private val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() {
    val A : IntArray = br.readLine().split(" ").map { it.toInt() }.toIntArray()

    A.sort()



}
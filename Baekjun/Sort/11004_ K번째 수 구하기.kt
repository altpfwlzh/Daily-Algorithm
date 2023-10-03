package Baekjun.Sort

/*
* 문제 및 설명 : https://yellow-shurup.tistory.com/entry/Baekjoon11004K%EB%B2%88%EC%A7%B8-%EC%88%98Kotlin%ED%96%A5%EC%83%81%EB%90%9C-%ED%80%B5-%EC%A0%95%EB%A0%ACQuick-Selection
* */

import java.io.*

private val br = BufferedReader(InputStreamReader(System.`in`))
private val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() {

    val (N : Int, K : Int)  = br.readLine().split(" ").map { it.toInt() }
    val A : IntArray = br.readLine().split(" ").map { it.toInt() }.sorted().toIntArray()

    bw.write(A[K-1].toString())
    bw.flush()

}
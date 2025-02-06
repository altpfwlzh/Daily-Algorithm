package Baekjun_Programmars.Sort

import java.io.*

private val br = BufferedReader(InputStreamReader(System.`in`))
private val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() {
    val (N, K) = br.readLine().split(" ").map { it.toInt() }
    val intArr: IntArray = br.readLine().split(" ").map { it.toInt() }.sorted().toIntArray()

    println("${intArr[K-1]}")
}
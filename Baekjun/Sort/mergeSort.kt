package Baekjun.Sort

//블로그 설명 : https://yellow-shurup.tistory.com/entry/%EC%82%BD%EC%9E%85-%EC%A0%95%EB%A0%AC-%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98Insertion-Sortkotlin

import java.io.*
import java.util.*


private val br = BufferedReader(InputStreamReader(System.`in`))
private val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() {
    val arr : IntArray = br.readLine().split(" ").map { it.toInt() }.toIntArray()
    //33 4 8 20 3 47 19 1
    sortByMerge(arr, 0, arr.size - 1)
}

private fun sortByMerge(arr : IntArray, start : Int, last : Int) {
    if (start < last) {

        if(last == 1) return

        val mid : Int = (start + last) / 2
        sortByMerge(arr, start, mid)
        sortByMerge(arr, mid + 1, last)

    }
}

private fun merge(arr : IntArray, start: Int, mid : Int, last: Int) {
    val leftArray : IntArray = arr.copyOfRange(start, mid)
    val rightArray : IntArray = arr.copyOfRange(mid + 1, last)
}
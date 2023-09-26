package Baekjun.Sort

/*
* 문제 및 설명 : https://yellow-shurup.tistory.com/entry/Baekjoon11660%EA%B5%AC%EA%B0%84-%ED%95%A9-%EA%B5%AC%ED%95%98%EA%B8%B0-5KotlinPrefix
* */

import java.io.*

private val br = BufferedReader(InputStreamReader(System.`in`))
private val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() {
    val N : Int = br.readLine().toInt()
    val A : MutableList<IArray> = mutableListOf<IArray>()

    repeat(N){
        A.add(IArray(br.readLine().toInt(), it))
    }

    A.sort()

    val max : Int = A.withIndex().maxOf { (idx, num) ->
        num.idx - idx + 1
    }

    bw.write(max.toString())
    bw.flush()
    bw.close()
}

data class IArray(
    val num : Int,
    val idx : Int
) : Comparable<IArray>{
    override fun compareTo(other: IArray): Int {
        return num.compareTo(other.num)
    }
}



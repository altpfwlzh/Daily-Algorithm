package ProgrammarsAndBaekjun.Sort

//블로그 설명 : https://yellow-shurup.tistory.com/entry/%EC%84%A0%ED%83%9D-%EC%A0%95%EB%A0%AC-%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98Selection-Sortkotlin

import java.io.*
private val br = BufferedReader(InputStreamReader(System.`in`))
private val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() {
    //입력 예시 : 10 5 7 96 25 3 0 4
    val arr : IntArray = br.readLine().split(" ").map { it.toInt() }.toIntArray()

    for(i in arr.indices){
        var curMinNunIndex : Int = i

        for(j in i+1 until arr.size){
            if(arr[curMinNunIndex] > arr[j]){
                curMinNunIndex = j
            }
        }

        val tmp : Int = arr[curMinNunIndex]
        arr[curMinNunIndex] = arr[i]
        arr[i] = tmp
    }

    bw.write(arr.contentToString())
    bw.flush()
    bw.close()
}
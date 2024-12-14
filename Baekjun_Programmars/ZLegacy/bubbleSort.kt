package Baekjun_Programmars.ZLegacy

//블로그 설명 : https://yellow-shurup.tistory.com/entry/%EB%B2%84%EB%B8%94-%EC%A0%95%EB%A0%AC-%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-%EC%B5%9C%EC%A0%81%ED%99%94Bubble-Sortkotlin

import java.io.*
private val br = BufferedReader(InputStreamReader(System.`in`))
private val bw = BufferedWriter(OutputStreamWriter(System.out))


fun main() {
    //입력 예시 : 10 5 7 96 25 3 0 4
    val arr : IntArray = br.readLine().split(" ").map { it.toInt() }.toIntArray()

    //3. 정렬된 영역을 루프 범위에서 제외하여 루프 범위를 설정한다.
    //4. 정렬되지 않은 부분이 없을 때까지 1~3번을 반복한다.
    for(i in arr.indices) {
        //1. 정렬되지 않은 부분을 루프의 범위로 설정한다.
        //1_1. 정렬 영역 : 처음 ~ {(배열 크기 -1) -i(이미 정렬된 영역의 크기)}
        for (j in 0 until arr.size-1-i) {
            //2. 인접한 두 데이터를 비교하며, 정렬 조건에 맞게 swap한다. 이는 루프 범위의 처음부터 끝까지 반복한다.
            if(arr[j] > arr[j+1]) {
                val tmp : Int = arr[j]
                arr[j] = arr[j+1]
                arr[j+1] = tmp
            }
        }
    }

    bw.write(arr.contentToString())
    bw.flush()
    bw.close()
}
package Baekjun_Programmars.ZLegacy.Sort

//블로그 설명 : https://yellow-shurup.tistory.com/entry/%EC%84%A0%ED%83%9D-%EC%A0%95%EB%A0%AC-%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98Selection-Sortkotlin

import java.io.*
private val br = BufferedReader(InputStreamReader(System.`in`))
private val bw = BufferedWriter(OutputStreamWriter(System.out))


fun main() {
    //입력 예시 : 10 5 7 96 25 3 0 4
    val arr : IntArray = br.readLine().split(" ").map { it.toInt() }.toIntArray()

    sortBySelection(arr)
    bw.write(arr.contentToString())
    bw.flush()
    bw.close()
}

private fun sortBySelection(arr : IntArray) {
    //3. 가장 앞에 있는 데이터의 위치를 변경(index++)해서 정렬되지 않은 부분의 범위를 축소해간다.
    //4. 전체 데이터 크기만큼 index가 커질 때까지, 즉 정렬되지 않은 부분이 없을 때까지 반복한다.
    for(i in arr.indices){
        //1. 정렬되지 않은 부분에서 가장 작은 수의 index를 반환 한다.
        val curMinNumIndex : Int = getMinNumIndex(arr, i)
        //2. 정렬되지 않은 부분의 가장 앞의 데이터와 선택된 데이터를 swap한다.
        swap(arr, i, curMinNumIndex)
    }
}

private fun getMinNumIndex(arr : IntArray, start : Int) : Int {
    //1_1. 정렬되지 않은 부분의 맨 처음 index
    var curMinNumIndex = start

    //1_2. 정렬되지 않은 부분에서 가장 작은 수의 index를 찾는다.
        // curMinNumIndex의 처음 수가  start이므로 비교는 start+1부터 시작한다. => arr[start] > arr[start+1]부터 비교 시작
    for(j in start+1  until arr.size){
        if(arr[curMinNumIndex] > arr[j]){
            curMinNumIndex = j
        }
    }

    //1_3. 찾는 index를 반환한다.
    return curMinNumIndex
}

package Baekjun_Programmars.ZLegacy.Sort

//블로그 설명 : https://yellow-shurup.tistory.com/entry/%EC%82%BD%EC%9E%85-%EC%A0%95%EB%A0%AC-%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98Insertion-Sortkotlin

import java.io.*
private val br = BufferedReader(InputStreamReader(System.`in`))
private val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() {
    //입력 예시 : 10 5 7 96 25 3 0 4
    val arr : IntArray = br.readLine().split(" ").map { it.toInt() }.toIntArray()

    //4. 전체 데이터 크기만큼 index가 커질 때까지, 즉 선택할 데이터가 없을 때까지 반복한다.
    for(i in 1 until arr.size){
        //1. 현재 index의 데이터 값을 선택한다.
        val curNum : Int = arr[i]
        //1_1. pointer = 정렬된 부분의 마지막 index
        var pointer : Int = i - 1

        //2. 정렬된 부분의 끝부터 선택한 데이터보다 작은 수를 만날 때까지 pointer--하며 선택한 데이터보다 큰 수들은 shift연산(뒤로 이동)을 실행하여 밀어낸다.
        while (pointer >= 0 && (arr[pointer] > curNum)){
            arr[pointer + 1] = arr[pointer]
            pointer--
        }

        //3. 확보한 공간에 선택한 데이터를 swap하여 삽입한다.
        arr[pointer + 1] = curNum
    }
}
package ProgrammarsAndBaekjun.Sort

/*
* 문제 및 설명 : https://yellow-shurup.tistory.com/entry/Baekjoon11004K%EB%B2%88%EC%A7%B8-%EC%88%98Kotlin%ED%96%A5%EC%83%81%EB%90%9C-%ED%80%B5-%EC%A0%95%EB%A0%ACQuick-Selection
* */

import java.io.*

private val br = BufferedReader(InputStreamReader(System.`in`))
private val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() {

    //입력 받기, N,A
    val (N : Int, K : Int)  = br.readLine().split(" ").map { it.toInt() }
    val A : IntArray = br.readLine().split(" ").map { it.toInt() }.toIntArray()

    quickSort(A, 0, N - 1, K - 1)

    bw.write(A[K-1].toString())
    bw.flush()

}

private fun quickSort(A : IntArray, left: Int, right: Int, K : Int) {

    if(left < right){
        val pivot : Int = partition(A, left, right)
        if(pivot == K){
            return
        }
        else if(K < pivot) {
            quickSort(A, left, pivot - 1, K)
        }
        else {
            quickSort(A, pivot + 1, right, K)
        }
    }
}

private fun partition(A : IntArray, left : Int, right : Int) : Int {
    //데이터가 두 개인 경우 바로 비교하여 정렬한다.
    if(left + 1 == right){
        if(A[left] > A[right]) {
            swap(A, left, right)
        }
        else {
            return right
        }
    }

    val mid : Int = (left + right) / 2

    //중간 pivot값을 시작 위치와 바꾸기
    swap(A, left, mid)

    //pivot값을 시작 위치 값으로 저장
    val pivot : Int = A[left]
    var i : Int = left + 1
    var j : Int = right

    while (i <= j){
        //pivot보다 작은 수가 나올 때까지 j--
        while (pivot < A[j] && j > 0){
            j--
        }
        //pivot보다 큰 수가 나올 때까지 i++
        while (pivot > A[i] && i < A.size - 1){
            i++
        }
        //찾은 i와 j 원소를 swap
        if(i <= j){
            swap(A, i++, j--)
        }
    }

    //i == j pivot의 값을 양쪽으로 분리한 가운데에 오도록 하기
    A[left] = A[j]
    A[j] = pivot
    return j

}

private fun swap(A : IntArray, left: Int, right: Int){
    val temp : Int = A[left]
    A[left] = A[right]
    A[right] =temp
}
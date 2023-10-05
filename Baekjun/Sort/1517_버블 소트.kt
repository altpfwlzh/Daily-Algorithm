package Baekjun.Sort

/*
* 문제 및 설명 : https://yellow-shurup.tistory.com/entry/Baekjoon1377%EB%B2%84%EB%B8%94-%EC%86%8C%ED%8A%B8KotlinBubble-Sort
* */

import java.io.*

private val br = BufferedReader(InputStreamReader(System.`in`))
private val bw = BufferedWriter(OutputStreamWriter(System.out))

private lateinit var tmpA : IntArray
private var ans : Int = 0

fun main() {

    val n : Int = br.readLine().toInt()
    val A : IntArray = br.readLine().split(" ").map { it.toInt() }.toIntArray()
    tmpA = IntArray(n)

    //병합 정렬 수행
    mergeSort(A, 0, n-1)

    bw.write(ans.toString())
    bw.flush()
    bw.close()

}

private fun mergeSort(A : IntArray, start : Int, end : Int) {
    if(start == end){
        return
    }

    val mid : Int = (start + end) / 2

    //왼쪽 그룹 정렬
    mergeSort(A, start, mid)
    //오른쪽 그룹 정렬
    mergeSort(A, mid + 1, end)
    //정렬된 두 그룹을 병합하며 정렬
    merge(A, start, end)

}

private fun merge(A : IntArray, start: Int, end : Int) {
    val mid : Int = (start + end) / 2
    var left : Int= start
    var right : Int = mid + 1
    var tmpI : Int = start

    //두 그룹을 병합한다.
    while(left <= mid && right <= end){
        if(A[left] > A[right]){
            tmpA[tmpI++] = A[right++]
            ans += mid - left + 1
        }
        else{
            tmpA[tmpI++] = A[left++]
        }
    }

    // 왼쪽이나 오른쪽 중 남아있는 배열의 숫자 정렬
    while (left <= mid) {
        tmpA[tmpI++] = A[left++]
    }
    while (right <= end) {
        tmpA[tmpI++] = A[right++]
    }

    // 임시 배열에 정렬한 값을 원래 배열에 반영
    for (i in start..end) {
        A[i] = tmpA[i]
    }
}
package Baekjun.PrefixSum

import java.io.*


private val br = BufferedReader(InputStreamReader(System.`in`))
private val bw = BufferedWriter(OutputStreamWriter(System.out))


fun main() {

    val N : Int = br.readLine().toInt() //표의 크기
    val M : Int = br.readLine().toInt() //구해야 하는 횟수


    val matrix : Array<IntArray> = Array(N+1){IntArray(N+1)} //행렬(square matrix), size가 (N+1)인 이유

    for(x in 1..N){
        for(y in 1..N){
            val num = br.readLine().toInt()
            //합 배열 공식 = 타겟의 바로 위row 누적합 + 타겟의 바로 왼쪽col 누적합 - 중복된 값 + 현재 자기 자신의 값
            matrix[x][y] = matrix[x][y-1] + matrix[x-1][y] - matrix[x-1][y-1] + num
        }
    }

    repeat(M){
        var x1 : Int = br.readLine().toInt()
        var y1 : Int = br.readLine().toInt()
        var x2 : Int = br.readLine().toInt()
        var y2 : Int = br.readLine().toInt()

    }


}Baekjun
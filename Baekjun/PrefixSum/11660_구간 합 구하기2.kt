package Baekjun.PrefixSum

import java.io.*


private val br = BufferedReader(InputStreamReader(System.`in`))
private val bw = BufferedWriter(OutputStreamWriter(System.out))


fun main() {
    val (N : Int, M : Int) = br.readLine().split(" ").map { it.toInt() }

    val matrix : Array<IntArray> = Array(N+1){IntArray(N+1)} //행렬(square matrix), 0행과 0열은 모두0으로 채워야 나중에 빼기 계산할 때 index오류가 나지 않음

    for(x in 1..N){
        val num = br.readLine().split(" ").map { it.toInt() }
        for(y in 1..N){
            //합 배열 공식 = 타겟의 바로 위row 누적합 + 타겟의 바로 왼쪽col 누적합 - 중복된 값 + 현재 자기 자신의 값
            matrix[x][y] = matrix[x][y-1] + matrix[x-1][y] - matrix[x-1][y-1] + num[y-1]
        }
    }

    repeat(M){
        val (x1 : Int, y1 : Int, x2 : Int, y2 : Int,) = br.readLine().split(" ").map { it.toInt() }

        //답 출력 = 빠지는 row - 빠지는 col + 중복된 값
        val ans : Int = matrix[x2][y2] - matrix[x1-1][y2] - matrix[x2][y1-1] + matrix[x1-1][y1-1]

        bw.write(ans.toString() + "\n")

    }

    bw.flush()
    bw.close()

}
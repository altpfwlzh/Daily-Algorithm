package TEST

import java.io.*

private val br = BufferedReader(InputStreamReader(System.`in`))
private val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() {

    //Input
    val (N : Int, M : Int) = br.readLine().split(" ").map { it.toInt() }
    val arr : Array<IntArray> = Array(N+1){IntArray(N+1)}

    //행렬 입력 받음과 동시에 구간합 행렬 만들기
    for(x in 1..N){
        val num = br.readLine().split(" ").map { it.toInt() }
        for (y in 1..N){
            //arr[x][y] = 위에 수 + 왼쪽 수 + 현재 수 - 왼쪽 위 대각석 수
            arr[x][y] = arr[x][y-1] + arr[x-1][y] + num[y-1] - arr[x-1][y-1]
        }
    }

    //출력
    repeat(M){
        val (x1 : Int, y1 : Int, x2 : Int, y2 : Int) = br.readLine().split(" ").map { it.toInt() }
        val ans : Int = arr[x2][y2] - arr[x1-1][y2] - arr[x2][y1-1] + arr[x1-1][y1-1]

        bw.write(ans.toString() + "\n")
    }

    bw.flush()
    bw.close()
}
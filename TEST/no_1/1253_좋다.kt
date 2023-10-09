package TEST

import java.io.*

private val br = BufferedReader(InputStreamReader(System.`in`))
private val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main(){
    val N : Int = br.readLine().toInt()
    val arr : IntArray = br.readLine().split(" ").map { it.toInt() }.toIntArray().sortedArray()
    var ans : Int = 0


    //투 포인터
    repeat(N) { it ->
        var left : Int = 0
        var right : Int = N - 1

        while (left < right) {
            val sumNum : Int = arr[left] + arr[right]

            if(sumNum == arr[it]){
                if(left == it || right == it) {
                    if(left == it) left++
                    if(right == it) {right--}
                }
                if(left != it && right != it){
                    ans++
                    break
                }
            } else if(sumNum < arr[it]){
                left++
            } else {
                right--
            }
        }

    }
    bw.write(ans.toString())
    bw.flush()
    bw.close()
}
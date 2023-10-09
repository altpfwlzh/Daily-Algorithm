package TEST

import java.io.*
import java.util.Stack

private val br = BufferedReader(InputStreamReader(System.`in`))
private val bw = BufferedWriter(OutputStreamWriter(System.out))


fun main() {
    val N : Int = br.readLine().toInt()
    val arr: IntArray = br.readLine().split(" ").map { it.toInt() }.toIntArray()
    val stack : Stack<Int> = Stack<Int>()

    for(i in arr.indices){
        while (stack.isNotEmpty() && arr[stack.peek()] < arr[i]){
            arr[stack.pop()] = arr[i]
        }
        stack.push(i)
    }

    while (stack.isNotEmpty()){
        arr[stack.pop()] = -1
    }

    for(i in arr.indices){
        bw.write("${arr[i]} ")
    }

    bw.flush()
    bw.close()

}
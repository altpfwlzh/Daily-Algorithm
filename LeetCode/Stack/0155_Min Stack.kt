package LeetCode.Stack

import java.io.*

class MinStack {
    var top: Node? = null

    class Node(var data: Int, var min: Int, var prev: Node?)

    fun push(x: Int) {
        top = if (top == null) {
            Node(x, x, null)
        } else {
            val min = Math.min(x, top!!.min)
            Node(x, min, top)
        }
    }

    fun pop() {
        if (top == null) throw Exception("Empty Stack.")
        top = if (top!!.prev == null) {
            null
        } else {
            Node(top!!.prev!!.data, top!!.prev!!.min, top!!.prev!!.prev)
        }
    }

    fun top(): Int {
        if (top == null) throw Exception("Empty Stack.")
        return top!!.data
    }

    fun getMin(): Int {
        if (top == null) throw Exception("Empty Stack.")
        return top!!.min
    }

}

private val br = BufferedReader(InputStreamReader(System.`in`))
private val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() {

    bw.flush()
    bw.close()
}
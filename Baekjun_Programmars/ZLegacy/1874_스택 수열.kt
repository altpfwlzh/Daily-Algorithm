package Baekjun_Programmars.ZLegacy

import java.io.*
import java.lang.StringBuilder
import java.util.Stack

private val br = BufferedReader(InputStreamReader(System.`in`))
private val sb = StringBuilder()

fun main() {
    val n: Int = br.readLine().toInt()
    val A: MutableList<Int> = mutableListOf()
    repeat(n){
        A.add(br.readLine().toInt())
    }
    val intStack: Stack<Int> = Stack<Int>()
    var num: Int = 1

    repeat(n){
        if(A[it] >= num) {
            while (A[it] >= num) {
                intStack.push(num++)
                sb.append("+\n")
            }
            intStack.pop()
            sb.append("-\n")
        }
        else {
            if (intStack.pop() < A[it]) {
                println("NO")
                return
            }
            else {
                sb.append("-\n")
            }
        }
    }
    println(sb)
}
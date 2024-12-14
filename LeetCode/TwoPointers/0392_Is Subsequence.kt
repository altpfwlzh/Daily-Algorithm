package LeetCode.TwoPointers
/*
* 문제 및 설명 : https://yellow-shurup.tistory.com/entry/0392Is-Subsequence
* */

import java.io.*

class IsSubsequence {
    fun isSubsequence(s: String, t: String): Boolean {
        var i = 0
        var j = 0

        while(i < s.length && j < t.length) {
            if(s[i] == t[j]) i++

            j++
        }
        return i==s.length
    }
}

private val br = BufferedReader(InputStreamReader(System.`in`))
private val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() {
    bw.write(IsSubsequence().isSubsequence(br.readLine(), br.readLine()).toString())
    bw.flush()
    bw.close()
}
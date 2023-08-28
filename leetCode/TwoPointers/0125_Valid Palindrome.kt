package leetCode.TwoPointers

import java.io.*
import java.util.*

class Solution {
    fun isPalindrome(s: String): Boolean {
        val regex : Regex = Regex("[^A-Za-z0-9]")
        val input : String = regex.replace(s, "").lowercase(Locale.getDefault())

        for (i in 0 until input.length/2) {
            if (input[i] != input[input.length -1 - i]) return false
        }

        return true
    }
}

private val br = BufferedReader(InputStreamReader(System.`in`))
private val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() {

    bw.write(Solution().isPalindrome(br.readLine()).toString())
    bw.flush()

}

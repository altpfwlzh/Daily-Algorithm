package leetCode.TwoPointers

import java.io.*
import java.util.*

class Solution {

    fun isPalindrome(s: String): Boolean {
        val regex : Regex = Regex("[^A-Za-z0-9]")
        val input : String = regex.replace(s, "").lowercase(Locale.getDefault())
        var sP = 0
        var eP = input.length - 1

        while(sP < eP){
            if (input[sP] != input[eP]) return false
            sP++
            eP--
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
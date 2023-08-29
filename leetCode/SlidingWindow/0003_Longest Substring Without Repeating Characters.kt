package leetCode.SlidingWindow

import java.io.*

/*
* 문제 및 설명 : https://yellow-shurup.tistory.com/entry/LeetCode0003Longest-Substring-Without-Repeating-CharactersKotlinSlidingWindow
* */


class LongestSubstringWithoutRepeatingCharacters{
    fun lengthOfLongestSubstring(s: String): Int {
        val curArr : BooleanArray = BooleanArray(128){false}
        var left = 0
        var right = 0
        var ans = 0

        while(right < s.length) {
            if(!curArr[s[right].code]) {
                curArr[s[right].code] = true
                if(right - left + 1 > ans ) ans = right - left + 1
                right++
            } else {
                curArr[s[right].code] = true
                do {
                    curArr[s[left].code] = false
                    left++
                } while (curArr[s[right].code])
            }
        }
        return ans
    }
}

private val br = BufferedReader(InputStreamReader(System.`in`))
private val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() {

    val ans = LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring(br.readLine())

    bw.write(ans.toString())
    bw.flush()
    bw.close()
}

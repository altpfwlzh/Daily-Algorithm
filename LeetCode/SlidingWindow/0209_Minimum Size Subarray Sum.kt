package LeetCode.SlidingWindow

/*
* 문제 및 설명 : https://yellow-shurup.tistory.com/entry/LeetCode0209Minimum-Size-Subarray-Sum
* */

import java.io.*

class MinimumSizeSubarraySum {
    fun minSubArrayLen(target: Int, nums: IntArray): Int {
        var left : Int = 0
        var right : Int = 0
        var subarray  = Int.MAX_VALUE
        var sum = nums[left]

        while (right< nums.size && right >= left) {
            if(sum < target) {
                if(right - left + 1 < subarray) {
                    if(++right < nums.size) {sum += nums[right]}
                } else{
                    sum -= nums[left++]
                    if(++right < nums.size) {sum += nums[right]}
                }

            } else {
                subarray = right - left + 1
                sum -= nums[left++]
            }
        }

        if(subarray == Int.MAX_VALUE) return 0
        else return subarray

    }
}

private val br = BufferedReader(InputStreamReader(System.`in`))
private val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() {

    val target : Int = br.readLine().toInt()
    val nums : IntArray = br.readLine().split(" ").map { it.toInt() }.toIntArray()

    val ans = MinimumSizeSubarraySum().minSubArrayLen(target, nums)

    bw.write(ans.toString())
    bw.flush()
    bw.close()

}
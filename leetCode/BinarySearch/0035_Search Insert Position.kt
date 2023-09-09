package leetCode.BinarySearch

import java.io.*

/*문제 및 설명 : https://yellow-shurup.tistory.com/entry/LeetCode0035Search-Insert-PositionKotilnBinarySearch*/


class SearchInsertPosition {
    fun searchInsert(nums: IntArray, target: Int): Int {
        var left : Int = 0
        var right : Int = nums.size - 1

        while(left <= right) {
            val mid = (left + right) / 2

            if(nums[mid] == target) return mid
            if(nums[mid] > target) right = mid - 1
            if(nums[mid] < target) left = mid + 1
        }

        return left
    }
}

/*

class SearchInsertPosition {
    fun searchInsert(nums: IntArray, target: Int): Int {

        var nums = nums.plus(target)
        nums.sort()

        return nums.indexOf(target)
    }
}

*/

private val br = BufferedReader(InputStreamReader(System.`in`))
private val bw = BufferedWriter(OutputStreamWriter(System.out))


fun main() {
    val nums : IntArray = br.readLine().split(" ").map { it.toInt() }.toIntArray()
    val target : Int = br.readLine().toInt()

    bw.write(SearchInsertPosition().searchInsert(nums, target))
    bw.flush()
    bw.close()
}
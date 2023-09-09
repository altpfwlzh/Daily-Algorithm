package leetCode.BinarySearch

import java.io.*

/*문제 및 설명 : */


class SearchInsertPosition {
    fun searchInsert(nums: IntArray, target: Int): Int {

        var nums = nums.plus(target)
        nums.sort()

        return nums.indexOf(target)
    }
}


private val br = BufferedReader(InputStreamReader(System.`in`))
private val bw = BufferedWriter(OutputStreamWriter(System.out))


fun main() {
    val nums : IntArray = br.readLine().split(" ").map { it.toInt() }.toIntArray()
    val target : Int = br.readLine().toInt()

    bw.write(SearchInsertPosition().searchInsert(nums, target))
    bw.flush()
    bw.close()
}
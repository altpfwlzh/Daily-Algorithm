package LeetCode.TwoPointers
/*
* 문제 및 설명 : https://yellow-shurup.tistory.com/entry/0167Two-Sum-II-Input-Array-Is-Sorted
* */

import java.io.*

class TwoSum2 {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        var i = 0
        var j = numbers.size - 1

        while (i < j) {
            if (numbers[i] + numbers[j] > target) j--
            else if (numbers[i] + numbers[j] < target) i++
            else return intArrayOf(i + 1, j + 1)
        }
        return intArrayOf(i + 1, j + 1)
    }
}

private val br = BufferedReader(InputStreamReader(System.`in`))
private val bw = BufferedWriter(OutputStreamWriter(System.out))


fun main() {
    val numbers: IntArray = br.readLine().split(" ").map { it.toInt() }.toIntArray()
    val target: Int = br.readLine().toInt()

    bw.write(TwoSum2().twoSum(numbers, target).contentToString())
    bw.flush()
    bw.close()
}
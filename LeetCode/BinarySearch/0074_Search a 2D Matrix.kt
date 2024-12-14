package LeetCode.BinarySearch

/*문제 및 설명 : https://yellow-shurup.tistory.com/entry/LeetCode0074Search-a-2D-MatrixKotilnBinarySearch*/

import java.io.*

class SearchA2DMatrix {
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
        val row = matrix.size
        val col = matrix[0].size

        var i = 0
        var j = row*col - 1

        while (i <= j) {
            val mid = i + (j - i) / 2
            val curNum = matrix[mid/col][mid%col]
            if (curNum > target) j = mid - 1
            else if (curNum < target) i = mid + 1
            else return true
        }

        return false
    }
}

private val br = BufferedReader(InputStreamReader(System.`in`))
private val bw = BufferedWriter(OutputStreamWriter(System.out))


fun main() {

    bw.flush()
    bw.close()
}
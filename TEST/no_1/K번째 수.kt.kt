package TEST

import java.io.*

private val br = BufferedReader(InputStreamReader(System.`in`))
private val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() {
    val (N : Int, K : Int) = br.readLine().split(" ").map { it.toInt() }
    val arr : IntArray = br.readLine().split(" ").map { it.toInt() }.toIntArray()

    quickSort(arr, 0, arr.size -1, K-1)

    bw.write(arr[K-1].toString())
    bw.flush()
}

private fun quickSort(arr : IntArray, left : Int, right : Int, K : Int){
    if(left < right){
        val pivot : Int = partition(arr, left, right)
        if(pivot == K) return
        else if(K < pivot) {
            quickSort(arr, left, pivot - 1, K)
        } else {
            quickSort(arr, pivot + 1, right, K)
        }

    }
}

private fun partition(arr : IntArray, left: Int, right: Int) : Int {
    if(left +1 == right){
        if(arr[left] > arr[right]) {
            swap(arr, left, right)
        } else {
            return right
        }
    }

    val mid : Int = (left + right) / 2
    swap(arr, mid, left)

    val pivot : Int = arr[left]
    var low : Int = left + 1
    var high : Int = right

    while (low <= high) {
        while (pivot < arr[high] && high > 0) {
            high--
        }

        while (pivot > arr[low] && low < arr.size - 1){
            low++
        }

        if(low < high) {
            swap(arr, low, high)
            low++
            high--
        }

        if(low == high) {
            low++
            high--
        }
    }

    arr[left] = arr[high]
    arr[high] = pivot

    return high

}

private fun swap(arr : IntArray, i : Int, j : Int){
    val tmp : Int = arr[i]
    arr[i] = arr[j]
    arr[j] = tmp
}

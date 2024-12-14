package Baekjun_Programmars.ZLegacy.Sort

import java.util.*


fun main() {
    val arr = intArrayOf(5, 3, 8,9,2,4, 7)
    quickSort(arr)
    print(Arrays.toString(arr))
}

fun quickSort(arr: IntArray, left: Int = 0, right: Int = arr.size - 1) {
    if(left >= right) return

    val pivot = partition(arr, left, right)

    quickSort(arr, left, pivot - 1)
    quickSort(arr, pivot + 1, right)
}

fun partition(arr: IntArray, left: Int, right: Int): Int {
    var low = left + 1
    var high = right
    val mid : Int = (left + right) / 2
    swap(arr, left, mid)

    val pivot : Int = arr[left]

    while (low <= high) {
        while (arr[low] <= pivot && low < high) low++
        while (arr[high] > pivot && low <= high) high--

        if(low < high)
            swap(arr, low, high)
        else
            break
    }

    swap(arr, left, high)

    return high
}

fun swap(arr: IntArray, i: Int, j: Int) {
    var temp = arr[i]
    arr[i] = arr[j]
    arr[j] = temp
}

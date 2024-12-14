package Baekjun_Programmars.Sort

//블로그 설명 :

import java.io.*
private val br = BufferedReader(InputStreamReader(System.`in`))
private val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() {
    //입력 예시 : 45 24 32 24 60 15 5 90
    val arr : IntArray = br.readLine().split(" ").map { it.toInt() }.toIntArray()

    quickSort(arr, 0, arr.size - 1)

    bw.write(arr.contentToString())
    bw.flush()
    bw.close()
}

private fun quickSort(arr : IntArray, left : Int, right : Int) {
    //4.분할된 배열의 크기가 1개 이하가 될 때까지 1~3과정을 반복한다.
    if(left >= right) return

    //2.pivot을 기준으로 두 개의 집합으로 분할한다.
    val pivot : Int = partition(arr, left, right)

    //3. pivot을 기준으로 왼쪽과 오른쪽의 부분 배열로 분할하여 1~2 과정을 반복한다
    quickSort(arr, left, pivot - 1)
    quickSort(arr, pivot + 1, right)


}

private fun partition(arr : IntArray, left: Int, right: Int) : Int {
    //1. 배열의 중간 값을 pivot값으로 하고, 이를 배열의 맨 처음으로 옮긴다.
    val mid : Int = (left + right) / 2
    swap(arr, left, mid)

    val pivot : Int = arr[left]

    //2_0. 정렬되지 않은 부분의 첫 데이터의 index를 low, 마지막 데이터를 high로 한다.
    var low : Int = left + 1
    var high : Int = right

    //2_4. low와 high가 만날 때까지 2_1 ~ 2_3을 반복한다
    while(low < high) {

        //2_1. pivot보다 작거나 같은 수가 나올 때까지(큰 수들은 통과) high를 감소시킨다. 이 때 high가 범위에서 벗어나지 않게 주의한다.
        while (arr[high] >= pivot && high >= low) {
            high--
        }

        //2_3. 2_1과 2_2가 끝나면 arr[low]와 arr[high]를 swap한다.
        while (pivot > arr[low] && low < arr.size - 1) {
            low++
        }

        //2_5. 2_1과 2_2가 끝나면 pivot 위치의 값(arr[left])과 arr[high]를 swap한다.
        if (low < high) {
            swap(arr, low, high)
        }
    }

    swap(arr, left, high)

    return high

}

private fun swap(arr : IntArray, i : Int, j : Int) {
    val tmp : Int = arr[i]
    arr[i] = arr[j]
    arr[j] = tmp
}

package leetCode

/*
* 입력: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
 출력: [1,2,2,3,5,6]
 설명: 병합할 배열은 [1,2,3] 및 [2,5,6]입니다.
병합의 결과는 [ 1 , 2 ,2, 3 ,5,6] 이며 밑줄 친 요소는 nums1에서 나옵니다.
*
* class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {

    }
}
*/

private fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int) : Unit {
    var tail1 = m-1
    var tail2 = n-1
    var insertPointer = m+n-1

    while (tail1 >= 0 && tail2 >= 0) {
        if(nums1[tail1] > nums2[tail2]) {  //같은 수일 경우 nums1의 수가 먼저 정렬되어야 한다.
            nums1[insertPointer--] = nums1[tail1--]
        } else {
            nums1[insertPointer--] = nums2[tail2--]
        }
    }

    while (tail2 >=0 ){ //nums1에 남은 원소가 없고 nums2에만 원소가 남았을 때 그저 병합만 하는 구문
        nums1[insertPointer--] = nums2[tail2--]
    }

}

/*
import java.io.*

private val br = BufferedReader(InputStreamReader(System.`in`))
private val bw = BufferedWriter(OutputStreamWriter(System.out))


fun main() {


    val nums1 : IntArray = br.readLine().split(" ").map { it.toInt() }.toIntArray()
    val m = br.readLine().toInt()

    val nums2 : IntArray = br.readLine().split(" ").map { it.toInt() }.toIntArray()
    val n = br.readLine().toInt()

    //merge(긴 거, 수, 짧은 거, 수)
    merge(nums1, m, nums2, n)

}

*/
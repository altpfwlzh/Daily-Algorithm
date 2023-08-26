class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int) : Unit {
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
}
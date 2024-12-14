class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        
        val map = HashMap<Int, Int>()

        nums.forEachIndexed{ i, currentNum ->
            val complement = target - currentNum
            map[complement]?.let{ return intArrayOf(it, i) }
            map.put(currentNum, i)
        }

        return intArrayOf(-1,-1)
    }
}
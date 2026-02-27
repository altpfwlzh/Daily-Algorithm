package Baekjun_Programmars.Sort

private class Solution_add_selected_two_2 {
    fun solution(numbers: IntArray): IntArray {
        val ansList = mutableSetOf<Int>()

        for (i in numbers.indices) {
            for (j in i+1..(numbers.size-1)) {
                ansList.add(numbers[i] + numbers[j])
            }
        }

        return ansList.sorted().toIntArray()
    }
}

private class Solution_add_selected_two_1 {
    fun solution(numbers: IntArray): IntArray {
        val ansList = mutableListOf<Int>()

        repeat(numbers.size) {
            var idx = it + 1
            while(idx < numbers.size ) {
                ansList.add(numbers[it] + numbers[idx])
                idx++
            }
        }

        return ansList.toSet().sorted().toIntArray()
    }
}
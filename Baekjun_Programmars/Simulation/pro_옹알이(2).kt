package Baekjun_Programmars.Simulation

private class Solution_babbling {
    fun solution(babbling: Array<String>): Int {
        val words = arrayOf("aya", "ye", "woo", "ma")
        var answer = 0

        for (ba in babbling) {
            var idx = 0
            var prev = ""

            while (idx < ba.length) {
                var isMatched = false

                for (word in words) {
                    if (ba.startsWith(word, idx) && prev != word) {
                        idx += word.length
                        prev = word
                        print(idx.toString() + word + " ")
                        isMatched = true
                    }
                }

                if(!isMatched) break
            }

            if(idx == ba.length) answer++
        }

        return answer
    }
}
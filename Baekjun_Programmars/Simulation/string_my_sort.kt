package Baekjun_Programmars.Simulation


/*
 n번째 알파벳을 기준으로 정렬 / 겹치면 사전순
 */
private class Solution_string_my_sort_2 {
    fun solution(strings: Array<String>, n: Int): Array<String> {
        /*
         * 개념 : 2순위 조건 -> 1순위 조건 : 으로 진행
         * 이유 : 2번째로 진행하는 것이 앞에서 진행한 것을 덮어쓰기 때문에!!
         */
        return strings.sorted().sortedBy { it[n] }.toTypedArray()
    }
}

private class Solution_string_my_sort_1 {
    fun solution(strings: Array<String>, n: Int): Array<String> {
        return strings.sortedWith { a, b ->
            if (a[n] == b[n]) a.compareTo(b)
            else a[n].compareTo(b[n])
        }.toTypedArray()
    }
}

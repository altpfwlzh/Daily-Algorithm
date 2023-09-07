package leetCode.LinkedList

import java.io.*

/*문제 및 설명 :  https://yellow-shurup.tistory.com/entry/LeetCode0021Merge-Two-Sorted-ListsKotilnLinked-List*/

class MergeTwoSortedLists {

    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        var tmp1 : ListNode? = list1
        var tmp2 : ListNode? = list2

        val ans : ListNode = ListNode(-1)
        var curAns : ListNode = ans

        while (tmp1 != null && tmp2 != null){

            if(tmp1.`val` <= tmp2.`val`){
                curAns.next = tmp1
                tmp1 = tmp1.next
            } else {
                curAns.next = tmp2
                tmp2 = tmp2.next
            }
            curAns = curAns.next!!
        }

        if(tmp1 == null) curAns.next = tmp2
        if(tmp2 == null) curAns.next = tmp1

        return ans.next
    }
}

private val br = BufferedReader(InputStreamReader(System.`in`))
private val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() {

}
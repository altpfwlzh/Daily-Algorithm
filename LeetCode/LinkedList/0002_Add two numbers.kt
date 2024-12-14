package LeetCode.LinkedList

/*문제 및 설명 : https://yellow-shurup.tistory.com/entry/LeetCode0141Linked-List-CycleKotilnLinked-List*/

class AddTwoNumbers {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var tmp1: ListNode? = l1
        var tmp2: ListNode? = l2
        var carry : Int = 0

        val ans : ListNode = ListNode(-1)
        var curAns : ListNode = ans

        while (tmp1 != null || tmp2 != null || carry > 0){
            var sum : Int = 0

            if(tmp1 != null){
                sum += tmp1.`val`
                tmp1 = tmp1.next
            }

            if(tmp2!= null){
                sum += tmp2.`val`
                tmp2 = tmp2.next
            }

            sum += carry

            if(sum >= 10){
                carry = 1
                sum -= 10
            } else {
                carry = 0
            }

            curAns.next = ListNode(sum)
            curAns = curAns.next!!
        }

        return ans.next
    }
}


fun main() {


}

import java.io.*

/*문제 및 설명 : https://yellow-shurup.tistory.com/entry/LeetCode0141Linked-List-CycleKotilnLinked-List*/

class LinkedListCycle {
    fun hasCycle(head: ListNode?): Boolean {
        var slow : ListNode? = head
        var fast : ListNode? = head

        while(slow?.next != null && fast?.next != null) {
            slow = slow?.next
            fast = fast?.next?.next

            if(slow == fast) return true
        }
        return false
    }

}

class ListNode(val pos : Int) {
    var next : ListNode? = null
}


private val br = BufferedReader(InputStreamReader(System.`in`))
private val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() {


    val ans = LinkedListCycle().hasCycle(br.readLine())

    bw.write(ans.toString())
    bw.flush()
    bw.close()

}
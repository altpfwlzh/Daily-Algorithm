package leetCode.Graph

import org.w3c.dom.Node

class CloneGraph {
    private lateinit var memo: HashMap<Int, Node>

    fun cloneGraph(node: Node?): Node? {
        memo = hashMapOf()
        return recCloneGraph(node)
    }

    private fun recCloneGraph(node: Node?): Node? {
        if (node == null) return null //빈 리스트면 그대로 반환
        if (memo.containsKey(node.`val`)) return memo[node.`val`]
        val copy = Node(node.`val`)
        memo[copy.`val`] = copy
        for (neighbor in node.neighbors) {
            copy.neighbors.add(recCloneGraph(neighbor))
        }
        return copy
    }
}

internal class Node {
    var `val` = 0
    var neighbors: List<Node>? = null
}
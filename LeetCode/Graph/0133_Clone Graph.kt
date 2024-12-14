package LeetCode.Graph


class CloneGraph {
    private lateinit var memo: HashMap<Int, Node>

    fun cloneGraph(node: Node?): Node? {
        memo = hashMapOf()
        return recCloneGraph(node)
    }

    private fun recCloneGraph(node: Node?): Node? {
        if (node == null) return null //빈 리스트면 그대로 반환
        if (memo.containsKey(node.`val`)) return memo[node.`val`]
        val copy = Node()
        memo[copy.`val`] = copy
        for (neighbor in node.neighbors!!) {
            copy.neighbors?.plus(recCloneGraph(neighbor))
        }
        return copy
    }
}


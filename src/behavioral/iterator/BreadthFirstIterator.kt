package behavioral.iterator

import java.util.*

class BreadthFirstIterator(node: TreeNode): Iterator {
    private val queue: Queue<TreeNode> = LinkedList()

    init {
        queue.add(node)
    }

    override fun next(): Int {
        if (isDone()) throw Exception("Iterator out of bounds")
        val node = queue.remove()
        queue.addAll(node.children)
        return node.value
    }

    override fun isDone(): Boolean {
        return queue.isEmpty()
    }
}
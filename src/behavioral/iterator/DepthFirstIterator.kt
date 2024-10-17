package behavioral.iterator

import java.util.Stack

class DepthFirstIterator(node: TreeNode) : Iterator {
    private val stack: Stack<TreeNode> = Stack()

    init {
        stack.add(node)
    }

    override fun next(): Int {
        if(isDone()) throw Exception("Iterator out of bounds")
        val node = stack.pop()
        node.children.reversed().forEach { stack.push(it) }
        return node.value
    }

    override fun isDone(): Boolean {
        return stack.isEmpty()
    }
}
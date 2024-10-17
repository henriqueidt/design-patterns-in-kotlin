package behavioral.iterator

class TreeNode(val value: Int) {
    val children = mutableListOf<TreeNode>()

    fun add(node: TreeNode) {
        children.add(node)
    }
}
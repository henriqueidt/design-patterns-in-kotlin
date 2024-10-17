package behavioral.iterator

fun main() {
    val root = TreeNode(0)
    val child1 = TreeNode(1)
    val child2 = TreeNode(2)
    val child3 = TreeNode(3)
    val child4 = TreeNode(4)
    val child5 = TreeNode(5)
    val child6 = TreeNode(6)

    root.add(child1)
    root.add(child2)
    child1.add(child3)
    child3.add(child4)
    child2.add(child5)
    child2.add(child6)


//    DFS
    println("DFS")
    val dfs = DepthFirstIterator(root)
    while (!dfs.isDone()) {
        print("${dfs.next()} ")
    }

//   BFS
    println("\nBFS")
    val bfs = BreadthFirstIterator(root)
    while (!bfs.isDone()) {
        print("${bfs.next()} ")
    }
}
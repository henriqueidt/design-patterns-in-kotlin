package behavioral.visitor

interface Visitor {
    fun visit(element: Book)
    fun visit(element: Videogame)
    fun visit(element: Cloth)
}
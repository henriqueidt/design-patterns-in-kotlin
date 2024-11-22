package behavioral.visitor

class Videogame(override var price: Double, title: String): Element {
    override fun accept(visitor: Visitor) {
        visitor.visit(this)
    }
}
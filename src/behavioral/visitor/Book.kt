package behavioral.visitor

class Book(override var price: Double, title: String): Element {
    override fun accept(visitor: Visitor) {
        visitor.visit(this)
    }
}
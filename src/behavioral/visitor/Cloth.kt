package behavioral.visitor

class Cloth(override var price: Double, name: String): Element {
    override fun accept(visitor: Visitor) {
        visitor.visit(this)
    }
}
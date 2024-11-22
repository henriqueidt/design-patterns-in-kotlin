package behavioral.visitor

interface Element {
    abstract val price: Double

    fun accept(visitor: Visitor)
}
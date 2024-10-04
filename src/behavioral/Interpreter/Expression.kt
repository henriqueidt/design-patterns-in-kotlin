package behavioral.Interpreter

interface Expression {
    fun interpret(): Int

    override fun toString(): String
}
package behavioral.Interpreter

class PlusExpression(val left: Expression, val right: Expression): Expression {
    override fun interpret(): Int {
        return left.interpret() + right.interpret()
    }

    override fun toString(): String {
        return "+"
    }
}
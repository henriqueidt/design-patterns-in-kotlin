package behavioral.Interpreter

class MultiplyExpression(val left: Expression, val right: Expression): Expression {
    override fun interpret(): Int {
        return left.interpret() * right.interpret()
    }

    override fun toString(): String {
        return "*"
    }
}
package behavioral.Interpreter

class MinusExpression(val left: Expression, val right: Expression): Expression {
    override fun interpret(): Int {
        return left.interpret() - right.interpret()
    }

    override fun toString(): String {
        return "-"
    }
}
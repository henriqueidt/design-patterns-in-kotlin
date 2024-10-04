package behavioral.Interpreter

class NumberExpression(val number: Int): Expression {
    override fun interpret(): Int {
        return number
    }

    override fun toString(): String {
        return "NumberExpression(number=$number)"
    }
}
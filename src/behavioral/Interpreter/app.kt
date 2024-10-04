package behavioral.Interpreter

fun main() {
    val expression = "5 3 + 2 - 2 *";
    val result = parse(expression).interpret()
    println("Result: $result")

}

fun parse(expression: String): Expression {
    val tokens = expression.split(" ")
    val stack = mutableListOf<Expression>()

    for (token in tokens) {
        if (token == "+") {
            val right = stack.removeAt(stack.size - 1)
            val left = stack.removeAt(stack.size - 1)
            stack.add(PlusExpression(left, right))
        } else if (token == "-") {
            val right = stack.removeAt(stack.size - 1)
            val left = stack.removeAt(stack.size - 1)
            stack.add(MinusExpression(left, right))
        } else if (token == "*") {
            val right = stack.removeAt(stack.size - 1)
            val left = stack.removeAt(stack.size - 1)
            stack.add(MultiplyExpression(left, right))
        } else {
            stack.add(NumberExpression(token.toInt()))
        }
    }
    return stack[0]
}
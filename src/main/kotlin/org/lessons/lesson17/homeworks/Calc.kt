package org.lessons.org.lessons.lesson17.homeworks



abstract class Operation(private val operator: String) {
    abstract fun operate(expression: String): String
    fun check(expression: String): Boolean {
        return expression.contains(operator)
    }
    protected fun split(expression: String): List<Double> {
        return expression.split(operator)
            .map { it.trim() }
            .map { it.toDouble() }
    }
}
private class Addition : Operation("+") {
    override fun operate(expression: String): String {
        return split(expression).sum().toString()
    }
}
private class Subtraction : Operation("-") {
    override fun operate(expression: String): String {
        val operands = split(expression)
        return (operands[0] - operands[1]).toString()
    }
}
private class Multiplication : Operation("*") {
    override fun operate(expression: String): String {
        val operands = split(expression)
        return (operands[0] * operands[1]).toString()
    }
}
private class Division : Operation("/") {
    override fun operate(expression: String): String {
        val operands = split(expression)
        return if (operands[1] == 0.0) {
            "Division by zero"
        } else {
            (operands[0] / operands[1]).toString()
        }
    }
}
class Calculator(private val customOperations: List<Operation>) {
    private val operations = listOf(
        Addition(),
        Subtraction(),
        Multiplication(),
        Division()
    ) + customOperations
    fun operate(expression: String): String {
        val operation = operations.firstOrNull { it.check(expression) }
        if (operation == null) {
            return "Unsupported operator in the expression '$expression'"
        }
        return operation.operate(expression)
    }
}

fun main() {
    val calculator = Calculator(listOf(Equals()))
    println(calculator.operate("3 + 5"))
    println(calculator.operate("3 * 5"))
    println(calculator.operate("3 / 5"))
    println(calculator.operate("3 - 5"))
    println(calculator.operate("3 == 5"))
}
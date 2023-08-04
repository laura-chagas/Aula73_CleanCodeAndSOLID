package d
class Sum : Operation {
    override fun calculate(a: Int, b: Int): Int {
        return a + b
    }
}

class Subtraction : Operation {
    override fun calculate(a: Int, b: Int): Int {
        return a - b
    }
}

class CalculatorClass(private val operation: Operation) {
    fun calculate(a: Int, b: Int): Int {
        return operation.calculate(a, b)
    }
}

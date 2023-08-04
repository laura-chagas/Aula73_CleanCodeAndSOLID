package d

fun main() {
    val sumOperation = Sum()
    val subtractionOperation = Subtraction()
    val newCalculator1 = CalculatorClass(sumOperation)
    val newCalculator2 = CalculatorClass(subtractionOperation)

    println(newCalculator1.calculate(5,5))
    println(newCalculator2.calculate(5,5))

}
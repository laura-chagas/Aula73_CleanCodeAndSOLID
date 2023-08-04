package o
fun main() {
    val payment  = Payment()
    println("Salary: ${payment.calculateSalary(CltContract())}")
    println("Salary: ${payment.calculateSalary(Intership())}")
}

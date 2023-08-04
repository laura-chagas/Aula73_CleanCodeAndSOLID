package o

class CltContract: Remunerable{
    override fun remuneration(): Double {
        return 1200.00
    }
}
class Intership: Remunerable{
    override fun remuneration(): Double {
        return 800.00
    }
}
class Payment{
    private var salary = 0.0

    fun calculateSalary(employee: Remunerable): Double{
        salary = employee.remuneration()
        return  salary
    }
}
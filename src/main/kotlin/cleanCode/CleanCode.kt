package cleanCode

fun main(){
    println(calculateValueBasedOnConditions(0,4,-1))
}

fun calculateValueBasedOnConditions(numberOne: Int, numberTwo: Int, numberThree: Int): Int {
    return when {
        numberOne > 0 -> numberOne * 2
        numberTwo > 0 -> numberTwo * 3
        numberThree > 0 -> numberThree * 4
        else -> 0
    }
}
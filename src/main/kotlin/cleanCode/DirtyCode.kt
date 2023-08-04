package cleanCode

fun calculate(a: Int, b: Int, c: Int): Int {
     var result = 0
    if (a > 0)
         result = a * 2

    else if (b > 0)
        result = b * 3

    else if (c > 0)
     result = c * 4

    return result
}
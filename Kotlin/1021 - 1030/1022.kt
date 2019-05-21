import java.util.*
import kotlin.math.absoluteValue

fun mdc (a: Int, b: Int): Int {
    var resto: Int
    var newA = a
    var newB = b
    //resolução por algoritmo de Euclides
    do {
        resto = newA % newB
        newA = newB
        newB = resto
    } while (resto != 0)
    return newA
}

fun main (args: Array<String>) {
    val n = readLine()!!.toInt()
    var input: List<String>
    var numerator: Int
    var denominator: Int
    var divisor: Int

    for (i in 0 until n) {
        input = readLine()!!.split(' ')
        when (input[3]) {
            "+" -> {
                numerator = (input[0].toInt() * input[6].toInt()) + (input[4].toInt() * input[2].toInt())
                denominator = input[2].toInt() * input[6].toInt()
            }
            "-" -> {
                numerator = (input[0].toInt() * input[6].toInt()) - (input[4].toInt() * input[2].toInt())
                denominator = input[2].toInt() * input[6].toInt()
            }
            "*" -> {
                numerator = input[0].toInt() * input[4].toInt()
                denominator = input[2].toInt() * input[6].toInt()
            }
            else -> {
                numerator = input[0].toInt() * input[6].toInt()
                denominator = input[2].toInt() * input[4].toInt()
            }
        }
        print("%d/%d".format(numerator, denominator))
        divisor = mdc(numerator, denominator)
        println(" = %d/%d".format(numerator/divisor.absoluteValue, denominator/divisor.absoluteValue))
    }
}
import java.util.*

fun main(args: Array<String>) {
    val r = readLine()!!.toDouble()
    val PI = 3.14159
    println("A=" + "%.4f".format(PI * (r * r)))
}
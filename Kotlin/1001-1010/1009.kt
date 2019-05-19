import java.util.*

fun main(args: Array<String>) {
    val name = readLine()!!
    val salary = readLine()!!.toFloat()
    val sales = readLine()!!.toFloat()

    println("TOTAL = R$ " + "%.2f".format(salary + 0.15*sales))
}
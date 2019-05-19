import java.util.*

fun main (args: Array<String>) {
    val km = readLine()!!.toInt()
    val fuel = readLine()!!.toDouble()
    println("%.3f".format((km/fuel)) + " km/l")
}
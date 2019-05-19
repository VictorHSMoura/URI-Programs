import java.util.*

fun main (args: Array<String>) {
    val km = readLine()!!.toInt()
    val distance = ((km/30.0) * 60).toInt()
    println(distance.toString() + " minutos")
}
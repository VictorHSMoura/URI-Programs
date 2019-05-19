import java.util.*
import kotlin.math.pow

const val pi = 3.14159

fun main (args: Array<String>) {
    val r = readLine()!!.toDouble()
    println("VOLUME = " + "%.3f".format((4.0/3) * pi * r.pow(3)))
}
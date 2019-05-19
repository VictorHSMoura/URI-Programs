import java.util.*
import kotlin.math.*

fun main (args: Array<String>) {
    val point1 = readLine()!!.split(' ').map(String::toDouble)
    val point2 = readLine()!!.split(' ').map(String::toDouble)
    val dist = sqrt((point2[0] - point1[0]).pow(2) + (point2[1] - point1[1]).pow(2))
    println("%.4f".format(dist))
}
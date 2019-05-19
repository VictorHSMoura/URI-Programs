import java.util.*

fun main(args: Array<String>) {
    val time = readLine()!!.toInt()
    val speed = readLine()!!.toInt()
    println("%.3f".format((time * speed)/12.0))
}
import java.util.*

fun main(args: Array<String>) {
    val grade1 = readLine()!!.toDouble()
    val grade2 = readLine()!!.toDouble()
    println("MEDIA = " + "%.5f".format((grade1 * 3.5 + grade2 * 7.5)/11.0))
}
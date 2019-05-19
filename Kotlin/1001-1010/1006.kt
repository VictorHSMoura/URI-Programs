import java.util.*

fun main(args: Array<String>) {
    val grade1 = readLine()!!.toDouble()
    val grade2 = readLine()!!.toDouble()
    val grade3 = readLine()!!.toDouble()
    println("MEDIA = " + "%.1f".format((grade1 * 2 + grade2 * 3 + grade3 * 5)/10.0))
}
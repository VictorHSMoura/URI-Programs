import java.util.*

fun main(args: Array<String>) {
    val number = readLine()!!.toInt()
    val hours = readLine()!!.toInt()
    val moneyHour = readLine()!!.toDouble()

    println("NUMBER = " + number)
    println("SALARY = U$ " + "%.2f".format(hours *  moneyHour))
}
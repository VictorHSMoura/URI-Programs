import java.util.*

const val array_size = 7

fun main(args: Array<String>) {
    val values: IntArray = intArrayOf(100, 50, 20, 10, 5, 2, 1)
    var money = readLine()!!.toInt()
    var money_quantity = IntArray(array_size)

    println(money)
    for(i in 0 until array_size) {
        money_quantity[i] = money/values[i]
        money = money%values[i]
    }
    for(i in 0 until array_size) {
        println(money_quantity[i].toString() + " nota(s) de R$ " + values[i].toString() + ",00")
    }
}
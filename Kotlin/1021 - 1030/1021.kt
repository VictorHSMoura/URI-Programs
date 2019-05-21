import java.util.*
import kotlin.math.roundToInt

const val array_size = 12
const val notes = 6

fun main (args: Array<String>) {
    val noteValues = intArrayOf(100, 50, 20, 10, 5, 2)
    val coinValues = intArrayOf(100, 50, 25, 10, 5, 1)
    var money = readLine()!!.toDouble()
    var moneyQuantity = IntArray(array_size)

    for (i in 0 until notes) {
        moneyQuantity[i] =  money.toInt()/noteValues[i]
        money %= noteValues[i]
    }

    money *= 100
    money = money.roundToInt().toDouble()   //correcting floating point errors
    for (i in 0 until (array_size - notes)){
        moneyQuantity[i + notes] =  money.toInt()/coinValues[i]
        money %= coinValues[i]
    }

    println("NOTAS:")
    for (i in 0 until array_size) {
        if(i == notes)
            println("MOEDAS:")
        if (i < notes)
            println(moneyQuantity[i].toString() + " nota(s) de R$ " + "%.2f".format(noteValues[i].toFloat()))
        else
            println(moneyQuantity[i].toString() + " moeda(s) de R$ " + "%.2f".format(coinValues[i-notes]/100.0))
    }
}
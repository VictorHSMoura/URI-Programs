import java.util.*

/*
val -> variable initialized only single time. Immutable
var -> variable that can be assigned multiple times
 */

fun main(args: Array<String>) {
    var unit:Int
    var price:Float; var total = 0.0
    for(i in 0 until 2) {
        var input = readLine()!!.split(' ')
        unit = input[1].toInt()
        price = input[2].toFloat()
        total += unit * price
    }
    println("VALOR A PAGAR: R$ " + "%.2f".format(total))
}
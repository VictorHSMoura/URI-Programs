import java.util.*

fun main(args: Array<String>) {
    val eventSec = readLine()!!.toInt()
    val hours = eventSec/3600
    val minutes = (eventSec%3600)/60
    val seconds = eventSec%60
    println("%d:%d:%d".format(hours, minutes, seconds))
}
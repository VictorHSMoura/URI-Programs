import java.util.*

const val arrSize = 4

fun main(args: Array<String>) {
    val arr = IntArray(arrSize)
    for(i in 0 until arrSize) {
        arr[i] = readLine()!!.toInt()
    }
    println("DIFERENCA = " + (arr[0]*arr[1] - arr[2]*arr[3]))
}
import java.util.*

//const val pi = 3.14159

fun main (args: Array<String>) {
    val (A, B, C) = readLine()!!.split(' ').map(String::toDouble)

    println("TRIANGULO: " + "%.3f".format( (A * C)/2))
    println("CIRCULO: " + "%.3f".format(pi * C * C))
    println("TRAPEZIO: " + "%.3f".format(((A + B) *  C)/2))
    println("QUADRADO: " + "%.3f".format(B * B))
    println("RETANGULO: " + "%.3f".format((A * B)))
}
import java.util.*

fun main (args: Array<String>) {
    val (A, B, C) = readLine()!!.split(' ').map(String::toInt)
    if (A >=  B && A >= C) print(A)
    else if (B >= A && B >= C) print(B)
    else print(C)
    println(" eh o maior")
}

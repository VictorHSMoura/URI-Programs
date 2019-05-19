import java.util.*

fun main(args: Array<String>) {
    val ageInDays = readLine()!!.toInt()
    val years = ageInDays/365
    val months = (ageInDays%365)/30
    val days = ageInDays%365%30
    println("%d ano(s)\n%d mes(es)\n%d dia(s)".format(years, months, days))
}
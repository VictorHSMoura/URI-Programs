import java.util.*

fun main (args: Array<String>) {
    val n = readLine()!!.toInt()
    var str: String
    var encrypt: String

    for (i in 0 until n) {
        str = readLine()!!
        encrypt = ""

        for (c in str) {
            encrypt += if (c.isLetter())
                    (c.toInt() + 3).toChar()
            else
                c
        }

        encrypt = encrypt.reversed()
        str = ""

        for (j in 0 until encrypt.length) {
            str += if (/*encrypt[j].isLetter() && */j >= (encrypt.length)/2)
                (encrypt[j].toInt() - 1).toChar()
            else
                encrypt[j]
        }

        println(str)
    }
}
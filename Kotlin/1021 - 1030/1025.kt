import java.util.*


//Still working on that. Runtime Error
fun partition (a: IntArray, esq: Int, dir: Int): Int {
    var i = esq; var j = dir;
    var pivot = a[(i + j)/2]; /* obtem o pivo x */
    var aux: Int
    do {
        while (pivot > a[i]) i++
        while (pivot < a[j]) j--
        if (i <= j) {
            aux = a[i]; a[i] = a[j]; a[j] = aux;
            i++; j--
        }
    } while (i <= j)
    return i
}

fun quickSort(a: IntArray, esq: Int, dir: Int) {
    var index = partition(a, esq, dir)

    if (esq < index - 1) quickSort(a, esq, index-1);
    if (index < dir) quickSort(a, index, dir);
}

fun main (args: Array<String>) {
    var n: Int; var q: Int
    var count = 1; var verify: Int
    var input: List<String>
    var numbers: IntArray
    var queries: IntArray

    do {
        input = readLine()!!.split(' ')
        n = input[0].toInt(); q = input[1].toInt()
        numbers = IntArray(n)
        queries = IntArray(q)

        if (n != 0 || q != 0) {
            for (i in 0 until n)
                numbers.set(i, readLine()!!.toInt())
            for (i in 0 until q)
                queries.set(i, readLine()!!.toInt())

            quickSort(numbers, 0, numbers.size - 1)

            println("CASE# " + count + ":")
            for (i in 0 until q) {
                verify = 0
                for (j in 0 until n) {
                    if (queries[i] == numbers[j]) {
                        println(queries[i].toString() + " found at " + (j + 1))
                        verify = 1
                        break
                    }
                }
                if (verify == 0)
                    println(queries[i].toString() + " not found")
            }
            count++
        }
    }while (n != 0 && q != 0)
}
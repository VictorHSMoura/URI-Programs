import java.util.*


//Still working on that. Runtime Error
fun partition (a: MutableList<Int>, esq: Int, dir: Int): Pair<MutableList<Int>, Pair<Int, Int>> {
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
    return Pair(a, Pair(i, j))
}

fun quickSort(a: MutableList<Int>, esq: Int, dir: Int): MutableList<Int> {
    var part = partition(a, esq, dir); var newA = part.first
    var i = part.second.first; var j = part.second.second

    if (esq < j) newA = quickSort(newA, j, esq);
    if (i < dir) newA = quickSort(newA, i, dir);

    return newA
}

fun main (args: Array<String>) {
    var n: Int; var q: Int
    var count = 1; var verify: Int
    var input: List<String>
    var numbers: MutableList<Int> = mutableListOf<Int>()
    var queries: MutableList<Int> = mutableListOf<Int>()

    do {
        input = readLine()!!.split(' ')
        n = input[0].toInt(); q = input[1].toInt()
        if (n != 0 || q != 0) {
            for (i in 0 until n)
                numbers.add(readLine()!!.toInt())
            for (i in 0 until q)
                queries.add(readLine()!!.toInt())

            numbers = quickSort(numbers, 0, numbers.size - 1)

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

            numbers = mutableListOf<Int>()
            queries = mutableListOf<Int>()
        }
    }while (n != 0 && q != 0)
}
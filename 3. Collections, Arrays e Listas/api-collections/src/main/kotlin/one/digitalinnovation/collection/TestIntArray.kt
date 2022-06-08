package one.digitalinnovation.collection

fun main() {
    val values = IntArray(5)
    values[0] = 1
    values[1] = 7
    values[2] = 6
    values[3] = 3
    values[4] = 2

    for (v in values) {
        println(v)
    }

    println("================================")

    values.forEach {valor ->
        println(valor)
    }

    println("================================")

    for (va in values.indices) {
        println(values[va])
    }

    println("================================")

    values.sort()
    for (v in values) {
        println(v)
    }

}
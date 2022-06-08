package one.digitalinnovation.collection

fun main() {
    val values = intArrayOf(2, 3, 5, 10, 3)

    values.forEach {
        println(it)
    }

    values.sort()
    values.forEach {
        println(it)
    }
}
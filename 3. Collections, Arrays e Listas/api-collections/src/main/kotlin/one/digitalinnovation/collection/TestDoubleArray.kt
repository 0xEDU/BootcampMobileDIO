package one.digitalinnovation.collection

fun main() {
    val wages = DoubleArray(3)
    wages[0] = 1000.0
    wages[1] = 2000.0
    wages[2] = 950.0


    wages.forEach { println(it) }
    println("---------------------------")

    wages.forEachIndexed { index, wage ->
        wages[index] = wage * 1.1
    }

    wages.forEach { println(it) }

    println("---------------------------")
    val wages2 = doubleArrayOf(1000.0, 2000.0, 1350.40)
    wages2.sort()
    wages2.forEach { println(it)}
}
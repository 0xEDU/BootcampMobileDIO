package one.digitalinnovation.collection

fun main() {
    val wages = doubleArrayOf(1000.0, 7050.0, 2350.46)

    for (wage in wages) {
        println(wage)
    }
    println("---------------------")
    println("Maior salário: ${wages.maxOrNull()}")
    println("Menor salário: ${wages.minOrNull()}")
    println("Média salarial: ${wages.average()}")

    val great = wages.filter { it > 2500 }
    great.forEach{println(it)}

    println("---------------------")
    println(wages.count{it in 1000.0..8000.00 })

    println("---------------------")
    println(wages.find {it == 1000.0})
    println(wages.find {it == 7050.0})

    println("---------------------")
    println(wages.any {it == 1000.0})
    println(wages.any {it == 2350.46})
}
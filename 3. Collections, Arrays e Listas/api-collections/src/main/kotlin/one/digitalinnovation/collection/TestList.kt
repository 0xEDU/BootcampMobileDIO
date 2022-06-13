package one.digitalinnovation.collection

fun main() {
    val john = employee("john", 10000.00, "CLT")
    val joe = employee("joe", 3000.00, "PJ")
    val ana= employee("ana", 7200.00, "CLT")

    val employees = listOf(john, joe, ana)

    employees.forEach { println(it) }

    println("----------------------")
    employees
        .sortedBy { it.wage }
        .forEach { println(it) }

    println("----------------------")
    employees
        .groupBy { it.type }
        .forEach {println(it)}
}

data class employee(
    val name: String,
    val wage: Double,
    val type: String
) {
    override fun toString(): String =
        """
            Name:      $name
            Wage:      $wage
        """.trimIndent()
}
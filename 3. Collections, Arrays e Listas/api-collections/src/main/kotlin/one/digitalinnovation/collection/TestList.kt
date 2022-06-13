package one.digitalinnovation.collection

fun main() {
    val john = employee("john", 2000.00)
    val joe = employee("joe", 3000.00)
    val ana= employee("ana", 7000.00)

    val employees = listOf(john, joe, ana)

    employees.forEach { println(it) }
}

data class employee(
    val name: String,
    val wage: Double
) {
    override fun toString(): String =
        """
            Name:      $name
            Wage:      $wage
        """.trimIndent()
}
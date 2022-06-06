abstract class Staff(
    name:String,
    id:String,
    val wage:Double
) : Human(name, id) {
    protected abstract fun calcBenefits(): Double

    override fun toString(): String = """
        Name: $name
        ID: $id
        Wage: $wage
        Benefits: ${calcBenefits()}
    """.trimIndent()
}
class Manager(
    name: String,
    id: String,
    wage: Double,
    val pass: String
) : Staff(name, id, wage), Logable {
    override fun calcBenefits(): Double = wage * 0.4
    override fun login(): Boolean = "password123" == pass
}
class Manager(
    name: String,
    id: String,
    wage: Double
) : Staff(name, id, wage) {
    override fun calcBenefits(): Double = wage * 0.4
}
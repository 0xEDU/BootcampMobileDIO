class Analyst(
    name: String,
    id: String,
    wage: Double
) : Staff(name, id, wage) {
    override fun calcBenefits() = wage * 0.1
}
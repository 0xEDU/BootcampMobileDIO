import java.math.BigDecimal

abstract class Staff(
    name:String,
    id:String,
    val wage:BigDecimal
) : Human(name, id) {
    abstract fun calcBenefits()
}
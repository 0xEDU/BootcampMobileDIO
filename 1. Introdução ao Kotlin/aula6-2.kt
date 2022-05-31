// 'In' and 'range' operators
// Contain: (In)
// Doesn't contain: !(In)
// Range: (Int..Int)

const val MIN_AGE = 16
const val MAX_AGE = 68
// Main function
fun main(){
    var age = (18..100).random()
    println(age)
    println(age in MIN_AGE..MAX_AGE)
    println(age >= MIN_AGE && age <= MAX_AGE)
}

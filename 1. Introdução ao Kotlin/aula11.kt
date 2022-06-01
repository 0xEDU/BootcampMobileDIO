// Single-line function
// Defined as fun functionName(name:Type) = return
// Literally, a one line function.

// Main function
fun main() {
}

// Single-line function
private fun getFullName(name:String, lastName:String) = "$name $lastName"

// Extension function
// Defined as fun Type.functionName()
// Can only be called by a specific type, which can be
// referenced using 'this' operator

// Extension function
fun String.randomCapitalizedLetter() =
    this[(0..this.length-1).random()].toUpperCase()

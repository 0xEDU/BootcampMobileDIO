// Variable declaration

// var = mutable value, camelCase
// val = immutable value, camelCase
// const val = immutable value, SNAKE_CASE

// 'const val' is outside of the main function
const val MAX_AGE = 68

// Main function
fun main() {
    val minAge = 16
    
    var currentAge = 38
    currentAge = 58
    
    
    println(minAge)
    println(currentAge)
    println(MAX_AGE)
}

// Differnce between 'val' and 'const': 'const' is define during compile time,
// meaning that their value has to be assigned during compile time, unlike
// 'val', which is defined during runtime.
// 
// This means that 'const' can never be assigned to a function or any class
// constructor, but only for a 'string' or primitive.
//
// Examlpe:
// const val foo = complexFunctionCall() <- Not okay
// val fooVal = complexFunctionCall() <- Okay
//
// const val bar = "Hello World" <- Also okay


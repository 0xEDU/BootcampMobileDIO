// String manipulation
// Treated as a Char array

// Formatting
// Alternate between caps and no caps: capitalize(),
// toUpperCase(), toLowerCase() and decapitalize()
// 
// Remove spaces: trimEnd(), trimStart(), trim()
//
// Replace: replace(x,y)
// 
// Formatting: "pattern ${value}".format(value)

// Main function
fun main() {
    val s = "Hello"
    val name = "edu"
    
    println(s + name)
    // Out: HelloEdu
    
    println("${s}, ${name.capitalize()}!")
    // Out: Hello, Edu!   
}

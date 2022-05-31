// Preventing some errors

// Main function
fun main() {
   // Error 1: 
   // var currentAge
   // currentAge = 22
   // A variable can't be declared without a type and attribution.
   var currentAge:Int
   currentAge = 58
    
   println(currentAge)

   // Error 2:
   // var currentYear = "what a year"
   // currentYear = 2021
   // A variable with type inference will only receive values
   // from it's first type.
   var currentYear = "what a year"
   currentYear = 2021.toString()
   
   println(currentYear)
}

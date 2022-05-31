// Difference between Empty and Blank
// If s.lenght = 0, the string is empty and Blank.
// If s.lenght > 0 but no character is visible, the string
// is blank but not empty.


fun main() {
   val s = ""
   println(s.isEmpty())
   // true
   println(s.isBlank())
   // true
   println(s.isNullOrBlank() || s.isNullOrEmpty())
   // true
   
   val d = "    "
   println(d.isEmpty())
   // false
   println(d.isBlank())
   // true
}

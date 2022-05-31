// Comparison operators
// Greater than/Less than: a > b, a < b | a.compareTo(b) > 0, or a.compareTo(b) < 0
// Greater than/Less than (Equal): a >= b, a <= b | a.compareTo(b) >= 0, or a.compareTo(b) <=0
// Equal: a == b | a.equals(b)
// Different: a != b | !(a.equals(b))

const val EQUAL = 0
const val LESS = -1
const val MORE = 1

// Main function
fun main() {
   val d = 22
   val t = 90
    
   println(d > t)
   // println(d.compareTo(t) == MORE/LESS/EQUAL)
   println(d.equals(t))
}

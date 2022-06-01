// Higher Order Functions
// Receive a function as argument and return a function.

// Main function
fun main() {
	val z:Int
    
    z = calculate(34, 25){a,b -> 
    println("Calculating $a + $b")
    a + b
    }
    println(z)
}

// Higher order function
fun calculate(n1:Int,n2:Int,operation:(Int,Int)->Int) = operation(n1,n2)

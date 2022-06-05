// 1. Creating a class.
// 2. Using 'private set'.
// 3. Using constructor() and creating a function to concatenate
// name and cpf.

// Class defining a human
class Human{
	var name:String = "Edu"

	var cpf:String = "123.132.123-12"	
	private set

	constructor()

	fun humanInfo() = "$name e $cpf"
}

// Main function
fun main() {
	val edu = Human()

	println(edu.humanInfo())
}
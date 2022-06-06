data class Bank(
	val name:String,
	val number:Int
){
	fun info() = "$name - $number"
}
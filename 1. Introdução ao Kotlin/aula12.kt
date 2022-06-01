// Control Structures
// if/else, when, elvis operator

fun main() {
   if(expression1){
       // Code
   }else if (expression2){
       // Code
   }else{
       // Code
   }
   
   when{
       case1 -> {}
       case2 -> {}
       case3 -> {}
       else -> {}
   }
   
   // "if b is not null, use it, otherwise use some non-null value
   val a:Int? = null
   var number = a ?: 0
}

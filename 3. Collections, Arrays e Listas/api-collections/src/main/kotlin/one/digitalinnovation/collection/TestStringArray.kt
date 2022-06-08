package one.digitalinnovation.collection

fun main() {
    val names = Array(4) {""}
    names[0] = "joe"
    names[1] = "john"
    names[2] = "amy"
    names[3] = "ana"

    for (n in names) {
        println(n)
    }

    println("****************")

    names.sort()
    names.forEach {
        println(it)
    }

    println("****************")

    val names2 = arrayOf("ana", "steve", "mary", "bruno")
    names2.sort()
    names2.forEach {
        println(it)
    }
}
package tests

import ClientType

fun main() {
    ClientType.values().forEach {element ->
        println("${element.name} - ${element.description}")
    }
}
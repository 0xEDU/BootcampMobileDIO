package tests

import Manager

fun main() {
    val maria = Manager("maria do carmo", "98765432100",5000.0, "password123")

    PrintReport.printR(maria)

    AuthTest().auth(maria)
}
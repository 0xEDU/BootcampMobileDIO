package tests

import Client
import ClientType

fun main() {
    val john = Client(
        name = "John Doe",
        id = "123.123.123-45",
        clientType = ClientType.PF,
        pass = "1234567"
    )

    println(john)

    AuthTest().auth(john)
}
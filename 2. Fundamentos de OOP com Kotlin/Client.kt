class Client(
    name: String,
    id: String,
    val clientType: ClientType,
    val pass: String
) : Human(name, id), Logable {
    override fun login(): Boolean = "1234567" == pass

    override fun toString(): String = """
        Name:       $name
        ID:         $id
        Type:       ${clientType.description}
    """.trimIndent()
}
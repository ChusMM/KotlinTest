


fun main(args: Array<String>) {
    val str: String = "Hello World!"
    val age = 32
    println(str)
    println("My age is: " + age)

    println(0b11111111 == 0xFF)

    println(0b11111111_00000000_00000000 == 0xFF0000)

    val nameAges = mutableMapOf(Pair("Peter", 24), Pair("John", 30))
    val namesAges2 = mapOf(
            "Me" to 33,
            "You" to 31
    )

    println(nameAges.keys)
    println(nameAges.values)
    println(nameAges.entries)

    nameAges.putIfAbsent("Me", 33)
    nameAges.getOrDefault("Me", 0)

    nameAges.entries.forEach {
        println("${it.key} is ${it.value} years old")
    }

}
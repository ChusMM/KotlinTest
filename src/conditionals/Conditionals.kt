package conditionals

fun main(args: Array<String>) {
    val age = 21

    if (age <= 10) {
        println("not allowed")
    } else if (age in 11..14) {
        println("we'll see")
    } else {
        println("allowed")
    }

    val mode: Int = 2

    val result = when (mode) {
        1 -> "mode 1"
        2 -> {
            println("Ok")
            "mode 2"
        }
        3 -> "mode 3"
        else -> "other"
    }

    println(result)

    val x = if (mode < 2) {
        println("less than 2")
        mode * 2
    } else {
        println("more than 2")
        mode * 3
    }

    val i = 0
    when (i) {
        //is Long -> println("Is long")
        5 -> println("5")
        3*12 -> println("36")
        "Hey There".length -> println("hey there")
        in 1..10 -> println("1..10")
        in 1..9 -> println("1..9")
        !in 1..10 -> println(" not in 1..10")
    }
}


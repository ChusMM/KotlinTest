package conditionals

fun main(args: Array<String>) {
    val age: Int = 21

    if (age <= 10) {
        println("not allowed")
    } else if (age > 10 && age < 15) {
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
}


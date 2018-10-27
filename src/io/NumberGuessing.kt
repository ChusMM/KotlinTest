package io

import java.util.Random

fun main(args: Array<String>) {
    val number = Random().nextInt(100) + 1
    var input: String?
    var guess = -1

    while (guess != number) {
        print("Guess between 1 - 100")
        input = readLine()

        if (input != null) {
            // can throw
            guess = input.toInt()
        }
    }
}
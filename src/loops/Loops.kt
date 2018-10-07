package loops

fun main(args: Array<String>) {

    val sum = (1..10).sum()
    println(sum)

    for (i in 1..10) {
        println(i)
    }

    val list = listOf("Java", "C++", "Kotlin")
    for (element in list) {
        println(element)
    }

    for ((index, value) in list.withIndex()) {
        println("Element at $index is $value")
    }

    var x = 9
    while (x >= 0) {
        println(x)
        x--
    }
    var i = 0
    while (i <= 10) {
        println(i)
        i++
    }

    for (char in "Use this") {
        println(char)
    }

    for (c in "Phyton") {
        if (c == 'o') {
            break
        }
    }

    outer@ for (k in 1..10) {
        for (j in 1..10) {
            if (k - j == 5) {
                break@outer
            }
            println("$k - $j")
        }
    }
}
package functions

import java.util.Date

fun helloWorld() {
    println("Hello world")
}

fun main(args: Array<String>) {
    helloWorld()
    println(max(1, 2))
}

fun getCurrentDate(): Date {
    return Date()
}

fun max(a: Int, b: Int): Int {
    return if (a >= b) {
        a
    } else {
        b
    }
}

fun reverse(list: List<Int>): List<Int> {
    val result = arrayListOf<Int>()
    for (i in 0 until list.size) {
        val toAppend = list.get((list.size -1) - i)
        result.add(toAppend)
    }
    return result
}

fun reverse2(list: List<Int>): List<Int> {
    val result = arrayListOf<Int>()
    for (i in list.size - 1 downTo 0) {
        val toAppend = list.get(i)
        result.add(toAppend)
    }
    return result
}
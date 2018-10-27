package objectoriented

import java.lang.Exception

//vararg -> Lista de parámetros
class Stack<T>(vararg items: T) {
    private val elements = items.toMutableList()

    fun push(element: T) {
        elements.add(element)
    }

    fun pop(): T {
        if (this.isEmpty()) {
            return elements.removeAt(elements.size - 1)
        } else {
            throw EmptyStackException()
        }
    }

    private fun isEmpty(): Boolean {
        return elements.isEmpty()
    }
}

fun <T>stackOf(vararg elemets: T): Stack<T> {
    // elements es un array en runtime
    // * convierte de array a vararg en runtime
    return Stack(*elemets)
}

class EmptyStackException : Exception("Stack is empty")

fun main(args: Array<String>) {
    val intStack = Stack(1, 2, 3, 4, 5, 6)

    intStack.push(7)

    println(intStack.pop())
}

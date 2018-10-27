package objectoriented

open class Animal {
    var age: Int = 0
        get() {
            field ++
            return field
        }
        set(value) {
            if (value >= 0) {
                field = value
            }
        }

    private var legs: Int = 2

    // Cualquier clase de un módulo externo que herede tiene acceso
    protected var name = "Sam"

    // Cualquier clase de un módulo externo que herede NO tiene acceso
    internal val isDangerous = true
}

class Vertebrate: Animal() {
    fun introduceYourself() {
       println(this.name)
    }
}

fun main(args: Array<String>) {
    val animal = Animal()
    animal.age = 8
    println(animal.age)
}
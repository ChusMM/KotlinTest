package objectoriented

import java.util.Date

class Person(name: String, age: Int) {
    var name: String = "Sarah"
    var age: Int = 33

    init {
        this.name = name
        this.age = age
        println("Object created")
    }

    fun speak() {
        println("Hello today is ${Date()}")
    }

    fun getYearOfBirth() = 2018 - this.age
}

abstract class Person2(open val name: String, open var age: Int) {

    init {
        println("Object created")
    }

    abstract fun speak()

    fun getYearOfBirth() = 2018 - this.age
}

class House(val height: Double = 80.0, val color: String) {

    override fun toString(): String {
        return "House: [${this.height}, ${this.color}]"
    }
}

class Student(override val name: String, override var age: Int, val studentId: Long): Person2(name, age) {
    override fun speak() {
        println("Im a student, my id is ${this.studentId}!")
    }

    fun getGrade(): Int {
        return super.age * 2
    }
}

interface Driveable {
    val maxSpeed: Int
    fun drive() {
        println("Driving default")
    }
}

class Car(val color: String, override val maxSpeed: Int = 200): Driveable {
    override fun drive() {
        println("Driving...")
    }

}

fun main(args: Array<String>) {
    val person = Person("Chus,", 33)
    println("${person.age}, ${person.name}. Born in ${person.getYearOfBirth()}")

    val house = House(100.0, "blue")
    val home = House(color = "red", height = 120.0)

    println("$house,  $home")

    val default = House(color = "GREEN")
    println(default)

    val student = Student("yo", 32, 123456)
    student.getGrade()

    val myCar:Driveable = Car("blue")
    println(myCar.drive())
}
package objectoriented

abstract class Course(val topic: String, val price: Double) {
    open fun learn() {
        println("learning a $topic course")
    }
}

interface Learnable {
    fun learn() {
        println("learning")
    }
}

open class KotlinCourse : Course("Kotlin", 99.99) {
    // final implementation, can not be override
    override final fun learn() {
        super.learn() // Calling super class
        println("learning kotlin")
    }
}

open class KotlinCourse2 : Course("Kotlin", 99.99), Learnable {
    override final fun learn() {
        super<Learnable>.learn() // Calling interface implementation
        super<Course>.learn() // Calling superclass implementation
        println("learning kotlin2")
    }
}



fun main(args: Array<String>) {
    val course = KotlinCourse()
    course.learn()
}
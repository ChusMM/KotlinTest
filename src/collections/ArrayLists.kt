package collections

fun main(args: Array<String>) {
    val array = arrayOf("A", "B", "C")

    val list = listOf("X", "Y", "Z") // Inmutable

    val str = "hola"
    println(str[0])

    val states = arrayOf("Fl", "Ca")
    val allToghether = array + states
    print(allToghether)

    val nums = intArrayOf(1, 2, 3)
    val empty = nums.isEmpty()
    println(empty)


    if (states.contains("Ny")) {
        println("New york")
    } else {
        println("Not new york")
    }


    val arrayList = arrayListOf("P", "Q", "R")
    arrayList.add("Pollas")
    println(arrayList[0])

    val myList = arrayListOf("S")
    println(arrayList + myList)

    arrayList.add(1, "xxxx")
    val removed = arrayList.remove("Pollas")
    println(arrayList)
    println(removed) // true

    val subList = arrayList.subList(1, 3)
    println(subList)
}
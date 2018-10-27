package objectoriented

class Book(val title: String, val author: String, var price: Double) {
}

data class DataBook(val title: String, val author: String, var price: Double) {
    fun print() {
        println("Hi!")
    }
}

fun main(args: Array<String>) {
    val book = Book("book", "me", 288.88)
    val book2 = Book("book", "me", 288.88)

    val dataBook = DataBook("book", "me", 288.88)
    val dataBook2 = DataBook("book", "me", 288.88)

    println(book)
    println(dataBook)

    println(book.equals(book2))
    println(dataBook.equals(dataBook2))

    val dataBook3 = dataBook.copy(author = "you", price = 99.99)
    println(dataBook3)

    val (title, author, price) = dataBook
    println(title + author + price)

    val set = hashSetOf(dataBook, dataBook2, dataBook3)
    println(set)
}
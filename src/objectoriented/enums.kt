package objectoriented

enum class Color(val desc: String) {
    RED("Red"),
    GREEN("Green"),
    BLUE("Blue");

    override fun toString(): String {
        return this.desc
    }
}
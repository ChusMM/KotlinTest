package objectoriented

enum class Color(val desc: String) {
    RED("Red"),
    GREEN("Green"),
    BLUE("Blue");

    override fun toString(): String {
        return this.desc
    }
}

enum class ColorHex(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF);

    fun containsRed(): Boolean {
        return this.rgb and 0xFF0000 != 0
    }
}
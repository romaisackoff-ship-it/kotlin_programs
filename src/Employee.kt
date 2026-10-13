abstract class Employee(val name: String) {
    abstract fun salary(): Double
    fun info(): String = "$name: ${salary()}"


}
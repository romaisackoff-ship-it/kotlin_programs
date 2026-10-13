class Manager(name: String, val bonus: Double) : Employee(name) {
    override fun salary(): Double = 100000.0 + bonus
}

class Developer(name: String, val rate: Double, val hours: Int) : Employee(name) {
    override fun salary(): Double = rate * hours
}
fun main() {
    val employees: List<Employee> = listOf(
        Manager("Иван", 50000.0),
        Developer("Петя", 1000.0, 160)
    )
    for (e in employees) {
        println(e.info())
    }



    val animal: List<Animal> = listOf(Dog(),Cat(),Cow())

    for (animal in animal) {
        println("${animal.name()}: ${animal.sound()}")
    }








}














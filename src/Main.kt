data class User(val name: String, val age: Int)

val users = listOf(
    User("Иван", 25), User("Пётр", 17), User("Анна", 22),
    User("Олег", 16), User("Маша", 30)
)

val numbers = listOf(1, 2, 3, 4, 5)
val names = listOf("иван", "пётр", "анна")
val bigNumbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

fun main() {

    println(numbers.any { it > 3 })
    println(numbers.all { it % 2 == 0 })
    println(numbers.none { it == 10 })
    println(numbers.all { it <= 100 })
    println(numbers.any { it % 2 == 0 })
    println(numbers.none { it > 5 })

    println(users.any { it.age >= 18 })
    println(users.all { it.age >= 15 })
    println(users.any { it.name == "Анна" })
    println(users.none { it.age >= 40 })
    println(users.all { it.name.length >= 3 })

    println(names.any { it.length > 4 })
    println(names.all { it.first().isLowerCase() })
    println(names.any { it.first() == 'а' })
    println(names.none { it.isEmpty() })

    println(bigNumbers.any { it % 2 == 0 && it > 5 })
    println(bigNumbers.all { it % 1 == 0 })
    println(bigNumbers.none { it <= 0 })
}
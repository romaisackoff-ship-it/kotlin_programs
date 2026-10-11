data class User(val name: String, val age: Int)

val users = listOf(
    User("Иван", 25),
    User("Пётр", 17),
    User("Анна", 22),
    User("Олег", 16),
    User("Маша", 30)
)

fun main() {

    taskOne()
    taskTwo()
    taskFreeAndFourAndFive()
    taskSix()
}

fun taskOne() {
    val list = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val chetni = list.filter { it % 2 == 0 }.map { it * 2 }

    println(chetni)
}

fun taskTwo() {
    val list = listOf("1", "abc", "3", "xyz", "5", "10")
    val valid = list.mapNotNull { it.toIntOrNull() }
    println(valid)
}

fun taskFreeAndFourAndFive() {

    val sover = users.groupBy { users -> users.age >= 18 }
    println(sover)

    val (soxer, notsoxer) = users.partition { users -> users.age >= 18 }
    println(soxer)
    println(notsoxer)


    val byName = users.associateBy { it.name }

    val anna = byName["Анна"]
    println(anna)

}

fun taskSix() {
    val age = users.sortedBy { it.age }

    println(age)

}












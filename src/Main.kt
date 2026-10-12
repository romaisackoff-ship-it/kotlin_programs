val task_one = listOf(3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5)
val task_three = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
val task_four = listOf(5, 2, 8, 1, 9, 3)

data class User(val name: String, val age: Int)

val users = listOf(
    User("Иван", 25), User("Пётр", 17),
    User("Анна", 22), User("Олег", 16),
    User("Маша", 30)
)
fun main() {
    val one = task_one.sum()
    val two = task_one.count()
    val three = task_one.average()
    val wour = task_one.minOrNull()
    val five = task_one.maxOrNull()
    val six = task_one.count { it > 3 }

    val task2_1 = users.count { it.age > 18 }
    val task2_2 = users.sumOf { it.age }
    val task2_3 = users.map { it.age }.average()
    val task2_4 = users.minByOrNull { it.age }
    val task2_5 = users.maxByOrNull { it.age }

    val task3_1 = task_three.firstOrNull {it > 5}
    val task3_2 = task_three.firstOrNull {it > 100}
    val task3_3 = task_three.lastOrNull {it % 2 == 0}
    val task3_4 = task_three.firstOrNull() {it % 3 == 0}

    val task3_5 = users.firstOrNull {it.age > 18}
    val task3_6 = users.firstOrNull  {it.name == "Олег"}
    val task3_7 = users.lastOrNull  {it.age < 18}
    val task3_8 = users.firstOrNull  {it.name == "Вася"}

    val task4_1 = users.sortedBy { it.age }
    val task4_2 = users.sortedByDescending { it.age }
    val task4_3 = users.sortedBy { it.name }
    val task4_4 = users.sortedBy { it.name.length }

    val task4_5 = task_four.sorted()
    val task4_6 = task_four.sortedDescending()

    val task5 = users.filter{ it.age >= 18}.maxByOrNull { it.age }?.name


}














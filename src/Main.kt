fun printReport(users: List<User>) {
    println("=== ОТЧЁТ ===")
    println()

    println("Всего пользователей: ${totalCount(users)}")

    val avg = averageAge(users)
    val rounded = (avg * 10).toInt() / 10.0
    println("Средний возраст: $rounded")

    val oldestUser = oldest(users)
    if (oldestUser != null) {
        println("Самый старший: ${oldestUser.name} (${oldestUser.age})")
    }

    val youngestUser = youngest(users)
    if (youngestUser != null) {
        println("Самый младший: ${youngestUser.name} (${youngestUser.age})")
    }

    println()
    println("По городам:")
    val cityMap = byCity(users)
    for (entry in cityMap) {
        println("  ${entry.key}: ${entry.value.size}")
    }

    println()
    println("Совершеннолетних: ${adults(users).size}")
    println("Несовершеннолетних: ${minors(users).size}")

    println()
    println("Совершеннолетние:")
    for (user in adults(users)) {
        println("  ${user.name} (${user.age}, ${user.city})")
    }
}
fun totalCount(users: List<User>): Int =
    users.size

fun averageAge(users: List<User>): Double =
    users.map { it.age }.average()

fun oldest(users: List<User>): User? =
    users.maxByOrNull { it.age }

fun youngest(users: List<User>): User? =
    users.minByOrNull { it.age }

fun byCity(users: List<User>): Map<String, List<User>> =
    users.groupBy { it.city }

fun adults(users: List<User>): List<User> =
    users.filter { it.age >= 18 }

fun minors(users: List<User>): List<User> =
    users.filter { it.age < 18 }

fun main() {
    val users = parseCSV(csvData)
    printReport(users)


}















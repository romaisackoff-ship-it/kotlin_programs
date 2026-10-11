fun main() {
    println(describe(null))
    println(describe(""))
    println(describe("ку"))

    val inputs = listOf("42", null, "abc", " 7 ", "100")
    for (input in inputs) {
        val n = parseIntOrNull(input?.trim()) ?: 0
        println("'$input' -> $n")
    }
    val raw = listOf("Иван", null, "Анна", "", "Пётр", null)
    val name = raw.filterNotNull()
    println(name)

    val nonEmpty = raw.filterNotNull().filter { it.isNotEmpty() }
    println(nonEmpty)

    val nullCount = raw.count { it == null }
    println(nullCount)

    println(findGame(null))         // Ты ничего не ввёл
    println(findGame("   "))        // Пустой ввод
    println(findGame("GTA6"))       // Ты выбрал GTA6
    println(findGame("  CS2  "))    // Ты выбрал CS2
    println(findGame("Mario"))


}


fun describe(value: String?): String = when (value) {
    null -> "пусто"
    "" -> "Пустая строка"
    else -> "строка длиной ${value.length}"
}
fun parseIntOrNull(s: String?): Int? = s?.toIntOrNull()

fun findGame(name: String?): String {
    val videogameslist = listOf("GTA6", "Roblix", "CS2", "Fortnite", "Metro2033")
    val trimmed = name?.trim() ?: return "Ты ничего не ввёл"
    return when {
        trimmed.isEmpty() -> "Пустой ввод"
        trimmed in videogameslist -> "Ты выбрал $trimmed"
        else -> "Игры '$trimmed' нет в списке"
    }
}










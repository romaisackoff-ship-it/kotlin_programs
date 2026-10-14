val csvData = """
    name,age,city
    Иван,25,Москва
    Пётр,17,Питер
    Анна,22,Москва
    Олег,16,Питер
    Маша,30,Москва
    Коля,19,Казань
    Света,28,Питер
""".trimIndent()


data class User(val name: String, val age: Int, val city: String)

fun parseCSV(data: String): List<User> =
    data.lines().drop(1)
        .mapNotNull { line ->
            val parts = line.split(",")
            val name = parts.getOrNull(0)?.trim() ?: return@mapNotNull null
            val age = parts.getOrNull(1)?.trim()?.toIntOrNull() ?: return@mapNotNull null
            val city = parts.getOrNull(2)?.trim() ?: return@mapNotNull null
            User(name, age, city)

        }






fun main() {
    val name: String? = "иван"
    name?.let { println(it.uppercase()) }

    val number = "42".let { it.toInt() * 2 }

    println(number)

    data class User(
        var name2: String = "",
        var age: Int = 0
    )

    val use = User().apply {
        name2 = "Иван"
        age = 25
    }

    val list = listOf(1, 2, 3, 4, 5)
        .also { println("Исходный: $it") }
        .filter { it % 2 == 0 }
        .also { println("Чётные: $it") }
        .map { it * 10 }

    println("Результат: $list")
    run {
        val sum = (1..100).sum()
        println(sum)
    }

    val bulder = with(StringBuilder()) {
        append("Привет, ")
        append("мир!")
        append(" Как дела?")
    }
    println(bulder)

    val input: String? = null

    input?.let {
        println("Ввод: $input")
    } ?: run {
        println("Ничего не введено")
    }


}










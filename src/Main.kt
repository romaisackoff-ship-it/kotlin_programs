val videogameslist = listOf("GTA6", "Roblix", "CS2", "Fortnite", "Metro2033")
val ListUseGames = mutableListOf<String>()

fun showMenu() {

    println("Выбери игру из списка:")
    println(videogameslist)
    println("И напиши название:")

}

fun whatGamesUsePiopleFun(name: String): String = when {
    name in videogameslist -> "ты выбрал $name"
    else -> "Нет такой игры"
}

fun main() {
    showMenu()
    val howGames = readln()

    println(whatGamesUsePiopleFun(howGames))
    ListUseGames.add(howGames)

    println("Хочешь выбрать что-то ещё?")

    val answer = readln().lowercase()

    if (answer == "да" || answer == "yes" || answer == "y") {

        showMenu()
        val howGames2 = readln()
        println(whatGamesUsePiopleFun(howGames2))
        ListUseGames.add(howGames2)

        println("Щас у тебя в библиотеке:")
        println(ListUseGames)


    }
}



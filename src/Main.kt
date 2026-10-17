const val MAX_AGE = 150
val list = listOf("иван", "пётр", "анна")
fun main() {

    for (i in 1..10) {
        println(i)
    }
    for (i in 1 until 10) {
        println(i)
    }
    for (i in 10 downTo 1) {
        println(i)
    }
    for (i in 2..20 step 2) {
        println(i)
    }
    var o = 0
    while (o < 5) {
        println(o)
        o++

    }
    repeat(3) {
        println("Hello")
    }
    list.forEachIndexed { index, name -> println("${index + 1}: $name") }
    for (i in 1..100) {
        if (i % 7 == 0) {
            println(i)
            break
        }
    }
    println(MathUtils.cube(10))
    println(MathUtils.square(10))

    val classIvan = User.create("Иван")

    println(classIvan.name)

}




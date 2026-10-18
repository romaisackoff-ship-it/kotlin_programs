
fun <T> identity(x: T): T {
    return x
}

fun <T> List<T>.myfirstOrNull(): T? {
    return if (this.isEmpty()) null else this[0]

}

class Box<T>(val value: T)

val intBox = Box(42)
val strBox = Box("Привет")

class MyPair<A, B>(val first: A, val second: B)

val p = MyPair(1, "один")

fun <T> List<T>.secondOrNull(): T? {
    return if (this.size < 2) null else this[1]
}

fun <T, R> List<T>.myMap(transform: (T) -> R): List<R> {
    val result = mutableListOf<R>()
    for (item in this) {
        result.add(transform(item))
    }
    return result

}

fun <T : Number> myMaxOf(a: T, b: T): T {
    return if (a.toDouble() > b.toDouble()) a else b
}


fun main() {
    println(identity(42))
    println(identity("привет"))
    println(identity(true))

    println(listOf(1, 2, 3).myfirstOrNull())
    println(listOf<Int>().myfirstOrNull())

    println(intBox.value)
    println(strBox.value)

    println(p.first)
    println(p.second)

    println(listOf(1, 2, 3).secondOrNull())
    println(listOf(1).secondOrNull())

    println(listOf(1, 2, 3).myMap { it * 2 })

    println(myMaxOf(1, 4))
}

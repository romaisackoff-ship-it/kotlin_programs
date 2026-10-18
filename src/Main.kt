
interface Producer<out T> {
    fun produce(): T
}

class StringProducer : Producer<String> {
    override fun produce(): String = "привет"
}

interface Consumer<in T> {
    fun consume(item: T)
}

class AnyConsumer : Consumer<Any> {
    override fun consume(item: Any) { println(item) }
}
fun printAll(items: List<*>) {
    for (item in items) {
        println(item)
    }
}

fun main() {
    val o: Producer<Any> = StringProducer()

    println(o.produce())

    val c: Consumer<String> = AnyConsumer()   // ✅ должно работать
    c.consume("привет")

    printAll(listOf("a", "b"))
    printAll(listOf(1, 2, 3))
    printAll(listOf(true, false))
}

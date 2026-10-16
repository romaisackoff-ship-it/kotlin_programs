// Задача 1
val input: String? = " ф "
fun task1() = input?.trim()?.toIntOrNull() ?: -1

// Задача 2
val list = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
fun task2() = list.filter { it % 2 == 0 }.map { it * 3 }.sum()

// Задача 3
data class Product(val name: String, val price: Double, val inStock: Boolean)

val products = listOf(
    Product("Хлеб", 40.0, true),
    Product("Молоко", 80.0, true),
    Product("Сыр", 500.0, false),
    Product("Мясо", 400.0, true),
    Product("Рыба", 350.0, false)
)

fun task3() {
    println(products.any { it.price > 400 })
    println(products.all { it.inStock })
    println(products.none { it.price < 30 })
    println(products.any { it.price == 80.0 })
}

// Задача 4
fun task4() {
    val grouped = products.groupBy { it.inStock }
    grouped.forEach { (inStock, items) ->
        println("${if (inStock) "В наличии" else "Нет"}: ${items.size}")
    }
}

// Задача 5
fun task5() {
    println(products.firstOrNull { it.price > 300 })
    println(products.lastOrNull { it.inStock })
    println(products.minByOrNull { it.price })
    println(products.filter { it.inStock }.maxByOrNull { it.price })
}

// Задача 6
sealed interface PaymentResult {
    data class Success(val amount: Double) : PaymentResult
    data class InsufficientFunds(val needed: Double) : PaymentResult
    data class Error(val message: String) : PaymentResult
}

fun describe(result: PaymentResult): String = when (result) {
    is PaymentResult.Success -> "Успех: ${result.amount}"
    is PaymentResult.InsufficientFunds -> "Не хватает: ${result.needed}"
    is PaymentResult.Error -> "Ошибка: ${result.message}"
}

// Задача 7
sealed interface Shape {
    data class Circle(val radius: Double) : Shape
    data class Rectangle(val width: Double, val height: Double) : Shape
    data class Triangle(val base: Double, val height: Double) : Shape
}

fun area(shape: Shape): Double = when (shape) {
    is Shape.Circle -> Math.PI * shape.radius * shape.radius
    is Shape.Rectangle -> shape.width * shape.height
    is Shape.Triangle -> 0.5 * shape.base * shape.height
}

// Задача 8
data class Employee(val name: String, val salary: Double)

fun findEmployee(name: String): Employee? {
    val employees = listOf(
        Employee("Иван", 75000.0),
        Employee("Пётр", 90000.0)
    )
    return employees.find { it.name == name }
}

// Задача 9
val list2 = listOf("1", "abc", "3", "", "5", "xyz", "7")
fun task9() {
    val numbers = list2.mapNotNull { it.toIntOrNull() }
    println(numbers.sum())
    println("%.2f".format(numbers.average()))
}

// Задача 10
data class Student(val name: String, val grade: Int, val city: String)

val students = listOf(
    Student("Иван", 5, "Москва"),
    Student("Пётр", 3, "Питер"),
    Student("Анна", 4, "Москва"),
    Student("Олег", 2, "Питер"),
    Student("Маша", 5, "Москва"),
    Student("Коля", 4, "Казань")
)

fun excellent(students: List<Student>): List<Student> =
    students.filter { it.grade == 5 }

fun averageGrade(students: List<Student>): Double =
    students.map { it.grade }.average()

fun byCity(students: List<Student>): Map<String, List<Student>> =
    students.groupBy { it.city }

fun bestStudent(students: List<Student>): Student? =
    students.maxByOrNull { it.grade }

fun citiesWithExcellent(students: List<Student>): List<String> =
    students.filter { it.grade == 5 }.map { it.city }.distinct()

fun task10() {
    println(excellent(students))
    println(averageGrade(students))
    println(byCity(students))
    println(bestStudent(students))
    println(citiesWithExcellent(students))
}

// main
fun main() {
    println(task1())
    println(task2())
    task3()
    task4()
    task5()
    println(describe(PaymentResult.Success(100.0)))
    println(area(Shape.Circle(5.0)))
    findEmployee("Иван")?.let {
        println("${it.name}: ${"%.1f".format(it.salary)}")
    }
    task9()
    task10()
}
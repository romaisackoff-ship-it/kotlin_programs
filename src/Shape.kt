sealed interface Shape {
    data class Circle(val radius: Double) : Shape
    data class Rectangle(val width: Double, val height: Double) : Shape
    data class Triangle(val base: Double, val height: Double) : Shape
}

fun area(shape: Shape): Double = when (shape) {
    is Shape.Circle -> Math.PI * shape.radius * 2
    is Shape.Rectangle -> shape.height * shape.width
    is Shape.Triangle -> 0.5 * shape.base * shape.height
}


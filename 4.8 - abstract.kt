/**
 * Задание 8. Создайте абстрактный класс Shape с абстрактным методом area(),
 * затем создайте классы Circle и Rectangle, реализующие этот метод.
 * Создайте объекты Circle и Rectangle и выведите их площадь.
 */

fun main() {
    val circle = Circle(5,3.14f)
    val SquareCircle = circle.area()
    println("Площадь круга равна $SquareCircle")

    val rectangle = Rectangle(4,7)
    val SquareRectangle = rectangle.area()
    println("Площадь треугольника равна $SquareRectangle")
}

// создаем абстрактный класс
abstract class Shape {
    // создаем абстрактную функцию
    abstract fun area(): Float
}

class Circle(var r: Int, var pi: Float): Shape() {
    // переопределенный абстрактный метод
    override fun area(): Float {
        val Sc = pi * r * r
        return Sc
    }
}

class Rectangle(var a: Int, var h: Int): Shape() {
    // переопределенный абстрактный метод
    override fun area(): Float {
        val Sr = 0.5f * a * h
        return Sr
    }
}


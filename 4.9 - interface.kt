/**
 * Задание 9. Создайте интерфейс Flyable с методом fly(),
 * затем создайте классы Bird и Airplane, реализующие этот интерфейс.
 * Создайте объекты Bird и Airplane и вызовите их методы fly().
 */

fun main() {
    val bird = Bird()
    val birdOne = bird.fly()

    val airplane = Airplane()
    val airplaneOne = airplane.fly()

}

// объявление интерфейса
interface Flyable {
    fun fly()
}

class Bird: Flyable {
    // переопределенный метод
    override fun fly() {
        println("Птичка летает")
    }
}

class Airplane: Flyable {
    // переопределенный метод
    override fun fly() {
        println("Аэроплан летает")
    }
}
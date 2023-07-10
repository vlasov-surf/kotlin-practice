/**
 * Задание 3. Создайте объект Singleton с методом printMessage(),
 * который выводит любое сообщение. Вызовите этот метод.
 */

fun main() {
// вызываем синглтон
    Singleton.printMessage()
}

object Singleton {
    // метод, который выводит сообщение в консоль
    fun printMessage() {
        println("Привет, я Singleton!!!")
    }
}

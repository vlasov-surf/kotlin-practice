/**
 * Задание 9. ССоздайте data class User с двумя свойствами и методом printInfo(),
 * который выводит информацию о пользователе. Создайте объект User и вызовите его метод printInfo().
 */

fun main() {
    val User = User("Алексей", 45)
// вызываем функцию
    User.printInfo()
}

// объявляем дата класс с двумя свойствами
data class User(val name: String, val age: Int) {
    // описываем функцию
    fun printInfo() {
        println("Ваше имя: $name\nВаш возраст: $age")
    }
}
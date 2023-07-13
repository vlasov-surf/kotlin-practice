/**
 * Задание 5. Создайте объект класса Person со свойствами name и age.
 * Создайте список из нескольких таких объектов.
 * Используйте filter и map чтобы получить список имен тех людей, которым больше 18 лет.
 */

fun main() {
    val user1 = Person("Макс", 19)
    val user2 = Person("Сергей", 22)
    val user3 = Person("Юля", 45)

    val list = listOf(user1, user2, user3)
    // применяем лямбда-выражения через filter (больше 18) и преобразуем в имя через map (выводим имя)
    val names18user = list.filter { it.age > 18 }.map { it.name }
    println(names18user)
}

data class Person(var name: String, var age: Int) {
}
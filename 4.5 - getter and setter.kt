/**
 * Задание 5. В классе Person добавьте custom геттеры и сеттеры для свойств name и age.
 * Убедитесь, что вы можете управлять доступом к этим свойствам извне класса.
 * Например, вы можете реализовать проверку возраста в сеттере, чтобы убедиться, что возраст неотрицательный.
 */

fun main() {
    val person = Personal()
    person.name = "Макс"
    person.age = 6
    println(person.name)
    println(person.age)
}

// устанавливаем свойства класса приватными
class Personal(var GetName: String = "", var GetAge: Int = 0) {
    var name: String
        // геттер для name контролирует чтение (получение) значения свойства
        get() {
            return if (GetName.isNotEmpty()) GetName else "Имя не указано!"
            // сеттер для name контролирует запись (установку) значения свойства
        }
        set(value) {
            GetName = value
        }

    var age: Int
        // геттер для age контролирует чтение (получение) значения свойства
        get() {
            return GetAge
        }
        // сеттер для age контролирует запись (установку) значения свойства
        set(value) {
            // проверка на отрицательный возраст
            if (value >= 0) {
                GetAge = value
            } else {
                println("Ваш возраст отрицательный!")
            }
        }
}
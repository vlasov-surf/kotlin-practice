/**
 * Задание 6. Создайте класс Animal с методом makeSound(),
 * затем создайте классы Dog и Cat,наследующие от Animal, и переопределите метод makeSound().
 * Создайте объекты Dog и Cat и вызовите их методы makeSound().
 */

fun main() {
    val AnimalText = Animal()
    AnimalText.makeSound()

    val Dog = Dog()
    Dog.makeSound()

    val Cat = Cat()
    Cat.makeSound()
}

// доступный класс для наследования (наследование)
open class Animal() {
    // доступная функция для переопределения (полиморфизм)


    open fun makeSound() {
        println("Животные издают следующие звуки:")
    }
}

class Dog : Animal() {
    // переопределенная функция (полиморфизм)
    override fun makeSound() {
        println("Собака гавкает")
    }
}

class Cat : Animal() {
    // переопределенная функция (полиморфизм)
    override fun makeSound() {
        println("Кошка мяукает")
    }
}

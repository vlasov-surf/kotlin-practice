/**
 * Задание 12. Создайте два класса: Mammal и CanFly. В классе Mammal определите метод breastfeed(),
 * а в классе CanFly - метод fly(). Затем создайте класс Bat, который сочетает в себе оба
 * этих поведения (с помощью композиции).
 */

fun main() {
    val bat = Bat()
    bat.breastfeed()
    bat.fly()
}

class Mammal {
    fun breastfeed() {
        println("Я кормлю грудью")
    }
}

class CanFly {
    fun fly() {
        println("Я летаю")
    }
}

class Bat {
    // переменные содержат приватные свойства mammal и canFly, которые являются экземплярами классов Mammal и CanFly соответственно
    private var mammal: Mammal = Mammal()
    private var canfly: CanFly = CanFly()

    // в методе берем функцию по переменной из класса Mammal
    fun breastfeed() {
        mammal.breastfeed()
    }

    // в методе берем функцию по переменной из класса CanFly
    fun fly() {
        canfly.fly()
    }
}
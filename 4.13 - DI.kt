/**
 * Задание 13. Создайте классы Engine и Tires. Затем создайте класс Car, который получает
 * Engine и Tires через конструктор (Dependency Injection).
 */

fun main() {
val engine = Engine()
val tires = Tires()
val Car = Car(engine, tires)
Car.letsGo()
}

// класс двигателя
class Engine() {
    fun move() {
        println("Машина движется")
    }
}

// класс шин
class Tires() {
    fun traction() {
        println("Шины поддерживают сцепление с дорогой")
    }
}

// объявляем класс с конструктором, где принимаем переменные как экземпляры классов шин и двигателя
class Car(private var engine: Engine, private var tires: Tires) {
    // в функции присваиваем переменным методы из их классов
    fun letsGo() {
        engine.move()
        tires.traction()
    }
}
/**
 * Задание 13. Создайте классы Engine и Tires. Затем создайте класс Car, который получает
 * Engine и Tires через конструктор (Dependency Injection).
 */

fun main() {
val engine = Engine()
val tires = Tires()
val car = Car(engine, tires)
car.letsGo()
}

interface EngineInt {
    fun move()
}

interface TiresInt {
    fun traction()
}

// класс двигателя
class Engine: EngineInt {
    override fun move() {
        println("Машина движется")
    }
}

// класс шин
class Tires: TiresInt {
    override fun traction() {
        println("Шины поддерживают сцепление с дорогой")
    }
}

// объявляем класс с конструктором, где принимаем переменные как экземпляры классов шин и двигателя
class Car(private var engine: EngineInt, private var tires: TiresInt) {
    // в функции присваиваем переменным методы из их классов
    fun letsGo() {
        engine.move()
        tires.traction()
    }
}
/**
 * Задание 1. Создайте класс Car с полями model, color, year и методом drive().
 * Создайте несколько объектов этого класса и вызовите их метод drive().
 */

fun main() {
    //1 объект класса
    val myCar = Car("BMW", "Red", 1998)
    myCar.drive()

    //2 объект класса
    val momCar = Car("Mersedes", "Black", 2020)
    momCar.drive()

    //3 объект класса
    val dadCar = Car("Volga", "White", 1998)
    dadCar.drive()

    //4 объект класса
    val friendCar = Car("Audi", "Gray", 2001)
    friendCar.drive()
}

// объявляем класс, описываем свойства класса
class Car(var model: String, var color: String, var year: Int) {

    // методы класса
    fun drive() {
        println("Гоняем на $model c $color цветом и годом выпуска $year")
    }
}
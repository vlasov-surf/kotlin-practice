/**
 * Задание 7. Создайте класс Car с полями make, model и year.
 * Создайте коллекцию из нескольких объектов этого класса и используйте groupBy
 * чтобы сгруппировать машины по году выпуска.
 */

fun main() {
val car1 = Cars("ВАЗ", "2101", 2010)
val car2 = Cars("Volkswagen", "Tiguan", 1988)
val car3 = Cars("Волга", "31110", 2010)
val car4 = Cars("ГАЗ", "21", 1965)
val car5 = Cars("BMW", "X5", 2010)
val car6 = Cars("УАЗ", "БУХАНКА", 1965)

val listCars = listOf(car1, car2, car3, car4, car5, car6)
val grouped = listCars.groupBy { it.year }

println(grouped)
}

data class Cars(val make: String, val model: String, val year: Int)

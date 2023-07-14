/**
 * Задание 10. Создайте коллекцию чисел и используйте fold или reduce чтобы посчитать их сумму,
 * минимальное и максимальное значения.
 */

fun main() {
    val numbers = listOf(1,2,3,4,5,6,7)
    // fold(0) - начальное значение, n - счетчик, item - элемент коллекции
    val sum = numbers.fold(0) { n, item -> n + item }
    // n - счетчик, item - элемент коллекции, если элемент коллекции меньше чем счетчик возвращаем элемент, иначе n
    val min = numbers.reduce { n, item -> if (item < n) item else n }
    //n - счетчик, item - элемент коллекции, если элемент коллекции больше чем счетчик возвращаем элемент, иначе n
    val max = numbers.reduce { n, item -> if (item > n) item else n }

    println(sum)
    println(min)
    println(max)
}
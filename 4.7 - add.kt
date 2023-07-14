/**
 * Задание 7. Создайте класс MathUtils и перегрузите функцию add(),
 * чтобы она могла принимать два или три целых числа.
 */

fun main() {
    val mySum = MathUtils()
    val resultSum = mySum.add(1,2)
    // выводим на печать результат 1 add
    println(resultSum)

    val myMultiple = MathUtils()
    val resultMultiple = myMultiple.add(1,2,3)
    // выводим на печать результат 2 add
    println(resultMultiple)
}

class MathUtils {
    // первая перегруженная функция
    fun add(first: Int, second: Int): Int {
        return first + second
    }

    // вторая перегруженная функция
    fun add(first: Int, second: Int, third: Int): Int {
        return first * second * third
    }
}

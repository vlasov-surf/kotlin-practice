/**
 * Задание 9. Создайте функцию высшего порядка calculate, которая принимает два целых числа и функцию операции.
 * Продемонстрируйте использование calculate с разными операциями (сложение, вычитание, умножение).
 */

// Сделал ввод чисел a и b с консоли и закинул в обработку ошибки при недопустимом вводе значения
fun main() {
    try {
        fun calculate(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
            return operation(a, b)
        }
        println("Введите число a")
        val a = readLine()!!.toInt()
        println("Введите число b")
        val b = readLine()!!.toInt()

        val add = { a: Int, b: Int -> a + b }
        val resultAdd = calculate(a, b, add)
        println("Результат сложения = $resultAdd")

        val sub = { a: Int, b: Int -> a - b }
        val resultSub = calculate(a, b, sub)
        println("Результат вычитания = $resultSub")

        val mul = { a: Int, b: Int -> a * b }
        val resultMul = calculate(a, b, mul)
        println("Результат вычитания = $resultMul")

        val div = { a: Int, b: Int -> a / b }
        val resultDiv = calculate(a, b, div)
        println("Результат вычитания = $resultDiv")
    } catch (e: Exception) {
        println("Ошибка")
    } finally {
        println("Конец программы")
    }
}

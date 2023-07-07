/**
 * Задание 4: Создайте рекурсивную функцию generateSequence, которая принимает целое число n и
 * генерирует последовательность чисел от 1 до n. Используйте аннотацию tailrec для оптимизации.
 */

fun main() {
    generateSequence(23)
}
//n - до какого последовательность, i - текущая последовательность
tailrec fun generateSequence(n: Int, i: Int = 1) {
    if (i > n) {
        return
    }
    println(i)
    generateSequence(n, i + 1)
}

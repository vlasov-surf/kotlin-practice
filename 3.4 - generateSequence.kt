/**
 * Задание 4: Создайте рекурсивную функцию generateSequence, которая принимает целое число n и
 * генерирует последовательность чисел от 1 до n. Используйте аннотацию tailrec для оптимизации.
 */

fun main() {
    // присваиваем переменной функцию generateSequence
    val sequence = generateSequence(23)
    // печатаем что вернулось в последовательности в виде списка toList)
    println(sequence.toList())
}
//n - до какого числа последовательность, i - текущий элемент последовательности, res - текущая последовательность, пустая по оумочланию
tailrec fun generateSequence(n: Int, i: Int = 1, res: Sequence<Int> = emptySequence()): Sequence<Int> {
    if (i > n) {
        // возвращается текущая последовательность
        return res
    } else {
        // иначе вызывает себя рекурсивно, увеличивая последовательность res с шагом i до n
        return generateSequence(n, i + 1, res + i)
    }
}
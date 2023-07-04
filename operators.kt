/* Задание 4: Работа с операторами
Условие: Напишите простые выражения с использованием различных операторов Kotlin (арифметические, сравнения, логические).
Выведите результаты на экран.*/

fun main() {
    getArifm()
    getLogic()
    getCompare()
    getAssign()
}

/**
 * РАБОТА С АРИФМЕТИЧЕСКИМИ ОПЕРАТОРАМИ
 * Эта функция вводит значения переменных x, y, summ, diff, prod, quot, rem, exp1, exp2, exp3, exp4, ink, dek и считает арифметические выражения
 */
fun getArifm() {
    val x = 12
    val y = 23
    val sum = x + y          // сумма
    val diff = x - y         // вычитание
    val prod = x * y         // умножение
    val quot = x / y         // деление
    val rem = x % y          // остаток от деления
    val exp1 = x + y * 2
    val exp2 = (x / y) + y
    val exp3 = (x - y) / (y * x)
    val exp4 = (x + 5 + 10 - 2) * (y + 4 * y) % (x - y)
    var ink = 2
    ink++                   // инкремент (увеличивает значение переменной ink на 1)
    var dek = 2
    dek--                   // декремент (уменьшает значение переменной dek на 1)

    println("Cумма x и y = $sum")
    println("Разность x от y = $diff")
    println("Произведение x от y = $prod")
    println("Частное x от y = $quot")
    println("Остаток деления x от y = $rem")
    println("Значение выражения exp1 = $exp1")
    println("Значение выражения exp2 = $exp2")
    println("Значение выражения exp3 = $exp3")
    println("Значение выражения exp4 = $exp4")
    println("Инкремент от ink = $ink")
    println("Декремент от dek = $dek")
}

/**
 * РАБОТА С ЛОГИЧЕСКИМИ ОПЕРАТОРАМИ
 * Эта функция вводит значения переменных x, y, z и считает логические выражения
 * Если в консоли вывелось true - выражение соответствует данному логическому высказыванию
 * Если в консоли вывелся false - выражение не соответствует данному логическому высказыванию
 */
fun getLogic() {
    val a = 5
    val b = 1
    val c = 20
    val result1 = (a > b) && (b < c) && (a < c)    // логическое И
    val result2 = (a < b) || (b > c)               // логическое ИЛИ
    val result3 = !(a > b)                         // логическое НЕ

    println("Значение логического И = $result1")
    println("Значение логического ИЛИ = $result2")
    println("Значение логического НЕ = $result3")
}

/**
 * РАБОТА С ОПЕРАТОРАМИ СРАВНЕНИЯ
 * Эта функция сравнивает значения переменных x и y,
 * затем выводит в консоль булево значение по результатам проверки сравнения двух переменных
 */
fun getCompare() {
    val d = 15
    val e = 20
    val isEqual = d == e                // проверка на равенство
    val isNotEqual = d != e             // проверка на неравенство
    val isLess = d < e                  // проверка на меньше
    val isGreater = d > e               // проверка на больше
    val isGreaterOrEqual = d >= e       // проверка на больше или равно
    val isLessOrEqual = d <= e          // проверка на меньше или равно

    println("X равен Y? $isEqual")
    println("X не равен Y? $isNotEqual")
    println("X меньше Y? $isLess")
    println("X больше либо равен Y? $isGreaterOrEqual")
    println("X меньше либо равен Y? $isLessOrEqual")
}

/**
 * РАБОТА С ОПЕРАТОРАМИ ПРИСВАИВАНИЯ
 * Эта функция выводит в консоль значения переменных a, b, c, d, e после применения оператора присваивания
 * Основной оператор присваивания – это знак равно =, он и присваивает значение правого операнда, левому.
 */
fun getAssign() {
    var f = 10
    var g = 228
    var h = 123
    var i = 3
    var k = 8
    f += 5      // прибавляет к переменной a 5
    g -= 10     // уменьшает переменную b на 10
    h *= 2      // умножает переменную c на 2
    i /= 1      // делит переменную d на 1
    k %= 2      // показывает остаток от деления переменной e на 2
    println(f)
    println(g)
    println(h)
    println(i)
    println(k)
}

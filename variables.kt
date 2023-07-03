/* Задание 3: Работа с переменными
Условие: Создайте несколько переменных разных типов (например, Int, String, Boolean).
Присвойте им значения и выведите результаты на экран.
Попробуйте изменить значения этих переменных и снова выведите результаты. */

/**
 * Это функиця main. В этой функции мы вводим значение переменной и его типы, а затем выводим в консоль значения этих переменных
 * Переменные бывают следующих типов:
 * Numbers: В Kotlin есть несколько типов для представления чисел: Byte , Short , Int , Long , Float , Double .
 * Booleans: Переменные типа Boolean  могут иметь два значения: true  или false .
 * Characters: Char  используется для представления символов.
 * Strings: String  используется для представления последовательностей символов.
 * Arrays: Array  представляет собой коллекцию элементов одного типа. Их можно определять через [].
 * @property myArray1 Название первого целочисленного омассива
 * @property myArray2 Название второго массива с типом строки
 */

fun main() {
    val a: Int = 200                                                                    // хранит целое число
    val b: Byte = -23                                                                   // хранит целое число
    val c: Short = 322                                                                  // хранит целое число
    val d: String = "text1"                                                             // хранит последовательность символов, заключенную в двойные кавычки
    val e: Boolean = false                                                              // хранит булево значение
    val f: Char = 'B'                                                                   // хранит единичный символ, заключенный в одинарные кавычки
    val g: Long = 3000L                                                                 // хранит целое число
    val h: Float = 1.8F                                                                 // хранит дробное число c 6-7 разрядами
    val i: Double = 3.143                                                               // хранит дробное число с 15-16 разрядами
    val myArray1: Array<Int> = arrayOf(1, 2, 3, 4, 5)                                   // хранит коллекцию целых чисел int
    val myArray2: Array<String> = arrayOf("Voronezh","Moscow","St.Petersburg")          // хранит коллекцию целых строковых значений string
    println(a)
    println(b)
    println(c)
    println(d)
    println(e)
    println(f)
    println(g)
    println(h)
    println(i)
    println(myArray1.contentToString())
    println(myArray2.contentToString())
}

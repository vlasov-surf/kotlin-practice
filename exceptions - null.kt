/**
 * ОБРАБОТКА ИСКЛЮЧЕНИЙ. Проба на обращение к несуществующему элементу массива
 *
 * Блок try содержит потенциально опасный код, в котором нужно обработать исключение
 * Блок catch отрабатывает в случае, если исключение возникнет.
 * Блок finally используется для постопераций. Может использоваться для освобождения ресурсов или очистки кода
 */

fun main() {
    try {
        val myArray = arrayOf(1, 2, 3, 4, 5)
        val element = myArray[10]
        println(element)
        }
    catch(error: Exception) {
        println("Произошла ошибка")
        error.printStackTrace()
    }
    finally {
        println("Программа была завершена")
    }
}

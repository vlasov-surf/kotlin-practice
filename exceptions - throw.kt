/**
 * ОБРАБОТКА ИСКЛЮЧЕНИЙ. Проба на оператор throw
 *
 * Блок try содержит потенциально опасный код, в котором нужно обработать исключение
 * Блок catch отрабатывает в случае, если исключение возникнет.
 * Блок finally используется для постопераций. Может использоваться для освобождения ресурсов или очистки кода
 */

fun main() {
    try {
        // генерируем исключение самостоятельно
        throw NullPointerException("Обращение к null-объекту")
    }
    // объявляем переменную e, назначаем ей вид исключения (беру просто Exception) и печатаем стектрейс
    catch(e:Exception) {
        println("Произошла ошибка")
        e.printStackTrace()
    }
}

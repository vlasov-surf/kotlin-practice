/**
 * ОБРАБОТКА ИСКЛЮЧЕНИЙ. Проба на деление на ноль
 *
 * Блок try содержит потенциально опасный код, в котором нужно обработать исключение
 * Блок catch отрабатывает в случае, если исключение возникнет.
 * Блок finally используется для постопераций. Может использоваться для освобождения ресурсов или очистки кода
 */

fun main() {
    val a = 2
    val b = 0
    // помещаем потенциально опасную операцию
    try {
        println(a / b)
    // какое именно исключение хотим отловить
    }
    catch (c: Exception) {
        println("Произошла ошибка")
        c.printStackTrace()
    }
//    catch (d: ArithmeticException) {
//        println("Это математическое исключение. Делить на ноль нельзя")
//        d.printStackTrace()
//    }

    // постобработка - блок выполняется даже тогда, когда нет исключения
    finally {
        println("Программа была завершена. Логи:")
    }
}

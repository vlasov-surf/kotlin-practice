/**
 * Задание 2. Создайте enum class DayOfWeek, содержащий все дни недели.
 * Выведите все дни недели, используя свойства values и name этого enum.
 */

fun main() {
    // перебираем значения в классе
    // values() - возвращает массив констант текущего перечисления
    for (value in DayOfWeeks.values()) {
        println(value.name)
    }
}

// класс перечисления (enum)
enum class DayOfWeeks {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}
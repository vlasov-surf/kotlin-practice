/**
 * Задание 5: Создайте список имен и используйте функции let, run, also, apply и with для выполнения
 * различных операций над этим списком (например, добавьте имя, удалите имя, переверните список и т. д.)..
 */

fun main() {
    val ListOfNames = mutableListOf("Виталий", "Оксана", "Катя", "Макс", "Маша", "Паша", "Влад")
    // ОПЕРАЦИЯ УДАЛЕНИЯ ПО ИНДЕКСУ. Возвращаем результат выполнения лямбда-функции, а не объект, т.е. removeAt(index = 0)
    ListOfNames.run {
        this.removeAt(index = 0)
        println("Элементы списка после удаления имени: $this")
    }

    // ОПЕРАЦИЯ ДОБАВЛЕНИЯ. Возвращаем объект, т.е. "it" - mutableListOf
    ListOfNames
        .also {
            it.add("Стас")
            println("Элементы списка после добавления имени: $it")
        }

    // ОПЕРАЦИЯ ПЕРЕВОРАЧИВАНИЯ. Возвращаем объект, т.е. "this" - mutableListOf
    ListOfNames
        .apply {
            this.reverse()
            println("Элементы списка после переворачивания: $this")
        }

    // ОПЕРАЦИЯ ПЕРЕИМЕНОВАНИЯ. Возвращаем результат выполнения лямбда-функции, а не объект, т.е. println
    with(ListOfNames) {
        val renamed = this.map { name ->
            "$name - QA at Surf"
        }
        println("Переименованная коллекция: $renamed")
    }

    // ОПЕРАЦИЯ УДАЛЕНИЯ ПО НАИМЕНОВАНИЮ. Возвращаем результат выполнения лямбда-функции, а не объект, т.е. println
    ListOfNames.let {
        it.remove("Стас")
        println("Удален объект из списка $it")
    }
}

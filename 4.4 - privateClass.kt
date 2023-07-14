/**
 * Задание 4. Создайте класс Person с приватными свойствами name, age и публичными методами getName() и getAge().
 * Проверьте, что прямой доступ к этим свойствам невозможен извне класса.
 */

fun main() {
    val myParameters = Person("Макс", 33)
    println(myParameters.getName())
    println(myParameters.getAge())

//    Дает Cannot access 'name': it is private in 'Person', так как name и age - Unresolved ссылки из-за private модификатора доступа
//    println(myParameters.name)
//    println(myParameters.age)
}

class Person(private val name: String, private val age: Int) {
    fun getName(): String {
        return name
    }
    fun getAge(): Int {
        return age
    }
}
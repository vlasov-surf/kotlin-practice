/**
 * Задание 14. Создайте обобщенный интерфейс Repository<T>, который содержит методы для сохранения (save(item: T)),
 * удаления (delete(item: T)) и получения всех элементов (getAll(): List<T>).
 * Реализуйте этот интерфейс в классе UserRepository для работы с объектами класса User.
 */

fun main() {
    // создаем объекты класса Users, присваиваем им аргументы
    val user1 = Users("Макс", 25)
    val user2 = Users("Гриша", 34)
    val user3 = Users("Кирилл", 56)

    val userRepository = UserRepository()
    userRepository.save(user1)
    userRepository.save(user2)
    userRepository.save(user3)
    println("Пользователи сохранены")
    println(userRepository.getAll())

    userRepository.delete(user1)
    println("\nПользователь $user1 удален")
    println(userRepository.getAll())
}

// объявили класс, связанный с интерфейсом, где вместо T используем тип Users
class UserRepository : Repository<Users> {
    // тут только приватные переменные
    private val listOfUsers = mutableListOf<Users>()

    // переопределенная функция (полиморфизм) из интерфейса
    override fun save(item: Users) {
        listOfUsers.add(item)
    }

    // переопределенная функция (полиморфизм) из интерфейса
    override fun delete(item: Users) {
        listOfUsers.remove(item)
    }

    // переопределенная функция (полиморфизм) из интерфейса
    override fun getAll(): List<Users> {
        return listOfUsers
    }
}

// объявление обобщенного интерфейса
// данный параметр будет представлять некоторый тип данных, который на момент определения класса неизвестен.
interface Repository<T> {
    fun save(item: T)
    fun delete(item: T)
    fun getAll(): List<T>
}

// храним здесь данные по Users
data class Users(val name: String, val age: Int)
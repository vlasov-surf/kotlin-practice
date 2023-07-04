/**
 * Оператор break используется для немедленного выхода из текущего цикла. 
 * Он особенно полезен, когда вам нужно прервать цикл в случае определенного условия. 
 * Покинуть внешний цикл из вложенного так же можно с помощью меток.
 */

fun main() {
    for (a in 10..99) {
        for (b in 10..99) {
            val sum = a + b
            if (sum > 50) {
                break
            }
            println("Сумма чисел $a и $b равна $sum")
        }
    }
}

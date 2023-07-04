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

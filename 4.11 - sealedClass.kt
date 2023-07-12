/**
 * Задание 11. Создайте sealed class MathOperation и несколько объектов,
 * представляющих различные математические операции (например, Add, Subtract, Multiply, Divide).
 * Создайте функцию, которая принимает MathOperation и два числа, и выполняет соответствующую операцию.
 */

fun main() {
    println("Введите число")
    val a = 10
    val b = 5

    val resultAdd = returnCalculation(MathOperation.Add, a, b)
    val resultSubtract = returnCalculation(MathOperation.Subtract, a, b)
    val resultMultiply = returnCalculation(MathOperation.Multiply, a, b)
    val resultDivide = returnCalculation(MathOperation.Divide, a, b)

    println("Результат сложения $a и $b = $resultAdd")
    println("Результат вычитания $a и $b = $resultSubtract")
    println("Результат умножения $a и $b = $resultMultiply")
    println("Результат деления $a и $b = $resultDivide")
}

sealed class MathOperation {
    abstract fun makeCalculation(a: Int, b: Int): Int

    object Add : MathOperation() {
        override fun makeCalculation(a: Int, b: Int): Int {
            return a + b
        }
    }

    object Subtract : MathOperation() {
        override fun makeCalculation(a: Int, b: Int): Int {
            return a - b
        }
    }

    object Multiply : MathOperation() {
        override fun makeCalculation(a: Int, b: Int): Int {
            return a * b
        }
    }

    object Divide : MathOperation() {
        override fun makeCalculation(a: Int, b: Int): Int {
            return a / b
        }
    }
}

fun returnCalculation(operation: MathOperation, a: Int, b: Int): Int {
    return operation.makeCalculation(a, b)
}
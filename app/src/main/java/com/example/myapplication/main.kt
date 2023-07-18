package com.example.myapplication

// LV1
//fun main() {
//    class Calculator {
//        fun add(a: Int, b: Int): Int {
//            return a + b
//        }
//
//        fun subtract(a: Int, b: Int): Int {
//            return a - b
//        }
//
//        fun multiply(a: Int, b: Int): Int {
//            return a * b
//        }
//
//        fun divide(a: Int, b: Int): Int {
//            return a / b
//        }
//    }
//
//    val operator = '+'
//    val calculator = Calculator()
//
//    val num1 = 10
//    val num2 = 5
//
//    val result = when (operator) {
//        '+' -> calculator.add(num1, num2)
//        '-' -> calculator.subtract(num1, num2)
//        '*' -> calculator.multiply(num1, num2)
//        '/' -> calculator.divide(num1, num2)
//        else -> {
//            println("잘못된 연산자입니다.")
//            return
//        }
//    }
//
//    println(result)
//}



// LV2
//fun main() {
//    class Calculator {
//        fun add(a: Int, b: Int): Int {
//            return a + b
//        }
//
//        fun subtract(a: Int, b: Int): Int {
//            return a - b
//        }
//
//        fun multiply(a: Int, b: Int): Int {
//            return a * b
//        }
//
//        fun divide(a: Int, b: Int): Int {
//            return a / b
//        }
//        fun remainder(a: Int, b: Int): Int {
//            return a % b
//        }
//    }
//
//    val operator = '+'
//    val calculator = Calculator()
//
//    val num1 = 10
//    val num2 = 5
//
//    val result = when (operator) {
//        '+' -> calculator.add(num1, num2)
//        '-' -> calculator.subtract(num1, num2)
//        '*' -> calculator.multiply(num1, num2)
//        '/' -> calculator.divide(num1, num2)
//        '%' -> calculator.remainder(num1, num2)
//        else -> {
//            println("잘못된 연산자입니다.")
//            return
//        }
//    }
//
//    println(result)
//}





// LV3
//fun main() {
//    val calc = Calculator()
//    println("1 더하기 2 결과는 : ${calc.addOperation(AddOperation(), 1, 2)} 입니다")
//}


// LV4
fun main() {
    val calc = Calculator(AddOperation())
    println("1 더하기 2 결과는 : ${calc.addOperation(1, 2)} 입니다")
}

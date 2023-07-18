// main.kt
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


// AbstractOperation.kt
package com.example.myapplication

// LV3
//interface Operation {
//    fun operate(num1: Int, num2: Int): Double
//}


// LV4
abstract class AbstractOperation {
    abstract fun operate(num1: Int, num2: Int): Int
}


// Calculator.kt
package com.example.myapplication

// LV3
//class Calculator {
//    fun addOperation(operation: AddOperation, num1: Int, num2: Int): Int {
//        return operation.operate(num1, num2)
//    }
//}


// LV4
class Calculator(private val operation: AbstractOperation) {
    fun addOperation(num1: Int, num2: Int): Int {
        return operation.operate(num1, num2)
    }
}


// AddOperation.kt
package com.example.myapplication

// LV3
//class AddOperation {
//    fun operate(num1: Int, num2: Int): Int = num1 + num2
//}


// LV4
class AddOperation : AbstractOperation() {
    override fun operate(num1: Int, num2: Int): Int = num1 + num2
}



// LV3 : Lv2와 비교하여 어떤 점이 개선되었는가
Calculator 클래스의 addOperation 메서드는 Operation 인터페이스를 구현한 클래스들을 매개변수로 받습니다. 이렇게 함으로써 각 연산(더하기, 빼기, 곱하기, 나누기)의 책임이 해당 클래스로 명확히 분리되며, 단일 책임 원칙(Single Responsibility Principle)을 지킬 수 있습니다.

개선점:

1. 단일 책임 원칙(SRP): 각 연산을 담당하는 클래스들(AddOperation, SubstractOperation, MultiplyOperation, DivideOperation)이 각각 하나의 책임을 가지며, Calculator 클래스는 이들을 활용하여 연산을 수행하는 역할만 담당합니다. 이로 인해 코드의 구조가 더 간결하고 유지보수가 쉬워집니다.
2. 확장성: 새로운 연산을 추가하기 위해서는 새로운 클래스를 구현하고 Operation 인터페이스를 구현하면 됩니다. 이렇게 함으로써 기존 코드를 수정하지 않고도 새로운 연산을 추가할 수 있습니다.
3. 재사용성: 각 연산을 담당하는 클래스들은 독립적으로 재사용할 수 있습니다. 예를 들어, 다른 프로젝트에서 곱하기 연산만 필요한 경우 해당 클래스를 가져와서 사용할 수 있습니다.
4. 가독성: 코드의 구조가 더 명확해졌고, 클래스들의 이름과 메서드 이름이 각각의 책임을 잘 반영하여 가독성이 향상되었습니다.

// LV4 : LV3과 비교하여 어떤 점이 개선되었는가
Lv4에서는 AbstractOperation 클래스를 생성하여 Calculator 클래스와 연산 클래스들 사이의 추상화를 구현합니다.

개선점:

1. 클래스 간의 결합도 감소: Calculator 클래스는 AbstractOperation 클래스를 통해 각 연산 클래스들과 직접적인 의존 관계를 갖지 않습니다. 대신 생성자를 통해 AbstractOperation 객체를 주입받아 사용합니다. 이로 인해 클래스 간의 결합도가 감소하고 코드 유연성이 향상됩니다.
2. 의존성 역전 원칙(Dependency Inversion Principle, DIP): Calculator 클래스가 구체적인 연산 클래스들이 아닌 추상 클래스인 AbstractOperation에 의존하도록 변경되었습니다. 이렇게 함으로써 고수준 모듈(Calculator)은 저수준 모듈(AddOperation, SubtractOperation 등)에 의존하지 않고, 추상화된 인터페이스(AbstractOperation)에 의존하게 됩니다. 이는 소프트웨어 설계 원칙 중 하나인 의존성 역전 원칙을 따른 것입니다.
3. 확장성: 새로운 연산을 추가하기 위해서는 AbstractOperation 클래스를 상속하고 추상 메서드를 구현하는 클래스를 작성하면 됩니다. 기존 코드를 수정하지 않고도 새로운 연산을 손쉽게 추가할 수 있습니다.

이렇게 변경된 코드는 클래스 간의 관계가 더 유연하고 결합도가 낮아져서, 기능 추가 및 변경에 더 적합한 설계가 되었습니다.

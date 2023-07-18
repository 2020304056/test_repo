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

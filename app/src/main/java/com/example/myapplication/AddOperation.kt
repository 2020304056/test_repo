package com.example.myapplication

// LV3
//class AddOperation {
//    fun operate(num1: Int, num2: Int): Int = num1 + num2
//}


// LV4
class AddOperation : AbstractOperation() {
    override fun operate(num1: Int, num2: Int): Int = num1 + num2
}
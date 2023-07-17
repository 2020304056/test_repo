package com.example.myapplication

// LV1
//class Calculator {
//    // 더하기 연산 메서드
//    static add(a, b) {
//        return a + b;
//    }
//
//    // 빼기 연산 메서드
//    static subtract(a, b) {
//        return a - b;
//    }
//
//    // 곱하기 연산 메서드
//    static multiply(a, b) {
//        return a * b;
//    }
//
//    // 나누기 연산 메서드
//    static divide(a, b) {
//        if (b === 0) {
//            throw new Error("Cannot divide by zero");
//        }
//        return a / b;
//    }
//}
//
//// 조건식에 맞춰서 연산 수행
//var operator = '+';
//var operand1 = 5;
//var operand2 = 3;
//
//if (operator === '+') {
//    console.log(`${operand1} + ${operand2} = ${Calculator.add(operand1, operand2)}`);
//} else if (operator === '-') {
//    console.log(`${operand1} - ${operand2} = ${Calculator.subtract(operand1, operand2)}`);
//} else if (operator === '*') {
//    console.log(`${operand1} * ${operand2} = ${Calculator.multiply(operand1, operand2)}`);
//} else if (operator === '/') {
//    try {
//        console.log(`${operand1} / ${operand2} = ${Calculator.divide(operand1, operand2)}`);
//    } catch (error) {
//        console.log(`Error: ${error.message}`);
//    }
//} else {
//    console.log("잘못된 연산자입니다.");
//}


// LV2
//class Calculator {
//    // 더하기 연산 메서드
//    static add(a, b) {
//        return a + b;
//    }
//
//    // 빼기 연산 메서드
//    static subtract(a, b) {
//        return a - b;
//    }
//
//    // 곱하기 연산 메서드
//    static multiply(a, b) {
//        return a * b;
//    }
//
//    // 나누기 연산 메서드
//    static divide(a, b) {
//        if (b === 0) {
//            throw new Error("Cannot divide by zero");
//        }
//        return a / b;
//    }
//
//    // 나머지 연산 메서드
//    static modulo(a, b) {
//        if (b === 0) {
//            throw new Error("Cannot calculate modulo with zero divisor");
//        }
//        return a % b;
//    }
//}
//
//// 조건식에 맞춰서 연산 수행
//var operator = '%'; // 나머지 연산을 수행하려면 연산자를 '%'로 변경해주세요.
//var operand1 = 10;
//var operand2 = 3;
//
//if (operator === '+') {
//    console.log(`${operand1} + ${operand2} = ${Calculator.add(operand1, operand2)}`);
//} else if (operator === '-') {
//    console.log(`${operand1} - ${operand2} = ${Calculator.subtract(operand1, operand2)}`);
//} else if (operator === '*') {
//    console.log(`${operand1} * ${operand2} = ${Calculator.multiply(operand1, operand2)}`);
//} else if (operator === '/') {
//    try {
//        console.log(`${operand1} / ${operand2} = ${Calculator.divide(operand1, operand2)}`);
//    } catch (error) {
//        console.log(`Error: ${error.message}`);
//    }
//} else if (operator === '%') {
//    try {
//        console.log(`${operand1} % ${operand2} = ${Calculator.modulo(operand1, operand2)}`);
//    } catch (error) {
//        console.log(`Error: ${error.message}`);
//    }
//} else {
//    console.log("잘못된 연산자입니다.");
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
package org.example.baekjoon

import java.util.*

fun cal(expr: String): Int {
    val tokens = expr.split(" ")
    val num1 = tokens[0].toInt()
    val operator = tokens[1]
    val num2 = tokens[2].toInt()

    return when (operator) {
        "+" -> num1 + num2
        "-" -> num1 - num2
        "*" -> num1 * num2
        "/" -> num1 / num2
        else -> 0
    }
}

fun main() {
    print("연산식을 입력하세요: ")
    val expression = readln()
    // or readLine()!! / !!: null 제거
    val result = cal(expression)
    println("연산 결과: $result")
}
package org.example.Algorithm.Algorithm

import java.util.*

//object Name{
//
//}

//fun main() {
//    print("당신의 이름은 무엇입니까? ")
//    val name = readLine()
//    print("당신의 나이는 몇 살입니까? ")
//    val age = readLine()!!.toInt()
//
//    println("당신의 이름은 ${name}이고 나이는 ${age}세이군요.")
//}

object InputHandler {
    fun readName(prompt: String): String? {
        print(prompt)
        return readLine()
        // readLine 함수 자체 반환 즉 사용자로부터 입력 받는 것
    }

    fun readAge(prompt: String): Int {
        print(prompt)
        return readLine()!!.toInt()
    }
}

fun main() {
    val name = InputHandler.readName("당신의 이름은 무엇입니까? ")
    val age = InputHandler.readAge("당신의 나이는 몇 살입니까? ")

    println("당신의 이름은 ${name}이고 나이는 ${age}세이군요.")
}
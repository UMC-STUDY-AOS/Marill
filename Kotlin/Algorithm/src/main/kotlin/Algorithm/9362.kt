package org.example.Algorithm

import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    print("친한 친구의 이름과 나이를 입력하세요. ")
    val input = nextLine()

//    var name : String = ""
//    var age : Int = 0
//
//    if (!input.isNullOrBlank()) {
//        val parts = input.split(" ")
//
//        name = parts[0]
//        age = parts[1].toInt()
//    }

    val (name, age) = input.split(" ")
    // 구조 분해 선언 개꿀

    println("당신의 이름 : 문은비, 나이 : 12")
    println("친구의 이름 : $name, 나이 : $age")
}
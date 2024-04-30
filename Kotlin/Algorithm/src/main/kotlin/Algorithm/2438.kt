package org.example.Algorithm

import java.util.*

fun main() = with(Scanner(System.`in`)) {
    val n = nextInt()

//    for (i in 1..n) {
//        for (j in 1..i) {
//            print("*")
//        }
//        print("\n")
//    }

    for (i in 1..n) {
        println("${"*".repeat(i)}") // 앞으로 repeat 활용하면 좋을 듯
    }
}
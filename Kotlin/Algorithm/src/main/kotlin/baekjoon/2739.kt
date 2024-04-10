package org.example.baekjoon

import java.util.*

fun main() = with(Scanner(System.`in`)){
    val n = nextInt()

    for (i in 1..9){
        println("$n * $i = ${n*i}")
    }
}
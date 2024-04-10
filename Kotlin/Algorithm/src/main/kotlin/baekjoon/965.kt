package org.example.baekjoon

import java.util.*
import kotlin.math.*

fun power(m: Int, n: Int): Int {
    var result = 1
    for(i in 1..n){
        result *= m
    }
    return result
} // 거듭제곱 오랜만... 투스타가 짱

fun main() = with(Scanner(System.`in`)) {
    val m = nextInt()
    val n = nextInt()

    val ans = power(m, n)
    println(ans)
}
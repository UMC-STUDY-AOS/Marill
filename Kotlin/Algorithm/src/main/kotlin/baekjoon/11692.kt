package org.example.baekjoon

import java.util.*
import kotlin.math.*

fun main() = with(Scanner(System.`in`)) {
    val n = nextDouble()
    val n_sqrt = sqrt(n).toInt()
    val n2_sqrt = sqrt(n/2).toInt()

    println(n.toInt() - n_sqrt - n2_sqrt)
}
package org.example.Algorithm

import java.util.*
import kotlin.math.*

fun main() = with(Scanner(System.`in`)) {
    val n = nextInt()
    val n2 = n/2
    val n_sqrt = sqrt(n.toDouble()).toInt()
    val n2_sqrt = sqrt(n2.toDouble()).toInt()

    println(n - n_sqrt - n2_sqrt)
}
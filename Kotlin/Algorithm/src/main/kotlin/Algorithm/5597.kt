package org.example.Algorithm

import java.util.*
import kotlin.collections.ArrayList

fun main() = with (Scanner(System.`in`)){
    val arr = ArrayList<Int>(31)

    repeat(28) {
        arr.add(nextInt())
    }

    val result = ArrayList<Int>(2)

    for (i in 1..30) {
        if (i !in arr) {
            result.add(i)
        }
    }

    println(result[0])
    println(result[1])
}
package org.example.baekjoon

import java.util.*
import kotlin.collections.ArrayList

fun main(args: Array<String>) = with(Scanner(System.`in`)){
    var n = nextInt()
    var arr = ArrayList<Int>(n)

    for (i in 0 until n){
        val num = nextInt()
        arr.add(num)
    }

    print("${arr.minOrNull()} ${arr.maxOrNull()}")
}
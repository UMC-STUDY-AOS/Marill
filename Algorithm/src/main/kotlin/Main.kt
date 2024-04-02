package org.example

fun main() {
//    var a: Int? = null
    var a: Int = 123
    val stringValue = "one line string test"
    val multiLineStringValue = """multiline
        |string
        |value
    """.trimMargin() // 공백 제거 (가독성 높임)
    println(multiLineStringValue)

    var b: Long = a.toLong()
    print(b)

    var intArr = arrayOf(1,2,3,4,5)
    var nullArr = arrayOfNulls<Int>(5) // <>: 제너릭

    intArr[2] = 10
}
package com.faiz.kotlin

fun main() {
    val maxInt = Int.MAX_VALUE
    val minInt = Int.MIN_VALUE
    val overRangeInt = Int.MAX_VALUE + 1 //This operation has led to an overflow
    println("Max Int: $maxInt")
    println("Over range Int: $overRangeInt")

    val numberOne = 1
    val numberTwo = 2
    println(numberOne + numberTwo)

    println((5+4)*4)

    val byteNumber: Byte = 1
    val intNumber: Int = byteNumber.toInt() //if we dosn't have toInt compile will error

    val stringNumber = "23"
    val intNumber2 = 3
    println(intNumber2 + stringNumber.toInt())
    val readableNumber = 1_000_000
    println(readableNumber)
}
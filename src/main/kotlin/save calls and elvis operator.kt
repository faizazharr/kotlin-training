package com.faiz.kotlin

fun main() {
    val text: String? = null
    text?.length

//    val textLength = text?.length
    val textLength = if (text != null) text.length else 7
//    val textLength = text!!.length
    print(textLength)
}
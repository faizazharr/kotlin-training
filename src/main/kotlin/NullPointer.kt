package com.faiz.kotlin

fun main() {
    val text: String? = null

    //val textlength = text.length //compile time error

    if (text != null){
        val textLength = text.length //ready to go
    }
}
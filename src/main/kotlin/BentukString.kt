package com.faiz.kotlin

fun main() {
    val text = "Kotlin"
    val firstChar = text[0]
    println("First character of $text is $firstChar")

    for (char in text){
        print("$char ")
    }
    val statement = "kotlin is \"Awasome\""
    println(statement)
    val name = "Unicode test: \u0394"
    println(name)
    val line = """
    Line 1
    Line 2
    Line 3
    Line 4
    """.trimIndent()
    println(line)
}

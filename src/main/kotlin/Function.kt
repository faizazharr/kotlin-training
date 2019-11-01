package com.faiz.kotlin

fun main() {
    val user = setUser("Faiz",19)
    val user2 = setUser2("Faiz", 19)

    println(user)
    println(user2)

    printUser("faiz")
    printUser2("faiz")
}

fun setUser(name: String, age: Int) : String{
    return "Your name is $name, and your Age is $age"
}

fun setUser2(name: String, age: Int): String = "Your name is $name and your Age is $age "

fun printUser(name: String): Unit{ //Unit adalah return value tanpa harus memanggil return
    print("Your name is $name")
}

fun printUser2(name: String){
    print("Your name is $name")
}


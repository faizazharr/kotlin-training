package com.faiz.kotlin

fun main() {
    val array = arrayOf(1,3,5,7)
    val mixArray = arrayOf(1,3,5,7,"Faiz",true)
    val intArray = intArrayOf(1,3,5,7) //selain int array  ada boolean char long short dan byte
    intArray[2] = 11
    print(intArray[2])

    val ini = Array(4,{i -> i * i}) // dari 1 - 4 hasil arrau [0,1,4,9]
    print(ini[2])

}
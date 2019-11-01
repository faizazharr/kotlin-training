package com.faiz.kotlin

fun main() {
    val now = 20
    val openHours = 7
    val office: String
    office = if (now > 7) {
        "Office Already open"
    } else if (now > openHours) {
        "office already open"
    } else {
        "office is Closed"
    }

    print(office)
    conjunction()
}

fun conjunction(){
    val now = 20
    val officeOpen = 7
    val officeClosed = 16

    val isOpen = if(now >= officeOpen && now <= officeClosed){
        true
    }else{
        false
    }

    println("Office is open : $isOpen")

    val isOpen2 = now < officeOpen || now > officeClosed
    println("Office is closed : $isOpen2")

    if (!isOpen){
        print("Office is Closed")
    }else{
        print("office is Open")
    }
}

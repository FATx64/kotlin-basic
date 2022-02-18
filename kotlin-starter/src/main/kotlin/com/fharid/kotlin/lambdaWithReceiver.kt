package com.fharid.kotlin

//lambda with receiver
fun main (){
    val message = buildString {
        append("Hello there! ")
        append("My name is ")
        append("Fharid ")
    }
    println(message)
}

fun buildString (action: StringBuilder.()->Unit):String{
    val StringBuilder = StringBuilder()
    StringBuilder.action()
    return StringBuilder.toString()
}
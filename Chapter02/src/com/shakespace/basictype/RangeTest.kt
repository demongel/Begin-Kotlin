package com.shakespace.basictype

val rangeInt =  0..1024     //  包括0 和 1024
val rangeInt2 = 0 until  1024   //  不包括1024
fun main(args: Array<String>) {
    for (i in 1..5){
        println(i)
    }
    for (i in 1 until 5){
        println(i)
    }
    //  判断是否包含
    println(50 in rangeInt)
    println(rangeInt.isEmpty())
}
package com.shakespace.chapter03


fun main(args: Array<String>) {
    println(addMethod(3,4)) // 7
    println(addMethod)  // (kotlin.Int, kotlin.Int) -> kotlin.Int
}

public fun calc1(a:Int,b:Int):Unit{
    println(a+b)
}

fun calc(a:Int,b:Int):Int{
    println(a+b)
    return a+b
}

//  相当于
//  public static final int sum(int a, int b) {
//      return a + b;
//   }
//fun sum(a: Int,b: Int):Int = a+b

val addMethod = fun (a:Int, b:Int):Int{return a+b}
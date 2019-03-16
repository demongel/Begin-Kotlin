package com.shakespace.chapter03

//  编译期常量，是在编译期就知道是什么样的值，并将代码中的引用都替换为对应的值，提高效率
//  直接用val定义的常量，是运行时常量，不是编译期间常量，即可以通过反射等方式改变
//  如果要定义为编译器常量，需要增加const 关键字
val FINAL_STRING ="final string"
var varType = "aaaa"

const  val  CONST_FINAL_STRING= "const final string"

var aInt = 234

fun main(args: Array<String>) {

        var test =  CONST_FINAL_STRING

}
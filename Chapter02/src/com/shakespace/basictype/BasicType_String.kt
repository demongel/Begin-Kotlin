package com.shakespace.basictype


val string:String = "HelloWorld"
val fromChars:String= String(charArrayOf('H','e','l','l','o','W','o','r','l','d'))

fun main(args: Array<String>) {
    //  相当于equals    返回true
    println(string == fromChars)
    //  相当于java ==  比较地址
    println(string === fromChars)
    println("输出字符串模板"+ string)
    val arg1=1
    val arg2 =2
    //  注意后面使用 大括号进行计算
    println("$arg1+$arg2 = ${arg1+arg2}")
    val salary = 10000
    //  通过转义加上单位
    println("\$$salary")
    val rawString = """
        \\\\\$ \n\t
        不会转义

        """

    println(rawString)
    println(rawString.length)
}
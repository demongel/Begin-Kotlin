package com.shakespace.chapter03

/**
 *  异常捕获
 *   try catch  也有返回值，返回值是catch最后的表达式
 *   如果有finally  会先执行finally  再返回
 *   注意，catch的时候也是类型写在后面。
 */
fun main(args: Array<String>) {
    val result =  try{
        1/0;
    }catch (e:Exception){
        println("请检查数据是否正确")
        0
    }finally {
        println("Finally一定会执行")
        1
    }
    println(result)
}
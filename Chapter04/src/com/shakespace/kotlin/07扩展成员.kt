package com.shakespace.kotlin

/**
 *  扩展方法
 *      fun X.y():Z{...}
 *   扩展属性
 *      val X.m
 *      var X.n
 */
fun main(args: Array<String>) {
    println("HA".multiply(5))
    println("HA" * 10)

    // 任意一个string 都有一个属性a
    "aaa".a
}

/**
 * 给String添加一个扩展方法
 *  实现将一个字符串重复N次
 */
fun String.multiply(time:Int):String{
    val stringBuilder = StringBuilder()
    for (i in 0 until   time){
        stringBuilder.append(this)
    }
    return  stringBuilder.toString()
}

/**
 *  重载 * 操作符
 */
operator fun String.times(time: Int):String{
    // this 指代调用者
    return this.multiply(time)
}

//  扩展属性
// 扩展属性不能初始化，类似接口属性
val String.a:String
    get() = "HHAA"
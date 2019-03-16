package com.shakespace.kotlin

/**
 *  枚举
 *      实例可数的类
 *      可以添加构造方法，添加成员，添加方法
 *
 *      可以提升代码的表现力，也有一定的性能开销
 */
enum class  LogLevel{
    VERBOSE,DEBUG,INFO,WARN,ERROR;

    //  注意在上面要加 分号 区隔
    fun getTag():String{
        return name
    }
}

// 使用伴生对象的方式实现
class LogLevel2 protected constructor(){
    companion object {
        val VERBOSE = LogLevel2()
        val DEBUG = LogLevel2()
        val INFO = LogLevel2()
        val WARN = LogLevel2()
        val ERROR = LogLevel2()
    }
}

fun main(args: Array<String>) {
    println(LogLevel.DEBUG.getTag())    // 输出 DEBUG
    println(LogLevel.DEBUG.ordinal)    // 打印序号
    LogLevel.values().map (::println)   // 映射打印所有值

}

enum class  Week(val day:Int){
    MONDAY(1),TUESDAY(2),WENDESDAY(3)
}
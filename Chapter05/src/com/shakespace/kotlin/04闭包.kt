package com.shakespace.kotlin

/**
 *  闭包
 *  函数运行的环境
 *  持有函数运行状态
 *  函数内部可以定义函数和类
 */


fun makeFun(): () -> Unit {

    // 可以在闭包中定义类
    data class Person(val name: String, val age: Int)

    var count = 0
    return fun() {
        println(++count)
    }
}

fun fibonacci(): () -> Long {
    var first = 0L;
    var second = 1L;
    return fun(): Long {
        val result = second
        second += first
        first = second - first
        return result;
    }
}

fun main(args: Array<String>) {

    println(Short.MAX_VALUE)
    // 调用makefun 返回一个函数，然后调用这个函数
    val x = makeFun()
    //  函数作用域 没有被释放
    x() //1
    x() //2
    x() //3

    //  作用域没有回收 所以每次调用结果都不一样
    var y = fibonacci();

    println(y())
    println(y())
    println(y())
    println(y())
    println(y())
    println(y())


}

//  返回一个迭代器
fun fibonacci2(): Iterable<Long> {
    var first = 0L;
    var second = 1L;
    return Iterable {
        object : LongIterator() {
            override fun hasNext() = true

            override fun nextLong(): Long {
                val result = second
                second += first
                first = second - first
                return result;
            }

        }
    }
}
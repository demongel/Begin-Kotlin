package com.shakespace.kotlin

import java.io.BufferedReader
import java.io.FileReader

/**
 *
 */

data class Person(val name: String, val age: Int) {
    fun work() {
        println("$name is working")
    }
}

fun main(args: Array<String>) {
    /**
     * let   将调用对象作为it传入
     */
    findPerson()?.let {
        println(it.name)
        println(it.age)
    }

    /**
     * Calls the specified function [block] with `this` value as its receiver and returns `this` value.
     *  T.apply(block: T.() -> Unit): T
     *  相当于给T加了一个 扩展方法,也就是说，T.()表示T的扩展方法
     *      T.()   传入当前对象 作为this
     *      可以直接调用对象的方法
     */
    findPerson()?.apply {
        println(this)
        work()
        println("apply $name work method")
    }

    /**
     * apply是由对象来调用
     * with  需要传入一个对象  并添加一个扩展方法 com/shakespace/kotlin/01高阶函数.kt
     * 使用 use 省略close()
     *          调用对象必须是closeable的
     */
    val br = BufferedReader(FileReader("src//com//shakespace//kotlin//01高阶函数.kt"))
    //  根目录是项目目录

    with(br) {
        var line: String?
        while (true) {
            line = readLine() ?: break
            println(line)
        }
        close()
    }

    BufferedReader(FileReader("Chapter05.iml")).use {
        var line: String?
        while (true) {
            line = it.readLine() ?: break
            println(line)
        }
    }

    //  直接读取文本
//    val br2 = BufferedReader(FileReader("Chapter05.iml")).readText()
//    println(br2)

}

fun findPerson(): Person? {
    return null
}

fun Person.say() {
    println("say something")
    work()
}

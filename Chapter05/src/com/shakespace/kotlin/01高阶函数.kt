package com.shakespace.kotlin

import jdk.nashorn.api.tree.NewTree


/**
 * 高阶函数的基本概念
 *      传入或返回函数的函数
 *
 */
fun main(arg: Array<String>) {

    val args= arrayOf("aaa","bbb","","ddd")

    /**
     * 函数引用的几种方式
     */
    args.forEach(::println)
    //  类名和函数参数相同
    args.filter(String::isEmpty)
    //  需要使用实例才可以调用，String.isEmpty相当于传入自身
    // filter需要传入带一个参数的函数，如果使用 类名::函数名，相当于要传入两个参数
    val hello = Hello();
    args.filter(hello::speak)
    args.filter(Hi.Companion::speak)

//    val hellos = arrayOf(Hello(), Hello(), Hello())
//    hellos.filter (Hello::speakHello)
}

class Hi {
    companion object {
        fun speak(string: String): Boolean {
            println("hi speak $string")
            return false
        }
    }
}

class Hello {
    fun say() {
        println("hello")
    }

    fun speak(any: String): Boolean {
        println("hello speak $any")
        return false
    }

    fun speakHello(hello: Hello):Boolean{
        return false
    }
}

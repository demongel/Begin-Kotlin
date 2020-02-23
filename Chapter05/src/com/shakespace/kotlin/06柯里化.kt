package com.shakespace.kotlin

import java.awt.SystemTray
import java.io.OutputStream

/**
 * 柯里化
 * 柯里化（Currying）是把接受多个参数的函数变换成接受一个单一参数(最初函数的第一个参数)的函数，
 * 并且返回接受余下的参数且返回结果的新函数的技术
 *
 * 多元函数变换成一元函数调用链
 *
 */
fun hello(x: String, y: Int, z: Boolean): Boolean {
    return true
}

//fun curryHello(i: String): (y: Int) -> (z: Boolean) -> Boolean {
//
//}

fun log1(tag: String, target: OutputStream, message: Any?) {
    target.write("[$tag] $message \n".toByteArray())
}

//柯里化
fun log(tag: String) = fun(target: OutputStream) = fun(message: Any?) = target.write("[$tag] $message \n".toByteArray())

fun main(args: Array<String>) {

    log("hello")(System.out)("helloworld")

    ::log1.curried()("hello")(System.out)("helloworld")

    val logWithTag = ::log1.curried()("111")(System.out)
}

public fun <P1, P2, P3, R> Function3<P1, P2, P3, R>.curried() = fun(p1: P1) = fun(p2: P2) = fun(p3: P3) = this(p1, p2, p3)

/**
 *  固定一个参数，
 *  为 输入两个参数的函数 固定第二个参数，得到一个偏函数
 *      使用扩展方法，传入参数2
 *      返回一个输入参数P1 ，返回R 的函数
 *          该函数需要 传入P1 ，调用 自身，返回R
 */
fun <P1, P2, R> Function2<P1, P2, R>.partial2(p2: P2): Function1<P1, R> {
    return fun(p1: P1): R {
        return this(p1, p2)
    }

}

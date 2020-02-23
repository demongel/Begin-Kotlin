package com.shakespace.kotlin

import java.util.function.Function


/**
 *  函数复合    f((g)x)
 *   如何实现
 *   确认 函数1  ——》 输入类型1， 返回类型1
 *   确认 函数2 -----》 输入类型2（等于返回类型1），返回类型2
 *   得到复合函数 ———》 输入类型1， 返回类型2
 *
 */
val add5 = { i: Int -> i + 5 }

val multiply2 = { i: Int -> i * 2 }

fun main(args: Array<String>) {


    println(multiply2(add5(8)))

    val addAndMultiply = add5 andThen multiply2
    val multiplyAndAdd = add5 compose  multiply2


    println(addAndMultiply(8))
    println(multiplyAndAdd(8))
}

/**
 * infix  中缀表达式， 调用时不用点。
 *
 * Function1  表示传入一个参数的func
 *  其中p1 是传入的参数， p2 是返回值
 *
 *
 * 定义 复合函数
 *andThen 是 Function1的扩展方法
 *
 * 给 一个方法，添加了一个扩展方法
 *  调用时传入 另一个函数  类型是 Function1<P2, R>
 *  返回一个符合函数   类型是 Function1<P1, R>
 *      该函数会先 调用自身 得到一个结果
 *      再用传入的参数调用这个结果
 *
 *      三个参数
 *       函数1 是 输入P1 得到P2
 *       函数2 是输入P2 得到R
 *       复合的结果是， 输入P1 得到R  的一个函数
 */

infix fun <P1, P2, R> Function1<P1, P2>.andThen(function: Function1<P2, R>): Function1<P1, R> {
    return fun(p1: P1): R {
        return function.invoke(this.invoke(p1))
    }
}

/**
 *  当前函数先执行， 再用传入的函数执行 前者的结果
 */
infix fun <P1, P2, R> Function1<P2, R>.compose(function: Function1<P1 ,P2>): Function1<P1, R> {
    return fun(p1:P1): R {
       return  this.invoke(function.invoke(p1))
//        return function.invoke(this.invoke(p1))
    }
}

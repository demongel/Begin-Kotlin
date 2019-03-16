package com.shakespace.chapter03

/**
 * 运算符
 *本质上 就是函数
 * a..b  a.rangeTo(b)
 *
 * 任何类可以定义或者重载父类的基本运算符
 * 通过运算符对应的具名函数来定义
 * 对于参数个数有要求，对参数和返回值类型不作要求
 * 不能像scala 一样定义任意运算符
 */

class Complex (var real:Double,var  imaginary:Double){

    //  操作符重载
    operator fun plus(other:Complex):Complex{
        return Complex(real+other.real,imaginary+other.imaginary)
    }

    operator fun invoke():Double{
        return  Math.hypot(real,imaginary)
    }

    override fun toString(): String {
        return "$real+${imaginary}i"
    }

    //  定义一个中缀  只能有一个参数
    //  除了常规调用方式外  还可以写成 “a 方法名  参数” 的形式
    infix  fun  with (any: Any):Boolean{
        return false
    }
}

fun main(args: Array<String>) {

    val c1= Complex(2.0,3.0)
    val c2= Complex(2.0,5.0)

    println(c1+c2)  //  只对该类有效
    println(1+2)


    //  这里就可以使用定义好的with  通常在DSL中使用比较多
    println(c1.with(1))
    println(c1 with 1)
}
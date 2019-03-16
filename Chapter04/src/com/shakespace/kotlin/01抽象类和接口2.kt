package com.shakespace.kotlin

/**
 * 抽象类可以有成员变量
 * 方法可以有具体内容，也可以没有
 */

/**
 * kotlin 的接口 不能直接赋值，java可以
 * kotlin的接口方法 可以添加默认实现 ，有默认实现，子类可以不实现
 *
 * 继承抽象类，需要带抽象类的构造方法
 * 实现接口，需要在子类 构造函数中 重写成员变量
 *
 * 和java一样 ，单继承，多实现
 *
 * 接口，直观理解就是一种约定
 * 接口不能有状态
 * 必须由类对其实现后进行使用
 *
 * 抽象类，相当于实现了部分协议的半成品
 * 可以有状态（成员变量赋值），可以有方法实现
 * 必须由子类继承使用
 *
 */

interface  A{
     val  j:Int
    var i:Int
    // 添加open 才可以被重写
    open fun hello(){
        println(j)
    }

}

abstract class B{
    val j=1
    fun hello(){
        println(j)
    }
}

class D(override val j: Int, override var i: Int) : A{

}

class C : B() {

}

fun main(args: Array<String>) {
    //  实现了A之后，创建D时就需要参数
    val d= D(0,2)
//    val  d2 = D()
}
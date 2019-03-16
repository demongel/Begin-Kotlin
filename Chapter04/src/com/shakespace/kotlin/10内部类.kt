package com.shakespace.kotlin

/**
 *  java中 非静态内部类，持有外部类的状态
 *
 *  kotlin中默认是 静态内部类，加了inner关键字是非静态内部类
 *          如果内部类需要依赖外部类，考虑非静态内部类
 *          反之，使用静态内部类。
 *
 *          匿名内部类使用 object：
 *          匿名内部类可以继承、实现，与java不同
 */

fun main(args: Array<String>) {
    //  静态内部类调用
    val inner = Outter.Inner()

    //  非静态内部类  要用实例类调用
    val outter = Outter()
    val noStaticInner1 = outter.NoStaticInner()
//    val noStaticInner = Outter.NoStaticInner()

    val view = View()
    //  匿名内部类的写法  注意（冒号：）后可以继承
    //  匿名内部类实际会被编译成  l类似main$1 的形式
    view.onClickListener= object :OnClickListener{
        override fun onClick() {

        }
    }
}

class Outter {
    val a = 4

    //  默认相当于是java静态内部类
    class Inner {
        fun hello() {
        }
    }


    inner class NoStaticInner {
        fun hello() {
            //  注意写法
            println(this@Outter.a)
        }
    }
}

interface OnClickListener {
    fun onClick()
}

class View {
    var onClickListener: OnClickListener? = null
}
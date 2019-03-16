package com.shakespace.kotlin

import kotlin.reflect.KProperty

/**
 * 对于一些复杂的操作 可以放在懒加载中进行处理
 *
 * 属性代理：
 *      val/var <property name> :<Type> by <expression>
 *       代理者需要实现相应的setValue/getValue方法
 */
class Delegates {
    // 第一次被访问时 才会初始化
    val hello by lazy {
        "HelloWorld"
    }

    //  将get方法交给X()来实现
    val hello2 by X()

    var hello3 by X()
}

//  lazy 实现了getValue
//@kotlin.internal.InlineOnly
//public inline operator fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T = value


class X {
    private var value: String? = null

    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        println("getValue: $thisRef --> ${property.name}")
        return value ?: ""
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        println("setValue: $thisRef --> ${property.name}")
        this.value = value
    }
}

fun main(args: Array<String>) {
    val delegates = Delegates()
    println(delegates.hello)
    println(delegates.hello2)
    println(delegates.hello3)
}
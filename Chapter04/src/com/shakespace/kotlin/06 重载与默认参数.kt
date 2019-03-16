package com.shakespace.kotlin

/**
 * 重载：方法名相同，参数不同（类型  顺序）
 *
 * 默认参数
 *      java 的list，在remove() 可能产生歧义 （index和值）
 *      函数调用产生混淆时可以使用具名参数
 *
 *  有些方法重载，可以用默认参数的方式实现
 *  例如fun a(a:Int=0)  ,相当于实现了无参和单参的两个方法
 */
class Ori {
    @JvmOverloads
    fun a() {
    }

    //  返回值不属于方法签名
    fun a(a: Int, b: Int) {

    }

//    fun a(b: Int,a: Int){
//
//    }
}

class Overload {

}
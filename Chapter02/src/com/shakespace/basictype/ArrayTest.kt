package com.shakespace.basictype


// 基本类型都有自己的ArrayOf   longArrayOf   shortArrayOf 等 防止拆装箱的开销
val arrayOfInt : IntArray = intArrayOf(1,2,3,4,5,6,7)
val arrayOfIChar:CharArray = charArrayOf('H','e','l','l','o','W','o','r','l','d')

val arrayName : Array<Any> = arrayOf(1,2,3,4)


fun main(args: Array<String>) {
    //  通过区间切片
    arrayOfInt.slice(2..4)
}
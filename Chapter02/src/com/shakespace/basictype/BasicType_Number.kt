package com.shakespace.basictype


/**
 *
 */

/*
浮点型 Double 64
            Float 32

整型
        Long    64
        Int        32
        Short   16

字节
        Byte    8
 */

val anInt :Int = 8;
val anotherInt=0xFF
val moreInt = 0b00001001

val maxInt = Int.MAX_VALUE
val minInt = Int.MIN_VALUE

val maxLong = Long.MAX_VALUE
val minLong = Long.MIN_VALUE

val maxFloat = Float.MAX_VALUE;
val minFloat = Float.MIN_VALUE  //  是正数

val maxDouble = Double.MAX_VALUE
val minDouble = Double.MIN_VALUE

fun main(args: Array<String>) {
    println(anotherInt)
    println(moreInt)

    println(maxInt)
    println(Math.pow(2.0,31.0)-1)
    println(minInt)
    println(-Math.pow(2.0,31.0))

    println(1234L)
    println(maxLong)
    println(Math.pow(2.0,63.0)-1)
    println(minLong)
    println(-Math.pow(2.0,63.0))


    println(2.0000F)
    println(1E5F)   // 10000
    println(Float.POSITIVE_INFINITY)    //  正无穷
    println(Float.NEGATIVE_INFINITY)    // 负无穷
    println(Float.NaN)      //
    println(0.0f/0.0f )      //
    println(0.0f/0.0f == Float.NaN) //  false  没法比较
    println(Float.NaN == Float.NaN) // false

    println(maxFloat)
    println(minFloat)
    println(maxDouble)
    println(minDouble)

    println(Short.MAX_VALUE)
    println(Short.MIN_VALUE)

    println(Byte.MAX_VALUE)
    println(Byte.MIN_VALUE)


//    不可隐式转换
    var anInt = 5
    var aLong = anInt.toLong()


}
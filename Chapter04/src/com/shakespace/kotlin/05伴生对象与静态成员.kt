package com.shakespace.kotlin

/**
 * 每个类可以对应一个伴生对象
 * 伴生对象的成员全局唯一
 *      伴生对象的成员类似java的静态成员
 *
 *      静态成员考虑使用包级函数、变量替代
 *      使用JvmField和JvmStatic修饰，可以让java代码调用
 */
fun main(args: Array<String>) {

    Latitude.ofDouble(3.0)
//        Latitude.ofLatitude()
    println(Latitude.TAG)
}


class Latitude private constructor(val value: Double) {
    //  相当于静态方法
    companion object {
        //  添加注解  java就可以直接使用
        @JvmStatic
        fun ofDouble(double: Double): Latitude {
            return Latitude(double)
        }

        // java要通过Latitude.Companion 调用
        fun ofLatitude(latitude: Latitude): Latitude {
            return Latitude(latitude.value);
        }

        //  相当于静态变量
        @JvmField
        val TAG = "Latitude"
    }
}
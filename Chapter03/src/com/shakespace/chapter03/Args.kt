package com.shakespace.chapter03

/**
 *  默认参数：给函数参数提供默认值，调用如果不传，则使用默认值
 */
fun main(args: Array<String>) {

    //  给函数的实参附上形参   称为具名函数
    // 可以不按照原有的顺序赋值
    sum(arg1 =2,arg2 =3);
    sum(arg2 = 5,arg1 = 1)

    val array =  intArrayOf(1,2,3,4,5)

    //  *array  表示将数组展开，暂时只支持变长参数的场景
    //  spread operator   不能重载
    hello(*array)
}

fun sum (arg1:Int,arg2:Int) = arg1+arg2

//  变长参数  因为可以通过具名参数来指定顺序，
// 所以kotlin中的变长参数可以不是最后一个参数
fun hello(vararg  ints:Int){
    ints.forEach (::println)
}


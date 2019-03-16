package com.shakespace.chapter03

val arraySring = arrayOf("aaa","bbb","ccc","ddd")

/**
 *  {[参数列表]->[函数体，最后一行是返回值] }
 *  val sum = {a:Int，b:Int->a+b}
 *   类型：（Int，Int）->Int
 *   函数参数调用时 最后一个lambda可以移出去
 *   如果参数只有一个 lambda，那么小括号可以省略
 *   如果lambda只有一个参数，可以默认为it
 *   入参、返回值与形参一致的函数可用函数引用（::函数名）的方式作为实参传入
 */
val printHello ={
    println("hello")
}

val sum = { arg1:Int,arg2:Int ->
    println("这是lambda函数")
    println("$arg1+$arg2 = ${arg1+arg2}")
    arg1+arg2   //  最后一行的返回值 就是lambda表达式的返回值
}

fun main(args: Array<String>) {
    printHello();
    //  注意编译器中颜色  白色表示是方法（函数）
    //  以及，调用函数会显示参数名称，调用lambda不会显示
    println(sum(5,10))
    //  表示是指向lambda的变量  普通函数不能条用invoke方法
    sum.invoke(5,10)

    //  it指代循环时的元素
    arraySring.forEach {
        println(it)
    }
    //  ::println 表示将该方法作为参数传入
    //    arraySring.forEach(::println)
    //    arraySring.forEach (::printStr)

    //  通过@ 添加标签  类似于 continue
    arraySring.forEach name@{
        if(it == "aaa") return@name
        println(it)
    }

    println("结束")
    println(sum)    //(kotlin.Int, kotlin.Int) -> kotlin.Int
    println(::printStr) //fun printStr(kotlin.String): kotlin.Unit
    /**
     * lambda 表达式的参数从0~22 ，如果超过22个参数
     * 会报出找不到类型的异常
     */
}

/**
 * 如果同时存在一个sum的fun，以及一个sum的lambda的表达式
 * 优先执行sum  方法
 */
//fun sum(a:Int,b:Int):Int{
//    return a+b
//}   // （Int，Int）->Int

fun printStr(str:String){
    print(str)
}

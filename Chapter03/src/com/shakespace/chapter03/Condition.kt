package com.shakespace.chapter03


/**
 * 分支表达式
 * if 可以是表达式  有返回值
 *      但是赋值时  分支必须完备。
 *
 *  when 表达式
 *      加强switch    支持任意类型
 *      支持纯表达式分支条件  类似if
 *      表达式与完备性
 */
fun main(args: Array<String>) {
    println("请输入用户名")
    val name  = readLine()
    println("请输入密码")
    val password = readLine()

    val number =  4
    val result = if(number>3){
         number +1
    }else{
        number+10
    }

    println(result)


    // 可以做类型判断 或者区间判断
    when(password){
        "1" -> println("密码太简单")
        is String -> println("是 String")
        else ->{
            println("密码不是1")
        }

    }

}
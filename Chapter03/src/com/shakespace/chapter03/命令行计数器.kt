package com.shakespace.chapter03

fun main(args: Array<String>) {
    while (true) {
        println("请输入算式，类似3 + 4，用空格分割")
        val inputs = readLine();
        try {
            if (inputs != null) {
                val list = inputs.trim().split(" ")
                if(list.size<3){
                    throw IllegalArgumentException("请确认是否正确分割")
                }
                val arg1 = list[0].toDouble()
                val op = list[1]
                val arg2 = list[2].toDouble()

                //  字符串模板  整个表达式可以用{}
                println("$inputs= ${Operator(op).apply(arg1, arg2)}")
            }
        } catch (e: NumberFormatException) {
            println("确定输入的是数字么？")
        }catch (e:IllegalArgumentException){
            println(e.message)
        }catch (e:Exception){
            println("抱歉超出了程序处理范围")
        }
        println("继续计算 ？【Y】")
        val cmd = readLine()
        if (cmd == null || cmd.toLowerCase() != "y") {
            break
        }
    }
}


class Operator(op: String) {

    //  定义了一个变量  是一个lambda表达式
    // 在init中初始化
    val opFun: (left: Double, right: Double) -> Double

    //  使用when表达式，根据op 跟opFun赋值
    init {
        opFun = when (op) {
            "+" -> { left, right -> left + right }
            "-" -> { left, right -> left - right }
            "*" -> { left, right -> left * right }
            "/" -> { left, right -> left / right }
            "%" -> { left, right -> left % right }
        //  else 为了保证完备
            else -> {
                throw IllegalArgumentException("不能识别的操作符： $op")
            }
        }
    }

    fun apply(left: Double, right: Double): Double {
        return opFun(left, right)
    }
}
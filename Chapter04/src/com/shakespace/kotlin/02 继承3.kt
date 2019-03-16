package com.shakespace.kotlin

/**
 * 默认的类和方法都是final的 继承 或重写 要加open关键字
 * 抽象类和接口本身就是open的
 *  不同接口存在相同方法的问题
 */
/**
 * 如果接口方法返回值不同 无法处理
 */
class  Canary(val i: Int) :Bird1,Bird2{
    override fun fly(): Int {
        if(i in 6..9){
            return super<Bird1>.fly()
        }else if (i in 10..20){
            return super<Bird2>.fly()
        }
        return  20
    }
}

fun main(args: Array<String>) {
    val canary = Canary(6)
    println(canary.fly())

    val canary2 = Canary(16)
    println(canary2.fly())
}

interface Bird1{
    fun fly() =2
}

interface Bird2{
    fun fly() =1
}




package com.shakespace.kotlin

/**
 *  data 默认实现了copy  toString hashCode 等方法
 *  componentN方法
 *  使用data关键字，会变成final类，不能继承
 *          自动实现了私有属性，公有get/set方法
 *   需要使用allOpen插件
 *   同时如果需要实现无参构造方法，需要使用noArg插件
 */
data class Bean(var age: Int, var name: String) {

}

fun main(args: Array<String>) {

    val  bean= Bean(12,"tom")
    println(bean)   //如果不加data Bean@6adca536
    println(bean)   //如果加data  Bean(age=12, name=tom)
    //  增加了component的概念，对应构造的数据
    val (a,b) = bean;
    println("$a === ${bean.component1()}")
    println(b)
}

package com.shakespace.chapter03

/**
 * 属性： 成员变量，类范围内的变量
 * 方法：成员函数，类范围内的函数
 *
 * 函数和方法的区别：
 *      函数强调功能本身，不考虑从属
 *      方法的称呼通常是以类的角度出发
 *
 *  构造方法中用 val  var修饰的都是属性
 *  类内部也可以定义属性
 *
 *  属性的初始化尽量在构造方法中完成
 *  无法在构造方法中初始化，可以降级为局部变量
 *  var 用lateinit延迟初始化
 *  val 用 by lazy
 *
 *  可控类型 谨慎用null初始化
 *
 */
class Woman(age:Int,name:String){

    var age =  age
    get() {
        println("this is age get")
        return field
    }
    private var name = name
        set(value) {
            println("value")
        field = value
    }

    //  var 通过 lateinit 修饰 放到后面加载
    lateinit var string: String //  延迟加载

    val e:String by lazy {
        println("init e")
         "thiis is a lazy string"
    }

    fun say(name:String){
        println("${this.name} 说 ${name}")
    }

    fun eat (name:String){
        println("${this.name} 吃 ${name}")
    }

}


fun main(args: Array<String>) {

    val aWoman= Woman(14,"Jasmine")
    aWoman.say("today is a good day")
    aWoman.eat("apple and orange")
    aWoman.string = "init here"
    println(aWoman.e)
}
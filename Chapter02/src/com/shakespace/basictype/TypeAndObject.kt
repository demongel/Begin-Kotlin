package com.shakespace.basictype

// open 后 可以被继承
open class Human(var age: Int, var name: String) {
    init {
        //  创建对象时 自动调用
        println("创建了一个${this.javaClass.simpleName}的对象,年龄：$age, 姓名：$name ")
    }
}

// 构造函数必须带有类型   使用 ： (冒号)  继承
// 所有的类都是Any的子类   Any和Object 不同
class Man(age: Int, name: String) : Human(age, name) {
    init {
        //  隐式调用父类的初始化方法 再调用自身的初始化方法
        println("${this.javaClass.simpleName}的 初始化方法")
    }
}

class Woman(age: Int, name: String) : Human(age, name) {
    init {
        println("${this.javaClass.simpleName}的 初始化方法")
    }
}


fun main(args: Array<String>) {
//    val human = Human(25,"Tom")

    val aMan = Man(35, "Jack")
    val aWoman = Woman(15, "Lin")


    println(aMan is Human)

    val man2: Human = Human(1, "222")
    //  直接使用 as 会抛出类型转换异常  使用as？ 可以返回null
    val man3: Man? = man2 as? Man

    println(man3?.name)

    /**
     *
    val notNull:String = null   错误  不能为null
    val nullable:String? = null 可以为null
    notNull.length     可以直接使用
    nullable.length     错误 不能直接使用
    nullable!!.length    强制拆包   可以使用
    nullable?.length     正确
     */
}


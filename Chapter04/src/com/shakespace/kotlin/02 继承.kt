package com.shakespace.kotlin

/**
 * 默认的类和方法都是final的 继承 或重写 要加open关键字
 * 抽象类和接口本身就是open的
 *
 * class D： B(),A,C
 *  继承类的时候实际上调用了父类的构造方法
 *
 *  接口代理可以直接指定方法的执行对象
 *
 * 接口方法冲突，必须签名一致且返回值相同才可以处理
 *          super<父类（接口）名>.方法名
 */

abstract class Person(age: Int) {
    open fun work() {

    }
}

class Teacher(age: Int) : Person(age) {
    override fun work() {
        super.work()
        println("老师在上课")
    }
}

class Doctor (age: Int): Person(age) {

    override fun work() {
        super.work()
        println("医生在做手术")
    }
}
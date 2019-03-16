package com.shakespace.kotlin

/**
 * 这里by 的意思是代理，
 * 即在seniorManager中实现的Driver方法，用driver对象来实现
 * 实现的Writter方法，用witter对象来实现
 */
class SeniorManager (driver: Driver,writter: Writter) :Driver by driver,Writter by writter{

}

fun main(args: Array<String>) {
    val driver = CarDriver()
    val writter= ArtWritter()
    val seniorManager= SeniorManager(driver,writter)

    seniorManager.drive()
    seniorManager.write()
}

interface Driver{
    fun drive()
}

interface Writter{
    fun write()
}

class CarDriver :Driver{
    override fun drive() {
        println("正在开车")
    }
}

class ArtWritter :Writter{
    override fun write() {
        println("在写文章")
    }
}

class  Manager :Driver,Writter{
    override fun write() {

    }

    override fun drive() {
    }
}





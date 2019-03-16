package com.shakespace.kotlin

class House
class Flower

class Countyard{
    private val house = House()
    private val flower = Flower()

    //  子类可见
    protected  val pro= 2000
    //  模块内可见  最好不要在和java混编时使用
    internal  val inter = 100

//    default  包内可见
}


package com.shakespace.kotlin

/**
 * 抽象类可以有成员变量
 * 方法可以有具体内容，也可以没有
 */
interface InputDevice{
    fun input(event:Any)
}

interface  USBInputDevice :InputDevice

interface  BLEInputDevice:InputDevice

abstract  class USBMouse : USBInputDevice{
    override fun input(event: Any) {

    }
}

class  LogicUSBMouse : USBInputDevice{
    override fun input(event: Any) {

    }
}


class Computer{
    fun addInputDevice(inputDevice: InputDevice){

    }
}

fun main(args: Array<String>) {

}
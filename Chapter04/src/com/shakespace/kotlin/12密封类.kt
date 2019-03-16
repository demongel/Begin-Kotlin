package com.shakespace.kotlin

/**
 * 密封类：子类有限的类
 *          只能定义在内部类或者同一个文件中（构造方法私有）
 *          可用于限制随意扩展
 */
sealed class Player{

    class Play(val url:String,val position:Long=0):Player()

    class Seek(val position:Long=0):Player()

    class Pause:Player()

    class Resume:Player()

    class Stop:Player()
}
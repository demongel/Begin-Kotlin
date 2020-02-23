package com.shakespace.kotlin

import java.io.File

fun main(args: Array<String>) {

    val text = File("Chapter05.iml").readText();

    val map = HashMap<Char,Int>()

    text.toCharArray().filterNot (Char::isWhitespace)
            .groupBy { it }
            .map {
                it.key to it.value.size
            }
            .forEach (::println)


    //  方法1
//            .forEach {
////                map.get()   返回可空类型
////                map.getValue()   检查key 检查默认值， 否则抛出异常
//
////                val count = map[it]
////                if(count ==null) map[it] =1
////                else map[it] = count +1
//
//            }

//    map.forEach(::println)

}
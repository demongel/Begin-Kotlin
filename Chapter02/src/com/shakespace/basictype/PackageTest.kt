package com.shakespace.basictype

//  导包可以使用别名
import com.shakespace.basictype.moon.Moon as BigMoon
import com.shakespace.basictype.star.Moon as BigStar

fun main(args: Array<String>) {

    val moon: BigMoon = BigMoon()

    val star: BigStar = BigStar();
}
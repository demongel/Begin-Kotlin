package com.shakespace.basictype

// 空类型安全

fun main(args: Array<String>) {

//        ?: 如果前面为null 则执行后面代码，否则返回值
//    var name =  getName()?:return
//    println(name.length)

    val aString: String? = "safe"
//    智能转换
    if (aString != null) {
        println(aString.length)
    }
    //  !! 表示强制解包
    println(aString!!.length)

}

//  带？ 是可空类型，不带问号 不能返回null
fun getName(): String? {

    return null
}

//  返回可空和不可空 不能算重载
//fun getName():String{
//    return ""
//}

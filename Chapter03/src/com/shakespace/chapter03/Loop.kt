package com.shakespace.chapter03

/**
 * 循环语句
 *  for  循环的本质是 对象支持迭代，有对应的next和hasNext方法
 *
 *  while  do while   break  continue 和java 没有区别
 *    可以使用  名称@  的方式给循环加标签，使用break @名称，跳出对应的循环。
 */

val array = intArrayOf(1,2,3,4,5,6,7,8)
fun main(args: Array<String>) {
    // 带 index 的循环
  for ( (index,value) in array.withIndex()){
      println("$index --> $value")
  }
    for (item in array.withIndex()){
        println("${item.index} ---> ${item.value}")
    }

    var x = 1
    while (array[x] <4){
        println(array[x])
        x++
    }

    out@ for (x in array){
        inner@ while (x<4){
            if(x*x>10){
                //  如果只是break  跳出while层，如果加上标签，跳出for
                break@out
            }
        }
    }
}
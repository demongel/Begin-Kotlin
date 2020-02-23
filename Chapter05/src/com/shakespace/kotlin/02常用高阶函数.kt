package com.shakespace.kotlin

/**
 *
 */
fun main(args: Array<String>) {
    /**
     * map 映射操作
     */
    val list = listOf(1, 3, 5, 6, 8, 10, 22)
    var newList = ArrayList<Int>()
//      类似java的写法
//    list.forEach {
//        val  newInt =  it*2+2
//        newList.add(newInt)
//    }

    newList = list.map { it * 2 + 3 } as ArrayList<Int>
    //  转成Double
    val newList2 = list.map(Int::toDouble)
//    newList.forEach(::println)
//    newList2.forEach(::println)

    /**
     * flatMap   摊平 变换
     */
    //  定义一个IntRange的集合
    val nums = listOf(1..10, 2..5, 101..110)
    nums.forEach(::println)
//    val flatList = nums.flatMap { it }
    // 摊平操作，迭代nums中的intRange
    // 对intRange的操作是 取出元素加上No.
    /**
     * Returns a single list of all elements yielded from results of [transform] function being invoked on each element of original collection.
     * 返回一个包含所有元素的集合
     *  元素来自于，原有集合的所有元素调用transform方法的结果
     */
    val flatList = nums.flatMap { intRange ->
        intRange.map { element ->
            "No. $element"
        }
    }
//    flatList.forEach(::println)
    val intList = nums.flatMap {
        it
    }

    /**
     * reduce   fold    foldRight
     */
    // 对调用者做迭代，传入上次的迭代结果和当前的迭代元素，获得最终的迭代结果
    //    println(intList.reduce { acc, i -> acc+i })
    val range = 1..100
    println(range.reduce { acc, i -> acc + i })   // 5050
    //  fold 提供一个初始值  initial  不限制类型，如果是字符串，会变成拼接
    println(range.fold(100) { acc, i -> acc + i })    // 5150
    // 反向拼接  可以使用foldRight，但是需要注意的是，
    // fold是iterater子类的方法，foldRight是List子类的方法
    // 以及参数顺序不同，i在前，acc在后
    println(intList.foldRight("") { i, acc -> acc + i })    // 5150


    /**
     * filter ：  过滤出符合条件的结果
     * take：取n个
     * takewhile： 遇到第一个不符合条件的就结束
     * take和takewhile有对应的last的方法，即反向
     */
    // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 2, 3, 4, 5, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110]
    val filters = intList.filter { it % 2 == 0 }
//    println("filter : $filters")    // 得到偶数集合，即过滤时返回true的结果
//    println(intList.take(5))
//    println(intList.takeWhile { it < 80 })
//    println(intList.takeLastWhile { it < 80 })  //  拿到[] 因为第一个就不符合


    /**
     * joinToString
     */
    //  拼接字符串  传入一个分隔符  还可以加前缀 后缀等
    //    println((1..6).joinToString (",","No."))
    // 打印数组效果
    //    println((1..6).joinToString (",","[","]"))


}

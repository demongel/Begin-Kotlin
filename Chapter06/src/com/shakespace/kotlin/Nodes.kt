package com.shakespace.kotlin

/**
 * 传入一个扩展方法，返回一个Tag
 */
fun html(block: Tag.() -> Unit): Tag {

    return Tag("html").apply(block)

//    return Tag("html").apply {
//        block(this)
//    }

}

class StringNode(val content: String) : Node {
    override fun render() = content
}
package com.shakespace.kotlin

import kotlin.coroutines.experimental.startCoroutine
import kotlin.coroutines.experimental.suspendCoroutine


fun startCoroutine(block: suspend () -> Unit) {
    block.startCoroutine(BaseContinuation())
}


suspend fun loadImage(url: String) = suspendCoroutine<ByteArray> { continuation ->

    Thread.sleep(1000)

    println("1")

    Thread.sleep(1000)

    println("2")

}
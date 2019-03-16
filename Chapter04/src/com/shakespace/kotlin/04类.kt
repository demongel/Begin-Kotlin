package com.shakespace.kotlin

/**
 * 转换成java类  是一个单例
 *    public static final MusicPlayer INSTANCE;
        static {
            MusicPlayer var0 = new MusicPlayer();
            INSTANCE = var0;
        }

    object : 只有一个实例的类
            不能自定构造方法
            可以实现接口 继承父类
            本质上就是单例最简单的实现模式
 */
object MusicPlayer{
    var state=0
    fun play(url:String){

    }

    fun  stop(){}
}

fun main(args: Array<String>) {
     MusicPlayer.state=1

    MusicPlayer.stop()

}
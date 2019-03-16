package com.shakespace.basictype;

public class AutoBox {

    public static void main(String...args){
        int a = 5;
        Integer anInteger =5;

        char [] chars = {'a','b','c'};
        int [] ints = {1,2,3};
        //  char 数组可以直接打印  因为有对应的重载方法 int之类的不行
        System.out.print(chars);
        System.out.print(ints);

    }

}

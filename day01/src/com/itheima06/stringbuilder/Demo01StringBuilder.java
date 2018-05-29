package com.itheima06.stringbuilder;
/*
   java.lang.StringBuilder
       可变的字符序列，字符串缓冲区，可以理解为一个容器用来存放字符串的，提供了在自己空间中操作字符串的方法

       构造
        - public StringBuilder()：构造一个空的StringBuilder容器。
        - public StringBuilder(String str)：构造一个StringBuilder容器，并将字符串添加进去。

 */
public class Demo01StringBuilder {

    public static void main(String[] args) {
        // 使用空参创建StringBuilder对象
        StringBuilder sb = new StringBuilder();
        System.out.println("sb中的内容为："+sb);
        System.out.println("带参。。。。。");
        // 使用带参构造创建StringBuilder对象
        StringBuilder sb2 = new StringBuilder("金刚葫芦娃");
        System.out.println("sb2中的内容为："+sb2);
    }
}

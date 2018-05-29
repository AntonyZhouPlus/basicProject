package com.itheima06.stringbuilder;

import com.itheima01.object.Person;

/*
  StringBuilder常用功能：
     - public StringBuilder append(...)：添加任意类型数据的字符串形式，并返回当前对象自身。

     - public String toString()：将当前StringBuilder对象转换为String对象。

 */
public class Demo02StringBuilder {

    public static void main(String[] args) {
//        StringBuilder sb = new StringBuilder();
        // 将任意类型当做字符串形式进行追加
//        sb.append(123);
//        sb.append(3.14);
//        sb.append("哈哈哈哈");
//        sb.append(new Person(19,"迪丽热巴"));
//        sb.append(new Object());
//        System.out.println(sb);

//        StringBuilder sb2 = sb.append("haklhajahakjaj");
//
//        System.out.println(sb2);
//        System.out.println(sb);
//        System.out.println(sb==sb2);
//        // 追加操作 返回当前对象自身  追加操作都是在自己的空间中完成的。

        StringBuilder sb3 = new StringBuilder();

        sb3.append(123).append("真的可以哦").append(new Person(12,"小明"));
        // 链式编程  如果调用一个方法返回的是一个对象 那么就可以调用这个对象中的方法

        System.out.println(sb3);
    }
}

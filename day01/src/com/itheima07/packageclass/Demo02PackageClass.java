package com.itheima07.packageclass;

import java.util.ArrayList;

/*
  从JDK1.5开始
     装箱  拆箱的 过程 我们程序员可以省略写了
     因为 由编译器去完成
 */
public class Demo02PackageClass {

    public static void main(String[] args) {
        // 自动装箱的操作
       Integer a = 5;//隐含了 也就是说  编译器完成了 Integer.valueOf(5)这个操作

        // 自动拆箱
       int b = a;// 隐含了 也就是说 编译器 完成了  a.intValue();

        ArrayList<Integer>  list = new ArrayList<>();

        list.add(123);//隐含了自动装箱







    }
}

package com.itheima07.packageclass;
/*
  基本类型与包装类之间 转换

    装箱  基本类型转换成对应的包装类

    拆箱  包装类转换成对应的基本类型

    以Integer---int
 */
public class Demo01PackageClass {

    public static void main(String[] args) {
        // 装箱的操作
        int a = 10;
        Integer b = new Integer(a);//装箱的过程1 通过new的形式
        Integer c = Integer.valueOf(a);//装箱过程2 通过静态valueOf方法

        // 拆箱
        int d = b.intValue();






    }
}

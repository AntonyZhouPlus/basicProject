package com.itheima01.object;
/*
  Object
   boolean equals(Object obj)方法
   比较两个对象是否“相等”

   默认  指的是两个对象的 地址值 是否相同
     Object类中源码
      public boolean equals(Object obj) {
        return (this == obj);
      }
   自定义
     我们开发时候 往往认为属性都一样的 对象 是相同的
       那么我们就需要重写 equals方法

       使用快捷键生成equals方法就可以了
       alt+insert  equals() 和 hashCode()

       重写之后 就是 比较两个对象中的内容是否相同的。

 */
public class Demo02Object {

    public static void main(String[] args) {
       // 创建Person对象
       Person p1 = new Person(5,"葫芦娃");
       Person p2 = new Person(7,"大力娃");
       Person p3 = new Person(5,"葫芦娃");

       System.out.println("p1.equals(p2):"+p1.equals(p2));
       System.out.println("p1.equals(p3):"+p1.equals(p3));
    }
}

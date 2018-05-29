package com.itheima01.object;

/*
   java.lang.Object类 是所有类的基类，父类
     换句话说 所有的类直接或间接继承Object
     通过我们学习过的面向对象  也就是说Object中定义的功能，所有的类都具备

     总共有11个方法
       今天介绍两个
        public String toString() 该对象的字符串表示形式

        public boolean equals(Object obj) 比较两个对象是否“相等”

        toString方法
          Object类中定义的  java.lang.Object@50cbc42f
                           类的全路径+@+十六进制的哈希地址值

         该对象的字符串表示形式,用字符串来表示对象
         怎么表示更好呢？
         我们开发的时候 往往展示对象的成员属性
         也就是说我们会重写自定义类型的toString

         因为往往要做这件事情 所以我们就有快捷键
         alt+insert 选择 toString

         如果重写了那么就表示对象的内容 （使用快捷键）

      Object 中
         构造 Object()
 */
public class Demo01Object {

    public static void main(String[] args) {
//        // 创建一个Object对象
//        Object obj = new Object();
//
//        System.out.println("obj的toString方法："+obj.toString());

        // 创建一个Person对象
        Person p = new Person(18,"马尔扎哈");
        Person p2 = new Person(16,"古力娜扎");

        System.out.println(p.toString());
        System.out.println(p2.toString());
        // 没有重写toString的时候 结果是 Person@75412c2f
        // 重写之后Person{age=18, name='马尔扎哈'}


       // 在我们直接使用输出语句输出对象名的时候,其实通过该对象调用了其toString()方法。
        System.out.println(p);
        System.out.println(p2);
    }
}

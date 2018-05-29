package com.zhouhang.preparation4test.test02;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/23 16:10
 * 定义鸭子类(Duck),继承Poultry类
成员方法:
①重写父类的void eat()方法
a)输出格式: XX岁的YY的鸭子在吃鱼
② 特有方法:void swim()  游泳方法
a)输出格式:  XX岁的YY的鸭子在游泳
提供空参和带参构造方法

 */
public class Duck extends Poultry {
    public Duck() {
    }

    public Duck(String color, int age) {
        super(color, age);
    }

    @Override
    public void eat() {
        System.out.println(getAge()+"岁的"+getColor()+"鸭子在吃鱼");
    }

    public void swimming(){
        System.out.println(getAge()+"岁的"+getColor()+"鸭子在游泳");
    }
}

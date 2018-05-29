package com.zhouhang.preparation4test.test02;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/23 16:06
 * 成员方法:
①重写父类的void eat()方法
输出格式::  XX的YY公鸡在啄米
②特有方法:  打鸣(void crow())
输出格式::  XX岁的YY公鸡在打鸣
 */
public class Cock extends Poultry{
    public Cock() {
    }

    public Cock(String color, int age) {
        super(color, age);
    }

    @Override
    public void eat() {
        System.out.println(getAge()+"岁的"+getColor()+"公鸡在啄米");
    }

    public void crow(){
        System.out.println(getAge()+"岁的"+getColor()+"公鸡在打鸣");
    }
}

package com.zhouhang.preparation4test.test04;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/24 8:58
 * 定义老师类(Teacher)继承Person类  提供: 无参,有参构造方法
 * 成员方法:实现抽象方法void eat()
 * 输出格式: 年龄为XX岁YY老师,正在吃工作餐
 */
public class Teacher extends Person {
    public Teacher() {
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("年龄为" + getAge() + "岁" + getName() + "老师,正在吃工作餐");
    }
}

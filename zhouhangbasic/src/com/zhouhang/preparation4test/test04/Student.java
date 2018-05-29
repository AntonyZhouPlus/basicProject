package com.zhouhang.preparation4test.test04;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/24 9:01
 * 定义学生类(Student),继承人类(Person)  提供: 无参,有参构造方法
 * 成员方法:实现抽象方法void eat()
 * 输出格式: 年龄XX岁的 YY在吃学生餐
 */
public class Student extends Person {
    public Student() {
    }

    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("年龄" + getAge() + "岁的 " + getName() + "在吃学生餐");
    }
}

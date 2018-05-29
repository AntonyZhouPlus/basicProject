package com.zhouhang.preparation4test.test04;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/24 8:59
 * 定义运动老师类(SportTeacher)继承老师类(Teacher)实现运动接口
 * 成员方法: 实现void playBasketball的抽象方法
 * 输出格式: 年龄为XX岁 YY老师在打篮球
 * 提供: 无参,有参构造方法
 */
public class SportTeacher extends Teacher implements Sport {
    public SportTeacher() {
    }

    public SportTeacher(String name, int age) {
        super(name, age);
    }

    @Override
    public void playBasketball() {
        System.out.println("年龄为" + getAge() + "岁 " + getName() + "老师在打篮球");
    }
}

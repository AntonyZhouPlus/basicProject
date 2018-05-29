package com.zhouhang.preparation4test.test04;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/24 9:02
 * 定义运动学生类(SportStudent类),继承Student类,实现Sport接口
 * 提供: 无参,有参构造方法
 * 成员方法: 实现void playBasketball的抽象方法
 * 输出格式: 年龄为XX岁 YY 学生在打篮球
 */
public class SportStudent extends Student implements Sport {
    public SportStudent() {
    }

    public SportStudent(String name, int age) {
        super(name, age);
    }

    @Override
    public void playBasketball() {
        System.out.println("年龄为" + getAge() + "岁 " + getName() + " 学生在打篮球");
    }
}

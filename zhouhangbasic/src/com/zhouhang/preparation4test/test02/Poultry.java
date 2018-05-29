package com.zhouhang.preparation4test.test02;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/23 16:01
 * 定义家禽类(Poultry)
成员变量(私有):  颜色(color：String类型),年龄(age：int类型)
成员方法:  吃饭(void eat())
输出格式:  XX岁的YY家禽在吃饭
提供空参和带参构造方法
提供setXxx和getXxx方法
 */

public class Poultry {
    private String color;
    private int age;

    public Poultry() {
    }

    public Poultry(String color, int age) {
        this.color = color;
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat() {
        System.out.println(age + "岁的" + color + "家禽在吃饭");
    }
}

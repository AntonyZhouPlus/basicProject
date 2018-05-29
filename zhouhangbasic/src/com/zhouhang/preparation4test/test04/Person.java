package com.zhouhang.preparation4test.test04;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/24 8:55
 * 定义抽象人类(Person)
 * 属性: 姓名(name:String类型),年龄(age：String类型)
 * 抽象方法: void eat()
 * 提供:无参,有参构造方法和setters和getters方法
 * 定义抽象人类(Person)
 */
public abstract class Person {
    private String name;
    private int age;

    public Person() {

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void eat();
}

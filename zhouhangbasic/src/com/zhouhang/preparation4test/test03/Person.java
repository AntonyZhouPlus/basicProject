package com.zhouhang.preparation4test.test03;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/23 16:56
 */
public abstract class Person {
    private String name;
    private int age;
    private double height;
    public abstract void say(String content);

    public Person() {
    }

    public Person(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
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

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}

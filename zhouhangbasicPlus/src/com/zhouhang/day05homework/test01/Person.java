package com.zhouhang.day05homework.test01;

/**
 * com.zhouhang.day05homework.Test01
 *
 * @author zhouhang
 * @date 2018/6/4 下午8:10
 * 1. 定义一个Person类，有name age属性，生成getter setter方法，无参有参构造
 * 2. 在setAge方法中，如果传入的年龄小于0或者大于200，则认为年龄不合法，抛出一个自定义的运行时异常。
 * 要求：异常的名称为：IllegalAgeException,异常的原因为：年龄不合法
 */
public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        setAge(age);
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
        if (age < 0 || age > 200) {
            throw new IllegalAgeException("年龄不合法");
        }
        this.age = age;
    }
}

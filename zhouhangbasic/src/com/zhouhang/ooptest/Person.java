package com.zhouhang.ooptest;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/21 19:20
 */
public  class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public  void eat(){
        System.out.println("吃饭");
    }


}

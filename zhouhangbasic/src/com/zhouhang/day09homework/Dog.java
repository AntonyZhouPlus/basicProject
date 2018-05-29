package com.zhouhang.day09homework;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/20 21:37
 */
public class Dog extends BaseAnimal {
    public Dog() {
    }

    public Dog(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String something) {
        System.out.println("狗在吃"+something);
    }

    public void lookHome(){
        System.out.println("狗在看家");
    }
}

package com.zhouhang.day09homework;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/20 21:38
 */
public class Cat extends BaseAnimal {
    public Cat() {
    }

    public Cat(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String something) {
        System.out.println("猫在吃"+something);
    }
    public void catchMouse(){
        System.out.println("逮老鼠");
    }
}

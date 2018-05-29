package com.zhouhang.day10homework02;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/23 9:15
 */
public class Sheep extends Animal{

    public Sheep() {
    }

    public Sheep(int age) {
        super(age);
    }

    @Override
    public void eat() {
        System.out.println("羊吃草");
    }
}

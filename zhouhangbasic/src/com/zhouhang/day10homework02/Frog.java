package com.zhouhang.day10homework02;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/23 9:15
 */
public class Frog extends Animal implements ISwimming{
    public Frog() {
    }

    public Frog(int age) {
        super(age);
    }

    @Override
    public void eat() {
        System.out.println("吃虫子");
    }

    @Override
    public void swimming() {
        System.out.println("蛙泳");
    }
}

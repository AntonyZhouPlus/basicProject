package com.zhouhang.day10homework02;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/23 9:13
 */
public class Dog extends Animal implements ISwimming{
    public Dog() {
    }

    public Dog(int age) {
        super(age);
    }

    @Override
    public void eat() {
        System.out.println("啃骨头");
    }

    @Override
    public void swimming() {
        System.out.println("狗刨");
    }
}

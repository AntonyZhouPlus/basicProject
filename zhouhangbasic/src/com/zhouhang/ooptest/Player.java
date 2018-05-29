package com.zhouhang.ooptest;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/21 19:22
 */
public abstract class Player extends Person {
    public Player() {
    }

    public Player(String name, int age) {
        super(name, age);
    }

    public abstract void learn();

}

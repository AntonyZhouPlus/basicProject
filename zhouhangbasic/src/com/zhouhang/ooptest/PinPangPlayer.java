package com.zhouhang.ooptest;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/21 19:26
 */
public class PinPangPlayer extends Player{
    public PinPangPlayer() {
    }

    public PinPangPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void learn() {
        System.out.println("学乒乓球");
    }

}

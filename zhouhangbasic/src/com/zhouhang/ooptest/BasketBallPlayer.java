package com.zhouhang.ooptest;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/21 19:27
 */
public class BasketBallPlayer extends Player implements InterLearnEnglish {

    public BasketBallPlayer() {
    }

    public BasketBallPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void learn() {
        System.out.println("学篮球");
    }

    @Override
    public void learnEnglish() {
        System.out.println("篮球运动员学习英语");
    }
}

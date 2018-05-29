package com.zhouhang.ooptest;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/21 19:29
 */
public class BasketBallCoach extends Coach implements InterLearnEnglish {
    public BasketBallCoach() {
    }

    public BasketBallCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("教篮球");

    }

    @Override
    public void learnEnglish() {
        System.out.println("篮球教练学习英语");
    }
}

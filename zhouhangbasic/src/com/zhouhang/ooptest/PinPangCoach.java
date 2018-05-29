package com.zhouhang.ooptest;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/21 19:28
 */
public class PinPangCoach extends Coach {
    public PinPangCoach() {
    }

    public PinPangCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("教乒乓球");

    }

}

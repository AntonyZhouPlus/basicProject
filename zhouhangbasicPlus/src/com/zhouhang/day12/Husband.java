package com.zhouhang.day12;

/**
 * com.zhouhang.day12
 *
 * @author zhouhang
 * @date 2018/6/14 下午5:19
 */
public class Husband {
    private void buyHouse() {
        System.out.println("买套房子");
    }

    public void marry(Richable r) {
        r.buy();
    }

    public void beHappy() {
        marry(this::buyHouse);
    }
}

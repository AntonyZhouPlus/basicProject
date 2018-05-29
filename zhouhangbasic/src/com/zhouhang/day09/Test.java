package com.zhouhang.day09;

import java.util.ArrayList;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/20 15:02
 */
public class Test {
    public static void main(String[] args) {
        Manager m = new Manager();
        Member one = new Member();
        Member two = new Member();
        Member three = new Member();

        m.setMoney(200);

        ArrayList<Integer> hongbao = m.send(100, 3);
        one.open(hongbao);
        two.open(hongbao);
        three.open(hongbao);

        m.show();
        one.show();
        two.show();
        three.show();


    }
}

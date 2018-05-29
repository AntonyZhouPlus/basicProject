package com.zhouhang.day09;

import java.util.ArrayList;
import java.util.Random;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/21 14:46
 */
public class Member extends Person {
    public Member() {
    }

    public Member(int money, String name) {
        super(money, name);
    }

    public void open(ArrayList<Integer> list) {
        Random rd = new Random();
        int index = rd.nextInt(list.size());

        int get = list.remove(index);

        setMoney(get + getMoney());
    }
}

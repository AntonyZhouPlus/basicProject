package com.zhouhang.day09;

import java.util.ArrayList;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/21 14:38
 */
public class Manager extends Person {
    public Manager() {
    }

    public Manager(int money, String name) {
        super(money, name);
    }

    public ArrayList<Integer> send(int totalMoney, int count) {
        if (totalMoney > super.getMoney()) {
            System.out.println("钱不够");
            return null;
        }

        ArrayList<Integer> list = new ArrayList<Integer>();

        super.setMoney(super.getMoney() - totalMoney);
        for (int i = 0; i < count - 1; i++) {
            list.add(totalMoney / count);
        }

        list.add(totalMoney / count + totalMoney % count);

        return list;
    }
}

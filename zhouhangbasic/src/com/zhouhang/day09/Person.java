package com.zhouhang.day09;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/21 14:37
 */
public class Person {
    private int money;
    private String name;


    public Person() {
    }

    public void show() {
        System.out.println("余额" + money);
    }

    public Person(int money, String name) {
        this.money = money;
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

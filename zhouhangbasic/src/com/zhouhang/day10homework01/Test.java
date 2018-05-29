package com.zhouhang.day10homework01;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/22 10:47
 */
public class Test {
    public static void main(String[] args) {
        useLaptop();
    }

    public static void useLaptop() {
        Laptop laptop = new Laptop();
        Iusb mouse = new Mouse();
        Iusb keyboard = new Keyboard();
        laptop.open();
        laptop.useUSB(mouse);
        laptop.useUSB(keyboard);
        laptop.close();
    }
}

package com.zhouhang.day10homework01;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/22 10:42
 */
public class Keyboard implements Iusb {
    @Override
    public void open() {
        System.out.println("键盘开启");
    }

    @Override
    public void close() {
        System.out.println("键盘关闭");
    }

    public void type() {
        System.out.println("键盘打字");
    }
}

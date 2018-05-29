package com.zhouhang.day10homework01;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/22 10:40
 */
public class Mouse implements Iusb{
    @Override
    public void open() {
        System.out.println("鼠标开启");
    }

    @Override
    public void close() {
        System.out.println("鼠标关闭");
    }

    public void click(){
        System.out.println("鼠标点击");
    }
}

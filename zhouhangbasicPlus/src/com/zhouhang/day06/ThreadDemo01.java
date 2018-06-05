package com.zhouhang.day06;

/**
 * com.zhouhang.day06
 *
 * @author zhouhang
 * @date 2018/6/5 上午10:54
 */
public class ThreadDemo01 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(Thread.currentThread().getName() + ":" + i);
                }
            }
        }, "Antony").start();

        new Thread("zhouhang") {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(getName() + ":" + i);
                }
            }
        }.start();

    }
}

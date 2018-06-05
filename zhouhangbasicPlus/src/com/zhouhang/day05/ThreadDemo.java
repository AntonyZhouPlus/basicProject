package com.zhouhang.day05;

/**
 * com.zhouhang.day05
 *
 * @author zhouhang
 * @date 2018/6/4 下午5:50
 */
public class ThreadDemo {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();
        thread1.setName("zhouhang1");
        thread2.setName("zhouhang2");

        thread1.start();
        thread2.start();
    }
}

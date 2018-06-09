package com.zhouhang.day06homework.test02;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * com.zhouhang.day06homework.Test
 *
 * @author zhouhang
 * @date 2018/6/6 下午8:05
 * 有100份礼品,两人同时发送，当剩下的礼品小于10份的时候则不再送出，利用多线程模拟该过程并将线程的名称打印出来.
 */
public class test02 {
    static int num = 100;
    public static void main(String[] args) {
        Runnable r = new Runnable() {
            Lock lock = new ReentrantLock();

            @Override
            public void run() {
                while (true) {
                    lock.lock();
                    try {
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        if (num >= 10) {
                            System.out.println(Thread.currentThread().getName()+"正在发第" + (num--) + "礼物");
                        } else {
                            break;
                        }
                    } finally {
                        lock.unlock();
                    }
                }
            }
        };

        new Thread(r,"A").start();
        new Thread(r,"B").start();
    }
}

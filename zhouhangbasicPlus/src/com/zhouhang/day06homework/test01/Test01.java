package com.zhouhang.day06homework.test01;

/**
 * com.zhouhang.day06homework.Test01
 *
 * @author zhouhang
 * @date 2018/6/6 下午8:20
 * 一共有1000张电影票,可以在两个窗口领取,假设每次领取的时间为100毫秒,
 * 要求:请用多线程模拟卖票过程并打印剩余电影票的数量
 */
public class Test01 {
    static int num = 1000;

    public static void main(String[] args) {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                while (true) {
                    synchronized (this) {
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println(Thread.currentThread().getName() + " : " + num--);
                        if(num <= 1){
                            break;
                        }
                    }
                }
            }
        };

        new Thread(r,"window1").start();
        new Thread(r,"window2").start();
    }
}

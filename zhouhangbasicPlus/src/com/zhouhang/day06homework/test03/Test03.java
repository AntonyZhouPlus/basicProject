package com.zhouhang.day06homework.test03;

/**
 * com.zhouhang.day06homework.Test03
 *
 * @author zhouhang
 * @date 2018/6/5 下午6:58
 * 同时开启两个线程，共同输出1-100之间的所有数字，并且将输出奇数的线程名称打印出来
 */
public class Test03 {
    public static void main(String[] args) {
        Runnable r = new Runnable() {
            int i = 0;

            @Override
            public void run() {
                for (; i < 100; ) {
                    // 计时等待100
                    synchronized (this) {
                        try {
                            Thread.sleep(5);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        System.out.print(i);
                        if (i % 2 != 0) {
                            System.out.print(":" + Thread.currentThread().getName());
                        }
                        System.out.println();
                        i++;
                    }
                }

            }
        };

        new Thread(r, "线程1").start();
        new Thread(r, "线程2").start();


    }
}

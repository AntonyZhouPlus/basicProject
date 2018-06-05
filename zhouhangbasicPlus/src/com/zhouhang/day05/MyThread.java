package com.zhouhang.day05;

/**
 * com.zhouhang.day05
 *
 * @author zhouhang
 * @date 2018/6/4 下午5:48
 */
public class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(getName()+" "+i);
        }
    }
}

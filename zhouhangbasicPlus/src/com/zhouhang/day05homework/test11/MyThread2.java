package com.zhouhang.day05homework.test11;

/**
 * com.zhouhang.day05homework.Test11
 *
 * @author zhouhang
 * @date 2018/6/5 上午9:27
 * 线程2循环中将字符串"黑马程序员"赋值给String类型变量b,
 */
public class MyThread2 extends Thread{
    @Override
    public void run() {
        long start = System.currentTimeMillis();
        for (int i = 0; i < Test11.LOOP; i++) {
            String b = "黑马程序员";
        }
        long end = System.currentTimeMillis();
        System.out.println((end - start));
    }
}

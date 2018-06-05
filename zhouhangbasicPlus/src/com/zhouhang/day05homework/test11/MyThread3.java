package com.zhouhang.day05homework.test11;

/**
 * com.zhouhang.day05homework.test11
 *
 * @author zhouhang
 * @date 2018/6/5 上午9:28
 * 线程3循环中将字符串"黑马程序员"和循环自增变量i拼接后赋值给String类型变量c
 */
public class MyThread3 extends Thread{
    @Override
    public void run() {
        long start = System.currentTimeMillis();
        for (int i = 0; i < Test11.LOOP; i++) {
            String c = "黑马程序员" + i;
        }
        long end = System.currentTimeMillis();
        System.out.println((end - start));
    }
}

package com.zhouhang.day05homework.test11;

/**
 * com.zhouhang.day05homework.test11
 *
 * @author zhouhang
 * @date 2018/6/5 上午9:25
 * 线程1循环中将循环自增变量i赋值给Integer类型变量 a，
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        long start = System.currentTimeMillis();
        for (int i = 0; i < Test11.LOOP; i++) {
            Integer a = i;
        }
        this.setName("Over");
        long end = System.currentTimeMillis();
        System.out.println((end - start));
    }

}

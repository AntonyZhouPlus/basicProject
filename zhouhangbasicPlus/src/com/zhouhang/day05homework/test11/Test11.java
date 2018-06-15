package com.zhouhang.day05homework.test11;

/**
 * com.zhouhang.day05homework.Test11
 *
 * @author zhouhang
 * @date 2018/6/5 上午9:24
 * 创建三个子线程，在每个线程中开启10万次的循环，
 * 线程1循环中将循环自增变量i赋值给Integer类型变量 a，
 * 线程2循环中将字符串"黑马程序员"赋值给String类型变量b,
 * 线程3循环中将字符串"黑马程序员"和循环自增变量i拼接后赋值给String类型变量c
 * 分别计算三个线程完成任务所用的毫秒值
 */
public class Test11 {
    public static final int LOOP = 100000;

    public static void main(String[] args) {

        run(new MyThread());
        run(new MyThread2());
        run(new MyThread3());

    }

    public static void run(Thread thread){
        thread.start();
    }
}

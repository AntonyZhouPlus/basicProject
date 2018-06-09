package com.zhouhang.day07homework;

import java.util.concurrent.*;

/**
 * com.zhouhang.day07homework
 *
 * @author zhouhang
 * @date 2018/6/7 下午7:38
 * 使用线程池创建多线程。模拟同学找老师学习Java。
 * 创建线程池对象，包含2个线程。从线程池中获取线程对象，然后调用MyRunnable中的run()。
 * 在MyRunnable实现类中，首先在控制台打印需求，“我需要一个老师”。
 * 模拟需要2秒钟时间老师可以过来指导学生，并在控制台打印老师的姓名。
 * 最后，在控制台打印“教我java,教完后，老师回到了办公室”；
 */
public class Test08 {
    public static void main(String[] args) {

        ThreadFactory threadFactory = new ThreadFactory() {
            int count = 1;
            @Override
            public Thread newThread(Runnable r) {
                return new Thread(r,"老师"+count++);
            }
        };


        ExecutorService pool = new ThreadPoolExecutor(2,2,0L,TimeUnit.MICROSECONDS,new LinkedBlockingDeque<Runnable>(1024),threadFactory);
        Runnable runnable = () -> {
            System.out.println("我需要一个老师");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"教我java,教完后，老师回到了办公室");
        };

        for (int i = 0; i < 6; i++) {
            pool.submit(runnable);
        }

        pool.shutdown();
    }

}

package com.zhouhang.day07;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/**
 * com.zhouhang.day07
 *
 * @author zhouhang
 * @date 2018/6/7 下午3:16
 */
public class ThreadPool {
    public static void main(String[] args) {

        ExecutorService threadPool = Executors.newFixedThreadPool(2);

        Runnable r = () -> {
            for (int i = 0; i < 10; i++) {

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + ":" + i);

            }
        };

        threadPool.submit(r);
        threadPool.submit(r);

        // 启动一次顺序关闭，执行以前提交的任务，但不接受新任务。
        threadPool.shutdown();


    }
}

package com.zhouhang.day06homework.test04;

import java.util.*;

/**
 * com.zhouhang.day06homework.Test04
 *
 * @author zhouhang
 * @date 2018/6/5 下午8:51
 * 分析以下需求，并用代码实现
 * 有一个抽奖池,该抽奖池中存放了奖励的金额,该抽奖池中的奖项为 {10,5,20,50,100,200,500,800,2,80,300,700};
 * 创建两个抽奖箱(线程)设置线程名称分别为"抽奖箱1"，"抽奖箱2"，随机从抽奖池中获取奖项元素并打印在控制台上,格式如下:
 * <p>
 * 1.每次抽出一个奖项就打印一个(随机、不重复)
 * 抽奖箱1 又产生了一个 10 元大奖
 * 抽奖箱1 又产生了一个 100 元大奖
 * 抽奖箱1 又产生了一个 200 元大奖
 * 抽奖箱1 又产生了一个 800 元大奖
 * 抽奖箱2 又产生了一个 700 元大奖
 * <p>
 * <p>
 * 2.每次抽的过程中，不打印，抽完时一次性打印(随机、不重复)
 * 在此次抽奖过程中，抽奖箱1总共产生了6个奖项，分别为：10,20,100,500,2,300最高奖项为300元，总计额为932元
 * 在此次抽奖过程中，抽奖箱2总共产生了6个奖项，分别为：5,50,200,800,80,700最高奖项为800元，总计额为1835元
 */
public class Test04 {
    static int[] arr = {10, 5, 20, 50, 100, 200, 500, 800, 2, 80, 300, 700};
    static ArrayList<Integer> list = new ArrayList<>();

    static {
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
    }

    public static void main(String[] args) {
        Random rd = new Random();

        Runnable r = new Runnable() {
            @Override
            public void run() {
                while (true) {
                    synchronized (this) {
                        if (list.size() > 0) {
                            int index = rd.nextInt(list.size());
                            int reward = list.remove(index);
                            System.out.println(Thread.currentThread().getName() + " 又产生了一个 " + reward + " 元大奖");
                        } else {
                            break;
                        }
                    }
                }
            }
        };

        new Thread(r, "抽奖箱1").start();
        new Thread(r, "抽奖箱2").start();
    }
}

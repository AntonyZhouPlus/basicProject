package com.zhouhang.day06homework.test04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * com.zhouhang.day06homework.test04
 *
 * @author zhouhang
 * @date 2018/6/7 上午10:18
 */
public class Test04StandardAnswer {
    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable();
        new Thread(mr, "抽奖箱一一一").start();
        new Thread(mr, "抽奖箱二").start();
    }

    public static void test3() {
        //        同时开启两个线程，共同输出1-100之间的所有数字，并且将输出奇数的线程名称打印出来
        Runnable r = new Runnable() {
            private int num = 1;

            @Override
            public void run() {
                while (true) {
                    //
                    synchronized (this) {
                        if (num <= 100) {
                            try {
                                Thread.sleep(100);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            if (num % 2 == 0) {
                                System.out.println(num++);
                            } else {
                                System.out.println(Thread.currentThread().getName() + ":" + num++);
                            }
                        } else {
                            break;
                        }
                    }
                }
            }
        };

        new Thread(r, "线程一").start();
        new Thread(r, "线程二").start();
    }
}

class MyRunnable implements Runnable {
    //        第四题：分析以下需求，并用代码实现
//        有一个抽奖池,该抽奖池中存放了奖励的金额,该抽奖池中的奖项为 {10,5,20,50,100,200,500,800,2,80,300,700};
//        创建两个抽奖箱(线程)设置线程名称分别为"抽奖箱1"，"抽奖箱2"，随机从抽奖池中获取奖项元素并打印在控制台上,格式如下:
//
//        1.每次抽出一个奖项就打印一个(随机、不重复)
//        抽奖箱1 又产生了一个 10 元大奖
//        抽奖箱1 又产生了一个 100 元大奖
//        抽奖箱1 又产生了一个 200 元大奖
//        抽奖箱1 又产生了一个 800 元大奖
//        抽奖箱2 又产生了一个 700 元大奖
//
//
//        2.每次抽的过程中，不打印，抽完时一次性打印(随机、不重复)
//        在此次抽奖过程中，抽奖箱1总共产生了6个奖项，分别为：10,20,100,500,2,300最高奖项为300元，总计额为932元
//        在此次抽奖过程中，抽奖箱2总共产生了6个奖项，分别为：5,50,200,800,80,700最高奖项为800元，总计额为1835元

    static ArrayList<Integer> list = new ArrayList<>();
    Random rd = new Random();

    static { // 类加载的时候，静态代码块中的代码执行一次
        // 将奖金放入抽奖池
        Integer[] arr = {10, 5, 20, 50, 100, 200, 500, 800, 2, 80, 300, 700};

        Collections.addAll(list, arr);
    }

//    ArrayList<Integer> list1 = new ArrayList<>();
//    ArrayList<Integer> list2 = new ArrayList<>();


    @Override
    public void run() {
        // 每个线程对象，都会调用一次run方法
        ArrayList<Integer> box = new ArrayList<>();
        while (true) {
            // 1 2
            synchronized (this) {
                if (list.size() > 0) {

                    try {
                        Thread.sleep(5);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    int index = rd.nextInt(list.size());
                    box.add(list.remove(index));
//                    System.out.println(Thread.currentThread().getName() + "又产生了一个 " + money + " 元大奖");
                } else {
                    printBox(box);
                    break;
                }
            }
        }
    }

    private void printBox(ArrayList<Integer> box) {
        //在此次抽奖过程中，抽奖箱1总共产生了6个奖项，分别为：10,20,100,500,2,300最高奖项为300元，总计额为932元
        if (box.size() > 0) {
            int sum = 0;
            int max = box.get(0);
            sum += max;
            StringBuilder sb = new StringBuilder(max + ",");
            for (int i = 1; i < box.size(); i++) {
                // 获取抽奖箱中的金额
                int money = box.get(i);
                // 求总和
                sum += money;

                // 求最大金额
                if (money > max) {
                    max = money;
                }
                // 将所有的金额拼接起来
                sb.append(money).append(",");
            }

            System.out.println("在此次抽奖过程中，" + Thread.currentThread().getName() + "总共产生了" +
                    box.size() + "个奖项，分别为：" + sb + "最高奖项为" + max + "元，总计额为" + sum + "元");
        } else {
            System.out.println("很遗憾," + Thread.currentThread().getName() + "没有抽到任何奖项");
        }
    }
}

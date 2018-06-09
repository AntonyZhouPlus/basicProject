package com.zhouhang.day06homework.test04;

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

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
    private static int[] arr = {10, 5, 20, 50, 100, 200, 500, 800, 2, 80, 300, 700};
    private static ArrayList<Integer> list = new ArrayList<>();
    private static ArrayList<Integer> list1 = new ArrayList<>();
    private static ArrayList<Integer> list2 = new ArrayList<>();
    private static Random rd = new Random();
    private static int count1 = 0;
    private static int count2 = 0;

    static {
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
    }

    public static void main(String[] args) {

        Runnable r = new Runnable() {
            @Override
            public void run() {
                while (true) {
                    synchronized (arr) {
                        if (list.size() > 0) {
                            int index = rd.nextInt(list.size());
                            int reward = list.remove(index);
                            String name = Thread.currentThread().getName();

                            try {
                                Thread.sleep(99);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }

                            if ("抽奖箱1".equals(name)) {
                                count1++;
                                list1.add(reward);
                            } else if ("抽奖箱2".equals(name)) {
                                count2++;
                                list2.add(reward);
                            }
                            System.out.println(name + " 又产生了一个 " + reward + " 元大奖");
                        } else {
                            arr.notify();
                            break;
                        }
                    }
                }
            }
        };

        new Thread(r, "抽奖箱1").start();
        new Thread(r, "抽奖箱2").start();

        // 为了避免提前统计，新建线程等待1秒后统计
        new Thread("统计员"){
            @Override
            public void run() {
                    synchronized (arr) {
                        try {
                            arr.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        print(list1,"抽奖箱1");
                        print(list2,"抽奖箱2");
                    }
            }
        }.start();
        /*抽奖箱1 又产生了一个 800 元大奖
        抽奖箱1 又产生了一个 50 元大奖
        抽奖箱1 又产生了一个 80 元大奖
        抽奖箱1 又产生了一个 5 元大奖
        抽奖箱1 又产生了一个 2 元大奖
        抽奖箱2 又产生了一个 300 元大奖
        抽奖箱2 又产生了一个 10 元大奖
        抽奖箱2 又产生了一个 500 元大奖
        抽奖箱2 又产生了一个 20 元大奖
        抽奖箱2 又产生了一个 100 元大奖
        抽奖箱2 又产生了一个 700 元大奖
        抽奖箱2 又产生了一个 200 元大奖
        此次抽奖过程中，抽奖箱1总共产生了5个奖项，分别为：800 ,50 ,80 ,5 ,2 ,最高奖项为800元，总计额为937元
        此次抽奖过程中，抽奖箱2总共产生了7个奖项，分别为：300 ,10 ,500 ,20 ,100 ,700 ,200 ,最高奖项为700元，总计额为1830元*/

    }

    private static void print(ArrayList<Integer> list,String name){
        StringBuilder sb = new StringBuilder();

        int max = 0;
        try {
            max = list.get(0);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(name+"没抽中奖");
            return;
        }
        int sum = 0;

        sb.append("此次抽奖过程中，");
        sb.append(name);
        if ("抽奖箱1".equals(name)) {
            sb.append("总共产生了"+count1+"个奖项，分别为：");
            for (Integer i : list) {
                max = max > i ? max : i;
                sum += i;
                sb.append(i).append(" ,");
            }
            sb.append("最高奖项为").append(max).append("元，总计额为").append(sum).append("元");
        }
        if ("抽奖箱2".equals(name)) {
            sb.append("总共产生了"+count2+"个奖项，分别为：");
            for (Integer i : list) {
                max = max > i ? max : i;
                sum += i;
                sb.append(i).append(" ,");
            }
            sb.append("最高奖项为").append(max).append("元，总计额为").append(sum).append("元");
        }

        System.out.println(sb);
    }
}

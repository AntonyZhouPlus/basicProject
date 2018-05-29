package com.zhouhang.day07;

import java.util.Random;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/15 17:14
 */
public class DemoRandom {
    public static void main(String[] args) {
        randomAvg();


    }

    // 要求生成5个随机数[1-100]，存入数组，求平均值
    public static void randomAvg() {
        Random rd = new Random();
        int[] arr = new int[5];
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(100) + 1;
            sum += arr[i];
        }

        System.out.println("Avg : " + (sum / arr.length));
    }


}

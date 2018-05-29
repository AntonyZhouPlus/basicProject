package com.zhouhang.day07;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/17 8:58
 */
public class DemoHomeWorkQQ {
    public static void main(String[] args) {
        // test02();
        test02();


    }

    private static int[] test02() {
        System.out.println("输入数组长度:");
        int len = new Scanner(System.in).nextInt();
        Random rd = new Random();
        int[] arr = new int[len];

        arr[0] = rd.nextInt(len) + 1;
        int x = rd.nextInt(len) + 1;
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; ) {
                if (x == arr[j]) {
                    j = 0;
                    x = rd.nextInt(len) + 1;
                } else {
                    j++;
                }
                if (j == i) {
                    arr[i] = x;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
        return arr;
    }

    private static void test01() {
        int[] arr = new int[10];
        Random rd = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(20) + 1;
        }

        System.out.println(Arrays.toString(arr));

        System.out.println("打印不重复元素：");

        for (int i = 0; i < arr.length; i++) {
            int t = arr[i];
            int count = 0;
            for (int i1 = 0; i1 < arr.length; i1++) {
                if (t == arr[i1]) {
                    count++;
                    if (count >= 2) {
                        break;
                    }
                }
            }
            if (count == 1) {
                System.out.println(t);
            }
        }
    }
}

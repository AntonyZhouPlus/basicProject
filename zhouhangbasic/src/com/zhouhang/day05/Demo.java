package com.zhouhang.day05;

/**
 * DemoScanner code
 *
 * @author Zhouhang Anthony
 * @date 2018/5/12 10:53
 */
public class Demo {
    public static void main(String[] args) {
        // 动态初始化
        // int[] arrayA = new int[3];
        // 静态初始化
        String[] arrayB;
        arrayB = new String[]{"Hello ", "World ", "JAVA"};
        String[] arrayC = new String[3];
        arrayC[0] = "Hello ";
        arrayC[1] = "World ";
        arrayC[2] = "JAVA";

        for (String i : arrayB) {
            System.out.println(i + " ");
        }
        for (int i = 0; i < arrayB.length; i++) {
            System.out.print(arrayB[i]);
        }
        System.out.println();
        for (int i = 0; i < arrayC.length; i++) {
            System.out.print(arrayC[i]);
        }
    }
}

package com.zhouhang.day05;

/**
 * DemoScanner code
 *
 * @author Zhouhang Anthony
 * @date 2018/5/12 16:57
 */
public class Array {
    public static void main(String[] args) {
        int[] arrayA = {91, 92, 93, 94, 95, 96, 97, 98};
        int[][] arrayB = {{1, 2, 3}, {2, 3, 4}};
        int sum = 0;

        for (int i : arrayA) {
            sum += i;
        }

        System.out.println(sum / arrayA.length);

        /*for (int[] i : arrayB) {
            for (int j : i) {
                System.out.println(j);
            }
        }
        System.out.println("===============");

        for (int i = 0; i < arrayA.length; i++) {
            System.out.println(arrayA[i]);
        }*/
    }
}

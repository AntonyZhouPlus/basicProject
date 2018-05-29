package com.zhouhang.day05;

/**
 * DemoScanner code
 *
 * @author Zhouhang Anthony
 * @date 2018/5/12 19:35
 */
public class ArrayMethod {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 56, 324};

        System.out.println(getArrayAvg(arr));
    }

    public static int getArrayAvg(int[] arr) {
        int sum = 0;

        for (int i : arr) {
            sum += i;
        }
        return sum / arr.length;
    }
}

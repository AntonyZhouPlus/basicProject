package com.zhouhang.sort;

import java.util.Arrays;
import java.util.Random;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/24 20:46
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] arr;
        arr = getArray(100);
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }

    public static int[] getArray(int len) {
        Random rd = new Random();
        int[] arr = new int[len];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(len);
        }
        return arr;
    }
    public static int divide(int[] a, int start, int end) {
        int base = a[end];

        while (start < end) {
            while (start < end && a[start] <= base) {
                start++;
            }
            if (start < end) {
                int temp = a[start];
                a[start] = a[end];
                a[end] = temp;

                end--;
            }
            while (start < end && a[end] >= base) {
                end--;
            }
            if (start < end) {
                int temp = a[start];
                a[start] = a[end];
                a[end] = temp;
                start++;
            }

        }

        return start;
    }

    public static void sort(int[] a, int start, int end) {

        // 只有一个数，就不需要排序
        if (start > end) {
            return;
        } else {
            int partition = divide(a, start, end);
            sort(a, start, partition - 1);
            sort(a, partition + 1, end);
        }
    }
}

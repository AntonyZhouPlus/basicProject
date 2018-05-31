package com.zhouhang.day02homework;

import java.util.Arrays;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/30 15:28
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] a = {6,3,4,2,1,4,5,6};
        sort(a,0,a.length-1);
        System.out.println(Arrays.toString(a));

    }

    private static int divide(int[] a, int left, int right) {
        int key = a[right];

        while (left < right) {
            while (left < right && a[left] <= key) {
                left++;
            }
            if (left < right) {
                int temp = a[right];
                a[right] = a[left];
                a[left] = temp;
                right--;
            }
            while (left < right && a[right] >= key) {
                right--;
            }
            if (left < right) {
                int temp = a[right];
                a[right] = a[left];
                a[left] = temp;
                left++;
            }
        }

        return left;
    }

    private static void sort(int[] a, int left, int right) {
        if (left > right) {
            return;
        } else {
            int i = divide(a, left, right);
            sort(a, i + 1, right);
            sort(a, left, i - 1);
        }
    }
}

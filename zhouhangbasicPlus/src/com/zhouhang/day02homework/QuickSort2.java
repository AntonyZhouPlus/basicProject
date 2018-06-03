package com.zhouhang.day02homework;

import java.util.Arrays;

/**
 * com.zhouhang.day02homework
 *
 * @author zhouhang
 * @date 2018/6/3 下午3:41
 */
public class QuickSort2 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,3,2,7,4,5,6,3,4,5,90};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }

    private static void sort(int[] arr, int left, int right) {
        if (left > right) {
            return;
        }
        int index = divide(arr, left, right);
        sort(arr, index + 1, right);
        sort(arr, left, index - 1);
    }

    private static int divide(int[] arr, int left, int right) {
        int key = arr[right];

        while (left < right) {
            while (left < right && arr[left] <= key) {
                left++;
            }
            if (left < right) {
                swap(arr, left, right);
            }
            while (left < right && arr[right] >= key) {
                right--;
            }
            if (left < right) {
                swap(arr, left, right);
            }
        }

        return left;
    }

    private static void swap(int[] arr, int left, int right) {
        int temp = arr[right];
        arr[right] = arr[left];
        arr[left] = temp;
    }
}

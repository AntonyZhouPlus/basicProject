package com.zhouhang.Sort;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * com.zhouhang.Sort
 *
 * @author zhouhang
 * @date 2018/6/9 上午11:26
 */
public class SimpleSort {
    public static void main(String[] args) {
        int[] arr = {3, 2, 5, 2, 12, 10, 8, 9, 7};
        simpleSort(arr, 0);
        System.out.println(Arrays.toString(arr));

    }

    public static void simpleSort(int[] arr, int start) {
        if (start == arr.length - 1) {
            return;
        }
        int minIndex = start;
        for (int i = start; i < arr.length; i++) {
            minIndex = arr[minIndex] < arr[i] ? minIndex : i;
        }
        int temp = arr[minIndex];
        arr[minIndex] = arr[start];
        arr[start] = temp;
        simpleSort(arr, ++start);
    }
}

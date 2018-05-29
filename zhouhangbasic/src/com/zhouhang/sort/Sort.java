package com.zhouhang.sort;

import java.util.Arrays;
import java.util.Random;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/21 21:11
 */
public class Sort {
    public static void main(String[] args) {
        int[] arr;
        arr = getArray(10);
        quickSort(arr);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);

    }

    public static int[] getArray(int len) {
        Random rd = new Random();
        int[] arr = new int[len];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(len);
        }
        return arr;
    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j + 1] < arr[j]) {
                    arr[j] = arr[j] + arr[j + 1];
                    arr[j + 1] = arr[j] - arr[j + 1];
                    arr[j] = arr[j] - arr[j + 1];
                }
            }

        }
    }

    public static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    arr[j] = arr[j] + arr[i];
                    arr[i] = arr[j] - arr[i];
                    arr[j] = arr[j] - arr[i];
                }
            }
        }
    }

    public static void quickSort(int[]arr) {
        quickSort0(arr, 0, arr.length - 1);
    }

    public static void quickSort0(int[] arr,int start, int end) {
        if (start >= end) {
            return;
        }

        int i = start;
        int j = end;
        int key = arr[start];

        while (i < j) {
            while (i < j && arr[j] >= key) {
                j--;
            }
            if(i < j) {
                arr[i++] = arr[j];
            }
            while (i < j && arr[i] <= key) {
                i++;
            }
            if(i < j) {
                arr[j--] = arr[i];
            }
        }
        arr[i] = key;
        quickSort0(arr,start,i - 1);
        quickSort0(arr,i + 1,end);
    }


}

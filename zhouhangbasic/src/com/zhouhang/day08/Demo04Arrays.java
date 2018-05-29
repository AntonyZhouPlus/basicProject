package com.zhouhang.day08;

import java.util.Arrays;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/20 9:44
 */
public class Demo04Arrays {
    public static void main(String[] args) {
        String str = "12435465343";
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        char[] arr2 = arr.clone();
        System.out.println(Arrays.toString(arr2));
        for (int i = 0; i < arr.length; i++) {
            arr2[arr.length - 1 - i] = arr[i];
        }
        System.out.println(Arrays.toString(arr2));

    }
}

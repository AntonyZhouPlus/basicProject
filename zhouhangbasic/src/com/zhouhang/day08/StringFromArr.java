package com.zhouhang.day08;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/18 16:07
 */
public class StringFromArr {

    public static void main(String[] args) {
        int[] arr;
        arr = new int[]{1, 2, 3};

        System.out.println(getStringByArray(arr));
    }

    public static String getStringByArray(int[] arr) {
        String result = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                result += "word" + arr[i] + "]";
            } else {
                result += "word" + arr[i] + "#";
            }
        }
        return result;
    }

}

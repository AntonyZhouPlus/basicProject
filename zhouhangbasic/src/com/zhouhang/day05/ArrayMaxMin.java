package com.zhouhang.day05;

/**
 * DemoScanner code
 *
 * @author Zhouhang Anthony
 * @date 2018/5/12 17:34
 */
public class ArrayMaxMin {
    public static void main(String[] args) {
        int[] arrayA = {91, 92, 93, 94, 95, 96, 97, 98};
        int max = arrayA[0];
        int min = arrayA[0];

        for (int i : arrayA) {
            max = max > i ? max : i;
            min = min < i ? min : i;
        }
        System.out.println("max: " + max);
        System.out.println("min: " + min);

        /*for (int i = 0; i < arrayA.length / 2; i++) {
            arrayA[i] = arrayA[arrayA.length - 1 - i] - arrayA[i];
            arrayA[arrayA.length - 1 - i] = arrayA[arrayA.length - 1 - i] - arrayA[i];
            arrayA[i] = arrayA[arrayA.length - 1 - i] + arrayA[i];
        }*/

        for (int left = 0, right = arrayA.length - 1; left <= right; left++, right--) {
            arrayA[left] = arrayA[right] - arrayA[left];
            arrayA[right] = arrayA[right] - arrayA[left];
            arrayA[left] = arrayA[right] + arrayA[left];
        }

        /*for (int left = 0, right = arrayA.length - 1; left <= right; left++, right--) {
            arrayA[left] = arrayA[left] ^ arrayA[right];
            arrayA[right] = arrayA[right] ^ arrayA[left];
            arrayA[left] = arrayA[left] ^ arrayA[right];
        }*/


        for (int i : arrayA) {
            System.out.println(i);
        }
    }


}

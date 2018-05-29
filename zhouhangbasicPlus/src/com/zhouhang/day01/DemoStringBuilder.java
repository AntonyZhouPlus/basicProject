package com.zhouhang.day01;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/28 17:44
 */
public class DemoStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append(1).append("world").append(true).append('\n').append("123123213".toCharArray());
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        Arrays.toString(new int[1]);
    }

    public static String arrToSting(int[] arr){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length -1){
                sb.append(arr[i]).append("]");
            }else {
                sb.append(arr[i]).append(", ");
            }
        }
        return sb.toString();
    }
}

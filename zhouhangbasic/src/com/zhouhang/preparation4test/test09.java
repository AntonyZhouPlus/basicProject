package com.zhouhang.preparation4test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/24 9:14
 */
public class test09 {
    public static void main(String[] args) {
        int[] array = {11, 22, 33, 44, 55, 66, 5678954, 77, 888, 999, 1000, 5555};
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            if(check(list.get(i))){
                list.remove(i--);
            }
        }
        System.out.println(list);

    }

    public static boolean check(int i) {
        String str = i + "";
        return str.length() == 4 || str.length() == 5;
    }
}

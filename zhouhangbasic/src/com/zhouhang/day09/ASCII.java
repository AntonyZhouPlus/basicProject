package com.zhouhang.day09;

import java.util.Arrays;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/20 11:07
 */
public class ASCII {
    public static void main(String[] args) {
        // print();
        byte[] b = {-27, -111, -88, -24, -120, -86};
        String str = new String(b);
        System.out.println(str);
    }

    public static void print() {
        for (int i = '0'; i < 'z'; i++) {
            System.out.print((char) i + " ");
            System.out.println(i);
            }
    }
}

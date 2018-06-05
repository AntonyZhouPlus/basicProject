package com.zhouhang.day06homework.test03;

/**
 * com.zhouhang.day06homework.test03
 *
 * @author zhouhang
 * @date 2018/6/5 下午8:07
 */
public class SwapTest {
    public static void main(String[] args) {
        int a = 21;
        int b = 10;

        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println(a);
        System.out.println(b);
    }
}

package com.zhouhang.day03;

/**
 * com.zhouhang.day03
 *
 * @author zhouhang
 * @date 2018/6/1 下午5:56
 */
public class VarPramDemo {
    public static void main(String[] args) {
        // 可以传一个
        method(1);
        // 可以传多个
        method(2, 3);
        // 可以不传
        method();
        // 可以传数组
        method(new int[]{1, 2, 3});
    }

    public static void method(int... num) {
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();
    }
}

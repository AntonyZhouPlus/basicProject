package com.zhouhang.day12;

/**
 * com.zhouhang.day12
 *
 * @author zhouhang
 * @date 2018/6/14 下午5:44
 */
public class Test11 {
    public static void main(String[] args) {
        int[] arr = method(int[]::new, 10);
        for (int i : arr) {
            System.out.println(i);
        }

    }

    public static int[] method(InterArrayBuilder i,int len) {
        return i.build(len);
    }
}

package com.zhouhang.day12homework.test08;

/**
 * com.zhouhang.day12homework.test08
 *
 * @author zhouhang
 * @date 2018/6/15 上午9:04
 */
public class Test08 {
    public static void main(String[] args) {
        getIntegerArray(10,Integer[]::new);
    }

    static void getIntegerArray(int length,ArrayBuilder<Integer> arrayBuilder) {
        Integer[] integers = arrayBuilder.buildArray(length);
        for (Integer integer : integers) {
            System.out.println(integer);
        }

    }
}

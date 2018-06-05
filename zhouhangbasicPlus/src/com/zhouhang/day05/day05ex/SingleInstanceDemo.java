package com.zhouhang.day05.day05ex;

/**
 * com.zhouhang.day05.day05ex
 *
 * @author zhouhang
 * @date 2018/6/4 下午7:57
 */
public class SingleInstanceDemo {
    public static void main(String[] args) {
        SingleInstance s1 = SingleInstance.getSingleInstance();
        SingleInstance s2 = SingleInstance.getSingleInstance();

        System.out.println(s1 == s2);
    }
}

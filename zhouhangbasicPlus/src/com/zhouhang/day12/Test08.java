package com.zhouhang.day12;

import com.zhouhang.day08homework.Test;

/**
 * com.zhouhang.day12
 *
 * @author zhouhang
 * @date 2018/6/14 下午4:07
 */
public class Test08 {
    public static void main(String[] args) {
        print("yes:", PrintDemo::print);
    }

    public static void print(String s, InterPrint<String> p) {
        p.print(s);
    }
}

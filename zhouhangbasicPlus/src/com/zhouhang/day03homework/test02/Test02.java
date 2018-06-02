package com.zhouhang.day03homework.test02;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

/**
 * com.zhouhang.day03homework.Test02
 *
 * @author zhouhang
 * @date 2018/6/1 下午4:02
 * 键盘读取一个字符串,去掉其中重复字符, 打印出不同的那些字符
 */
public class Test02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();

        HashSet<Character> set = new LinkedHashSet<>();
        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));
        }

        System.out.println(set);

        for (Character character : set) {
            System.out.println(character);
        }

    }
}

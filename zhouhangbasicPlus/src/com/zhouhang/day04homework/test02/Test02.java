package com.zhouhang.day04homework.test02;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * com.zhouhang.day04homework.Test02
 *
 * @author zhouhang
 * @date 2018/6/2 下午8:43
 * 1.利用键盘录入，输入一个字符串
 * 2.统计该字符串中各个字符的数量(提示:字符不用排序)
 * 3.如：
 * 用户输入字符串"If~you-want~to~change-your_fate_I_think~you~must~come-to-the-dark-horse-to-learn-java"
 * 程序输出结果：-(9)I(2)_(3)a(7)c(2)d(1)e(6)f(2)g(1)h(4)i(1)j(1)k(2)l(1)m(2)n(4)o(8)r(4)s(2)t(8)u(4)v(1)w(1)y(3)~(6)
 */
public class Test02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符");
        String string = sc.next();

        char[] chars = string.toCharArray();
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            map.put(c, map.get(c) == null ? 1 : map.get(c) + 1);
        }
    }
}

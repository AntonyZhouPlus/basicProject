package com.zhouhang.day01homework.test06;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/28 19:33
 * 从键盘录入一个字符串，字符串中包含部分数字，将这些字符串中的数字转换成int类型，并求和输出。
 * 例如：
 * 输入的字符串为：	java12haha3嘻嘻54
 * 字符串中的数字和为：	69
 */
public class Test06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入带数字的一句话");


        String str = sc.next();
        char[] chars = str.toCharArray();
        int sum = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] <= '9' && chars[i] >= '0') {
                sb.append(chars[i]);
            } else {
                sb.append("*");
            }
        }
        String[] split = sb.toString().split("\\*");

        for (int i = 0; i < split.length; i++) {
            if (!"".equals(split[i])) {
                sum += Integer.valueOf(split[i]);
            }
        }
        System.out.println("字符串中的数字和为：" + sum);
    }

    public static void method2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String str = sc.next(); // java12haha3嘻嘻54

        Pattern pattern = Pattern.compile("[0-9]+");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            String s = matcher.group();
            System.out.println(s);
        }
    }

    public static void method3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String str = sc.next(); // java12haha3嘻嘻54

        char[] chs = str.toCharArray();

        int right = 0;
        int sum = 0;
        for (int left = 0; left < chs.length; left++) {
            if (chs[left] >= '0' && chs[left] <= '9') {
                for (right = left + 1; right < chs.length; right++) {
                    if (!(chs[right] >= '0' && chs[right] <= '9')) {
                        break;
                    }
                }
                String s = str.substring(left, right);
                int num = Integer.parseInt(s);
                sum += num;
                System.out.println(s);
                left = right;
            }
        }

        System.out.println("sum:" + sum);
    }

}

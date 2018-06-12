package com.zhouhang.day10homework;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * com.zhouhang.day10homework
 *
 * @author zhouhang
 * @date 2018/6/12 下午3:16
 * 分析以下需求，并用代码实现
 * 	实现一个验证码小程序，要求如下：
 * 	1. 在项目根目录下新建一个文件：data.txt,键盘录入3个字符串验证码，并存入data.txt中，要求一个验证码占一行；
 * zhouhang
 * 123
 * shuaige
 * 	2. 键盘录入一个需要被校验的验证码，如果输入的验证码在data.txt中存在：在控制台提示验证成功，如果不存在控制台提示验证失败
 */
public class Test04 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("data.txt"));
        Scanner sc = new Scanner(System.in);
        System.out.println("输入3个字符串");
        for (int i = 0; i < 3; i++) {
            bw.write(sc.next());
            bw.newLine();
        }
        bw.close();
        confirm();
    }

    private static void confirm() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("data.txt"));
        ArrayList<String> list = new ArrayList<>();
        String str;
        while ((str = br.readLine())!= null) {
            list.add(str);
        }
        br.close();
        Scanner sc = new Scanner(System.in);
        System.out.println("输入验证码");
        String input = sc.next();
        if (list.contains(input)) {
            System.out.println("成功");
        } else {
            System.out.println("失败");
        }
    }
}

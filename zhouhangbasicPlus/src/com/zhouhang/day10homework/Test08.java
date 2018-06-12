package com.zhouhang.day10homework;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * com.zhouhang.day10homework
 *
 * @author zhouhang
 * @date 2018/6/12 下午4:08
 * 从键盘录入一行字符串，利用字节打印流将该行字符串保存到当前项目根目录下的d.txt文件中
 */
public class Test08 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入");
        String s = sc.next();
        PrintStream ps = new PrintStream("d.txt");
        ps.print(s);
        ps.close();
    }
}

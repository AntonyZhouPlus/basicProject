package com.zhouhang.day08;

import java.util.Scanner;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/18 11:36
 */
public class Demo01String {
    public static void main(String[] args) {
// 定义一个大字符串，再定义一个小字符串，求小字符串在大字符串中出现的次数
// String str = "fadsjavafdsafasjjavafsdafjavafdsafajava";
// String smallStr = "java";
        String str = "fadsjavafdsafasjjavafsdafjavafdsafajava";
        String smallStr = "java";
        int count = 0;
        for (int i = 0; i < str.length() - smallStr.length() + 1; i++) {
            if(str.substring(i,i+smallStr.length()).equals(smallStr)){
                count++;
            }
        }
        System.out.println(count);



    }

    public static void method02() {
        String str = "abcdefg";
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
        System.out.println(str.hashCode());
    }

    public static void method01() {
        Scanner sc = new Scanner(System.in);
        String userName = "zhouhang";
        String password = "123";
        int count = 0;

        while (true) {
            System.out.println("please input your username:");
            String usr = sc.next();
            System.out.println("please input your password:");
            String psd = sc.next();
            if (usr.equals(userName) && psd.equals(password)) {
                System.out.println("Success");
                break;
            } else {
                count++;
                System.out.println("Fail, please retry. You have " + (3 - count) + " chance remain");
                if (count == 3) {
                    System.out.println("System out");
                    break;
                }
            }
        }
    }
}

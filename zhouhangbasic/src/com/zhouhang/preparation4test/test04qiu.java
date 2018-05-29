package com.zhouhang.preparation4test;

import java.util.Scanner;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/24 21:14
 * 模拟审核身份证的过程，按照以下要求实现相关代码（友情提示：不一定要用正则）
 * a.提示用户在控制台输入身份证号，用一个字符串对其进行保存
 * b.判断该身份证号位数是否是18位或者16位
 * c.判断该身份证号除最后一位外，是否都是数字
 * d.将身份证号中的生日信息获取出来并且打印到控制台上。比如：身份证号是“410124199008010231”截取的生日应为（19900801）
 */
public class test04qiu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入身份证号");
        String id = sc.next();
        int flag = 0;

        if (id.length() == 18) {
            flag = 18;
            System.out.println("18位");
        } else if (id.length() == 16) {
            flag = 16;
            System.out.println("16位");
        } else {
            System.out.println("输入错误");
        }

        char[] chars = id.toCharArray();
        boolean flag2 = true;
        for (int i = 0; i < chars.length - 1; i++) {

            if (!(chars[i] >= '0' && chars[i] <= '9')) {
                flag2 = false;
            }
        }
        if(flag2){
            System.out.println("都是数字");
            System.out.println(id.substring(6, 14));
        }else {
            System.out.println("不都是数字");
        }


    }
}

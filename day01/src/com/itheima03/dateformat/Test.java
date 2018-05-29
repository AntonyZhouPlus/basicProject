package com.itheima03.dateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
   请使用日期时间相关的API，计算出一个人已经出生了多少天。

   思路
     1：算出当前时间的毫秒值
     2：算出出生日期的时间毫秒值
     3：两个时间相减，再转换成天就可以了
 */
public class Test {
    public static void main(String[] args) throws ParseException {
        // 1: 键盘录入出生年月日
        System.out.println("请录入您的生日：格式(yyyy-MM-dd)");
        String birthdayStr = new Scanner(System.in).nextLine();

        //2: 算出当前时间的毫秒值
        Date nowDate = new Date();
        long nowTime = nowDate.getTime();

        //3:创建日期格式化对象 并指定 yyyy-MM-dd 这个规则
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        //4: 解析操作
        Date birthdayDate = sdf.parse(birthdayStr);
        //5:算出 生日的毫秒值
        long birthdayTime = birthdayDate.getTime();

        //6: 计算 做减法
        System.out.println("你已经出生了："+(nowTime-birthdayTime)/1000/60/60/24+"天");
    }
}

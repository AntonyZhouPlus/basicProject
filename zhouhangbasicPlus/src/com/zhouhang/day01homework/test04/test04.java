package com.zhouhang.day01homework.test04;

import javafx.scene.chart.PieChart;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/28 20:33
 * 1.从键盘录入一个日期字符串,格式为 xxxx-xx-xx,代表该人的出生日期
 * 2.利用人出生日期到当前日期所经过的毫秒值计算出这个人活了多少天
 */
public class test04 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的生日（eg:2015-10-20）");
        String birthday = sc.next();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date theDay = sdf.parse(birthday);
        Date now = new Date();
        long live = now.getTime() - theDay.getTime();
        System.out.println("你活了" + live / 1000 / 60 / 60 / 24 + "天");
    }
}

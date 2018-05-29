package com.zhouhang.day01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/28 16:01
 */
public class CalendarTest {
    public static void main(String[] args) throws ParseException {
        Calendar c = Calendar.getInstance();
        System.out.println(c.toString());
        Date d = new Date();

        System.out.println(d);
        //d.setTime(0);
        c.setTime(d);

        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH) + 1;
        int date = c.get(Calendar.DATE);
        int day = c.get(Calendar.DAY_OF_WEEK) - 1;

        c.add(Calendar.YEAR,-1);

        System.out.println("" + c.get(Calendar.YEAR) + "-" + month + "-" + date + "-" + day);

        test();
    }

    public static void test() throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("plz input yyyy-MM-dd");
        String str = sc.next();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date birthday = sdf.parse(str);
        Calendar c2 = Calendar.getInstance();
        c2.setTime(birthday);
        System.out.println("你的生日是星期" + (c2.get(Calendar.DAY_OF_WEEK) - 1));
    }
}

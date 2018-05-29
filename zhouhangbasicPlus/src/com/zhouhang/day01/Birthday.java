package com.zhouhang.day01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/28 15:08
 */
public class Birthday {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("plz input yyyy-MM-dd");
        String str = sc.next();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date birthday = sdf.parse(str);
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd E" );
        System.out.println(sdf2.format(birthday));

        Date today = new Date();
        Long time = today.getTime() - birthday.getTime();
        System.out.println("活了的天数：" + time / (1000L * 60 * 60 * 24));


    }
}

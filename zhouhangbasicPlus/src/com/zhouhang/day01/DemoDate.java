package com.zhouhang.day01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/28 11:45
 */
public class DemoDate {
    public static void main(String[] args) throws InterruptedException, ParseException {
        Date d = new Date();

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E");
        System.out.println(dateFormat.format(d));

        String str = "2018-11-11";
        SimpleDateFormat dateFormat2 = new SimpleDateFormat("yyyy-MM-dd");
        Date d2 = dateFormat2.parse(str);
        System.out.println(dateFormat.format(d2));

        /*
        }*/
    }
}

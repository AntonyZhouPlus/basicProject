package com.zhouhang.day01;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/28 16:15
 */
public class Clock {
    public static void main(String[] args) throws InterruptedException {
        Date d = new Date();

        for (int i = 0; i < 5; i++) {
            Thread.sleep(1000);
            System.out.println(d);
            d.setTime(d.getTime() + 1000);
        }
    }
}

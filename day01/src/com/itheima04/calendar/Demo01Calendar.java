package com.itheima04.calendar;

import java.util.Calendar;

/*
Calendar为抽象类，由于语言敏感性，Calendar类在创建对象时并非直接创建，而是通过静态方法创建，返回子类对象，
如下：
方便我们获取时间属性的

Calendar静态方法

   - public static Calendar getInstance()：使用默认时区和语言环境获得一个日历

 */
public class Demo01Calendar {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();

        System.out.println(c);
    }
}

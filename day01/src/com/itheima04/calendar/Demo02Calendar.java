package com.itheima04.calendar;


import java.util.Calendar;
import java.util.Date;

/*
Calendar常用方法
  - public int get(int field)：返回给定日历字段的值。
  - public void set(int field, int value)：将给定的日历字段设置为给定值。

  - public abstract void add(int field, int amount)：
  根据日历的规则，为给定的日历字段添加或减去指定的时间量。

  - public Date getTime()：返回一个表示此Calendar时间值（从历元到现在的毫秒偏移量）的Date对象。


 */
public class Demo02Calendar {

    public static void main(String[] args) {
       // 获取日历对象
        Calendar c = Calendar.getInstance();

        // 获取时间信息
        //获取年
        int year = c.get(Calendar.YEAR);
        System.out.println(year);
        //获取月
        int month = c.get(Calendar.MONTH)+1;
        System.out.println(month);
        //获取日
        int date = c.get(Calendar.DATE);
        System.out.println(date);
       //public void set(int field, int value)：将给定的日历字段设置为给定值。

        c.set(Calendar.YEAR,1111);
        c.set(Calendar.DATE,30);
        System.out.println(c.get(Calendar.YEAR)+"年"+(c.get(Calendar.MONTH)+1)+"月"+c.get(Calendar.DATE)+"日");
        // 1111年1月30日
        // 偏移100
        c.add(Calendar.YEAR,-100);
        System.out.println(c.get(Calendar.YEAR)+"年"+(c.get(Calendar.MONTH)+1)+"月"+c.get(Calendar.DATE)+"日");

        //public Date getTime()
        // 将一个日历对象转换成日期对象
        Date da= c.getTime();
        System.out.println(da);
    }
}

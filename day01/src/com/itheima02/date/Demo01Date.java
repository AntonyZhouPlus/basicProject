package com.itheima02.date;

import java.util.Date;

/*
   java.util.Date 表示特定的瞬间 精确到毫秒

     构造
       Date()   创建一个空参的Date对象 表示？时间呢
                创建了一个时间对象 表示当前计算机的时间 （以毫秒为单位）

       我当前计算机的时间2020年1月1日 0时2分

       Date(long time)  传递了一个毫秒值
           创建了一个时间对象，表示 基准时间+time 之后新生成的时间

          基准时间
            1970年1月1日00时00分00秒 零时区

            我们中国是东八区

       提供了一个 getTime() 把日期对象转换成对应的时间毫秒值

       重写了toString方法  展示时间的
 */
public class Demo01Date {
    public static void main(String[] args) {
       //创建Date对象
        Date date = new Date();

        System.out.println(date);

        System.out.println("--------演示带参构造-------");
        Date date2 = new Date(0);

        System.out.println("基准时间偏移了0："+date2);

        Date date3 = new Date(1000*60*60);

        System.out.println("基准时间偏移了3600000："+date3);

        // 我们的时间 都会与 基准时间产生一个差值   以毫秒计算的
        // 我们会将这个差值称为 时间毫秒值
        System.out.println("获取对应date对象的时间毫秒值：");
        System.out.println("date对象的时间毫秒值："+date.getTime());
        System.out.println("date2对象的时间毫秒值："+date2.getTime());
        System.out.println("date3对象的时间毫秒值："+date3.getTime());

    }
}

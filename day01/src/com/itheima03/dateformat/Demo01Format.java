package com.itheima03.dateformat;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
  java.text.DateFormat
      表示 日期格式化的抽象类
        定义了Date与String的转换
        格式化  按照指定格式 将Date对象 转换成字符串
        解析    按照指定格式 将字符串解析成Date对象

        重点在 指定格式

       学习它的子类 SimpleDateFormat

       构造

        SimpleDateFormat(String pattern)
        参数 pattern 是规则

        在API中有详解
          y---年
          M---月
          d---日
          H---时
          m---分
          s---秒

   格式化
   public String format(Date date)：将Date对象格式化为字符串。

 */
public class Demo01Format {
    public static void main(String[] args) {
        //创建我们的DateFormat对象
        // 比如我们定义一个规则  yyyy年MM月dd日  HH:mm:ss
                              // 2000年12月25日  12:12:12
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日  HH:mm:ss");

        //格式化当前时间
        // 获取当前时间日期对象
        Date date = new Date();
//        System.out.println(date);

        //格式化
        String str = sdf.format(date);

        System.out.println(str);
    }
}

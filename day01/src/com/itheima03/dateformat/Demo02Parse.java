package com.itheima03.dateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
  DateFormat
     解析功能
     public Date parse(String source)：将字符串解析为Date对象。
 */
public class Demo02Parse {

    public static void main(String[] args) throws ParseException {
        // 有一个时间字符串
        String strDate = "2000-01-02";
        // 使用解析时注意  我们创建的日期格式化对象的解析字符串 必须与 时间字符串对应
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        Date date= sdf.parse(strDate);

        System.out.println(date);
    }
}

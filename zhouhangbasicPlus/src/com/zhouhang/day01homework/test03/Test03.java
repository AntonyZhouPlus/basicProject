package com.zhouhang.day01homework.test03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/28 20:21
 * 1.已知日期字符串:"2015-10-20",将改日期字符串转换为日期对象
 * 2.将(1)中的日期对象转换为日历类的对象
 * 3.根据日期对象获取改日期是星期几,以及这一年的第几天
 * 4.通过键盘录入日期字符串，格式(2015-10-20)
 * 如输入：2015-10-20，输出"2015年--10月--20日 是 星期二，是2015年的第 293 天"
 */
public class Test03 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        String str = "2015-10-20";
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar c = Calendar.getInstance();

        System.out.println("请输入日期（eg:2015-10-20）");
        str = sc.next();
        d = sdf.parse(str);
        c.setTime(d);
        //        String[] strs = {"天","一","二","三","四","五","六"};
//        System.out.println(year+"年--"+month+"月--"+date+"日 是 星期"+strs[week]+"，是"+year+"年的第 "+day+" 天");

        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年--MM月--dd日 是 E，是yyyy年的第 D 天");
        System.out.println(sdf2.format(d));
    }
}

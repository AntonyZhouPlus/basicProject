package com.zhouhang.day01homework.test05;

import java.util.Calendar;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/28 20:40
 * 要求:利用Calendar类的方法判断当前年是闰年还是平年
 * 提示:
 * 闰年:二月有29天
 * 将日期设置为3月1号,然后倒退1天至2月底,求出2月底是多少天
 */
public class Test05 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.MONTH,2);
        c.set(Calendar.DATE,1);
        c.add(Calendar.DATE,-1);

        int febDate = c.get(Calendar.DATE);
        switch (febDate){
            case 28:
                System.out.println("今年是平年");
                break;
            case 29:
                System.out.println("今年是润年");
                break;
            default:
                System.out.println("日期有误");
        }
    }
}

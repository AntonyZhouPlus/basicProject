package com.zhouhang.day08;


/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/20 10:11
 */
public class Demo05Math {
    public static void main(String[] args) {
        // System.out.println(StrictMath.round(1.4999999999999999));
        System.out.println(Math.pow(2, 9999));
        System.out.println(Math.round(1.4999999999999999));
        System.out.println(Math.sqrt(4489419191981156159L));
        // 一个圆的半径为13，求圆的面积，要求结果保留2位小数（四舍五入）。
        System.out.println(Math.round(Math.pow(13, 2) * Math.PI * 100) / 100.0);
    }
}

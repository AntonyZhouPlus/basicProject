package com.zhouhang.day04;

/**
 * HomeWorkDay04
 *
 * @author Zhouhang Anthony
 * @date 2018/5/11 21:20
 */
public class HomeWorkDay04 {
    public static void main(String[] args) {
        System.out.println(getSum(1, 2));
        System.out.println(getSumDouble(1.0, 2.0));
        System.out.println(getPerimeter(1, 2));
        System.out.println(getArea(1, 2));


    }

    /*第二题：分析以下需求并实现
	1.定义方法，求出两个整数的和
	2.调用方法，输出结果*/
    public static int getSum(int a, int b) {
        return a + b;
    }

    /*第三题：分析以下需求并实现
	1.定义方法，求出两个小数的和
	2.调用方法，输出结果*/
    public static double getSumDouble(double a, double b) {
        return a + b;
    }

    /*第四题：分析以下需求并实现
	1.定义方法，求出长方形的周长
	2.调用方法，输出结果*/
    public static int getPerimeter(int length, int width) {
        return (length + width) * 2;
    }

    /*第五题：分析以下需求并实现
	1.定义方法，求出长方形的面积
	2.调用方法，输出结果*/
    public static int getArea(int length, int width) {
        return length * width;
    }


}

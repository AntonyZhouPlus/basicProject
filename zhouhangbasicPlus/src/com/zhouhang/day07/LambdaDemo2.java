package com.zhouhang.day07;

/**
 * com.zhouhang.day07
 *
 * @author zhouhang
 * @date 2018/6/7 下午4:36
 */
public class LambdaDemo2 {
    public static void main(String[] args) {

        add(1,2,(x)->x);
    }

    public static void add(int a,int b,Calc i){
        System.out.println(i.add(a));

    }}

interface Calc {
    double add(double a);

}

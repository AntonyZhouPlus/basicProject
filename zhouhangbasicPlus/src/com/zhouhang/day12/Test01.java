package com.zhouhang.day12;

/**
 * com.zhouhang.day12
 *
 * @author zhouhang
 * @date 2018/6/14 上午10:43
 */
public class Test01 {
    public static void main(String[] args) {
        print(2,123,Math::pow);
    }
    public static void print(int a, int b, InterCal i){
        System.out.println(i.cal(a, b));
    }
}

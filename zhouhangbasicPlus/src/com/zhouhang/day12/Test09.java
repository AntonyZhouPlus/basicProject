package com.zhouhang.day12;

/**
 * com.zhouhang.day12
 *
 * @author zhouhang
 * @date 2018/6/14 下午4:28
 */
public class Test09 {

    // 要求：调用method方法传递一个"123" ,输出整数的12300
    public static void main(String[] args) {
        method(Integer::parseInt,"123");
        new Husband().beHappy();
    }

    public static void method(InterB i, String str) {
        System.out.println(i.getNum(str) * 100);
    }

}

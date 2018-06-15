package com.zhouhang.day12;

/**
 * com.zhouhang.day12
 *
 * @author zhouhang
 * @date 2018/6/14 上午11:12
 * 定义函数式接口，用上注解来检查是否是函数式接口
 * 在测试类中定义一个方法，方法的返回值是这个接口类型
 * 在main方法中调用这个方法
 */
public class Test03 {
    public static void main(String[] args) {
        InterCal xxx = method();
        System.out.println(xxx.cal(1, 2));
    }
    public static InterCal method() {
        return (a,b)->a+b;
    }
}

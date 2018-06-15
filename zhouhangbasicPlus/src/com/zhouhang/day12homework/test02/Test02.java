package com.zhouhang.day12homework.test02;

/**
 * com.zhouhang.day12homework.test02
 *
 * @author zhouhang
 * @date 2018/6/14 下午7:29
 * 定义一个函数式接口IntCalc,其中抽象方法int calc(int a , int b)，使用注解@FunctionalInterface
 * 在测试类中定义static void getProduct(int a , int b ,IntCalc calc), 该方法的预期行为是使用calc得到a和b的乘积并打印结果
 * 测试getProduct(),通过lambda表达式完成需求
 */
public class Test02 {
    public static void main(String[] args) {
        getProduct(3,2,(x,y)->x*y);
    }

    static void getProduct(int a,int b,IntCalc calc) {
        System.out.println(calc.calc(a, b));
    }
}

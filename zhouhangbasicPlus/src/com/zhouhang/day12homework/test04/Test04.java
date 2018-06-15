package com.zhouhang.day12homework.test04;

import java.util.Random;

/**
 * com.zhouhang.day12homework.test04
 *
 * @author zhouhang
 * @date 2018/6/14 下午7:39
 * 定义一个函数式接口NumberSupplier,其中抽象方法int getNum(int...nums)，使用注解@FunctionalInterface
 * 在测试类中定义static void getRandomNumFromOneToNum(int num , NumberSupplier ns), 该方法的预期行为是使用ns得到一个从1到num(包含1和num)之间的随机数并打印
 * 在测试类中定义static void getRandomNumFromAToB(int a ,int b, NumberSupplier ns), 该方法的预期行为是使用ns得到一个从a到b(包含a和b)之间的随机数并打印
 * 在测试类中定义static void getRandomNumFromArray(int[] nums, NumberSupplier ns), 该方法的预期行为是使用ns从数组nums中获取一个随机元素并打印
 * 主方法中测试调用以上三个方法，使用方法引用完成需求
 */
public class Test04 {
    public static void main(String[] args) {
        RandomUtil ru = new RandomUtil();
        getRandomNumFromOneToNum(3,ru::nextInt);
        getRandomNumFromAtoB(5,10,ru::nextInt);
        getRandomNumFromArray(new int[]{99,0,1,8,16},ru::nextInt);
    }
    static void getRandomNumFromOneToNum(int num, NumberSupplier ns) {
        System.out.println(ns.getNum(num));
    }
    static void getRandomNumFromAtoB(int a, int b, NumberSupplier ns) {
        System.out.println(ns.getNum(a,b));
    }
    static void getRandomNumFromArray(int[] nums, NumberSupplier ns) {
        System.out.println(ns.getNum(nums));
    }
}

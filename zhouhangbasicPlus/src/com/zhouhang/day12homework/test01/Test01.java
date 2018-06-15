package com.zhouhang.day12homework.test01;

/**
 * com.zhouhang.day12homework.test01
 *
 * @author zhouhang
 * @date 2018/6/14 下午7:24
 *定义一个函数式接口CurrentTimePrinter,其中抽象方法void printCurrentTime()，使用注解@FunctionalInterface
 * 在测试类中定义static void showLongTime(CurrentTimePrinter timePrinter)，该方法的预期行为是使用timePrinter打印系统当前毫秒值
 * 测试showLongTime(),通过lambda表达式完成需求
 */
public class Test01 {
    public static void main(String[] args) {
        showLongTime(()-> System.out.println(System.currentTimeMillis()));
    }

    static void showLongTime(CurrentTimePrinter timePrinter) {
        timePrinter.printCurrentTime();
    }

}

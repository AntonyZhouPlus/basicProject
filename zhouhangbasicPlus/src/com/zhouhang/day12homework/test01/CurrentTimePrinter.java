package com.zhouhang.day12homework.test01;

/**
 * com.zhouhang.day12homework.test01
 *
 * @author zhouhang
 * @date 2018/6/14 下午7:25
 * 定义一个函数式接口CurrentTimePrinter,其中抽象方法void printCurrentTime()，使用注解@FunctionalInterface
 * 在测试类中定义static void showLongTime(CurrentTimePrinter timePrinter)，该方法的预期行为是使用timePrinter打印系统当前毫秒值
 * 测试showLongTime(),通过lambda表达式完成需求
 */
@FunctionalInterface
public interface CurrentTimePrinter {
    void printCurrentTime();
}

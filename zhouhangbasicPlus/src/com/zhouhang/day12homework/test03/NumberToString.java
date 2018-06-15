package com.zhouhang.day12homework.test03;

/**
 * com.zhouhang.day12homework.test03
 *
 * @author zhouhang
 * @date 2018/6/14 下午7:33
 * 定义一个函数式接口NumberToString,其中抽象方法String convert(int num)，使用注解@FunctionalInterface
 * 在测试类中定义static void decToHex(int num ,NumberToString nts), 该方法的预期行为是使用nts将一个十进制整数转换成十六进制表示的字符串，tips:已知该行为与Integer类中的toHexString方法一致
 * 测试decToHex (),使用方法引用完成需求
 */
@FunctionalInterface
public interface NumberToString {
    String convert(int num);
}

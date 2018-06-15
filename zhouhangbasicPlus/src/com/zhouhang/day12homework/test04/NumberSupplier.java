package com.zhouhang.day12homework.test04;

/**
 * com.zhouhang.day12homework.test04
 *
 * @author zhouhang
 * @date 2018/6/14 下午7:43
 */
@FunctionalInterface
public interface NumberSupplier {
    int getNum(int...nums);
}

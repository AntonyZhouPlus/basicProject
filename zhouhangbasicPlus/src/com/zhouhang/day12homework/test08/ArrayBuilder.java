package com.zhouhang.day12homework.test08;

/**
 * com.zhouhang.day12homework.test08
 *
 * @author zhouhang
 * @date 2018/6/15 上午9:03
 */
@FunctionalInterface
public interface ArrayBuilder<T> {
    T[] buildArray(int length);
}

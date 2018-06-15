package com.zhouhang.day12homework.test07;

/**
 * com.zhouhang.day12homework.test11
 *
 * @author zhouhang
 * @date 2018/6/15 上午8:57
 */
@FunctionalInterface
public interface BeanFactory<T> {
    T getBean();
}

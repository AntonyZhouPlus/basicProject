package com.zhouhang.day12;

import java.util.function.Supplier;

/**
 * com.zhouhang.day12
 *
 * @author zhouhang
 * @date 2018/6/14 下午3:03
 * 我们知道, `Supplier`为JDK为我们提供的函数式接口.
 * @FunctionalInterface
 * public interface Supplier<T> {
 *     T get();
 * }
 *
 * 在测试类中定义`getSupplier`方法, 用来返回该接口的实例.
 * public Supplier<String> getSupplier(){
 *     方法体;
 * }
 */
public class Test04 {
    public static void main(String[] args) {
        System.out.println(stringSupplier().get());
    }

    public static Supplier<String> stringSupplier() {
        return ()->"131231";
    }
}

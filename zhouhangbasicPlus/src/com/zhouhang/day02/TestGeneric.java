package com.zhouhang.day02;

import java.util.ArrayList;
import java.util.Collection;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/29 17:47
 */
public class TestGeneric {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<String>();
        Collection<Integer> i = new ArrayList<>();

        method(c);
        method(i);
    }

    public static void method(Collection<?> c) {
    }
}

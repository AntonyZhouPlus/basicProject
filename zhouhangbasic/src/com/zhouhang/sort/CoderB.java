package com.zhouhang.sort;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/22 11:59
 */
public class CoderB {
    public static long testTime(IMethod m){
        long start = System.currentTimeMillis();
        m.timeTestMethod();
        long end = System.currentTimeMillis();

        return end - start;
    }
}

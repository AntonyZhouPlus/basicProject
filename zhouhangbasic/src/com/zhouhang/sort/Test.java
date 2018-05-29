package com.zhouhang.sort;

import java.util.ArrayList;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/22 12:04
 */
public class Test {
    public static void main(String[] args) {
        IMethod m = new CoderA();
        System.out.println(CoderB.testTime(m));
    }

}

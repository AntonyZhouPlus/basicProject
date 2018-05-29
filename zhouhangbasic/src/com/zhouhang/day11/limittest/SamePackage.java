package com.zhouhang.day11.limittest;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/24 11:46
 */
public class SamePackage {
    public static void method(){
        MyClass test = new MyClass();
        int i = test.num2 + test.num3 + test.num4;
    }
}

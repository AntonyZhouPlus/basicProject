package com.zhouhang.day10;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/21 15:34
 */
public interface InterDemo {
    public static final int num = 666;
    public abstract void method();
    public default void methodDefault(){
        System.out.println("methodDefault");
    }
    public static void methodStatic(){
        System.out.println("methodStatic");
    }
}

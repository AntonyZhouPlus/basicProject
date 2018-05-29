package com.zhouhang.day06;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/14 19:44
 */
public class Test2 {
    public static void main(String[] args) {
        Phone iphone8 = new Phone();
        Phone s8 = new Phone("SAMSUNG", 5999.0, "Black");


        iphone8.setBrand("Apple");
        iphone8.getBrand();
        s8.getBrand();
    }
}

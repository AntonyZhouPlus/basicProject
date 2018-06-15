package com.zhouhang.day12;

/**
 * com.zhouhang.day12
 *
 * @author zhouhang
 * @date 2018/6/14 下午3:32
 * @FunctionalInterface public interface Inter{
 * String concat(String str1, String str2);
 * }
 * public void method(Inter inter,String str1, String str2){
 * System.out.println(inter.concat(str1, str2));
 * }
 */
public class Test07 {
    public static void method(Inter inter, String str1, String str2) {
        System.out.println(inter.concat(str1, str2));
    }

    public static void main(String[] args) {
        method(String::concat,"1231","1231");
    }
}

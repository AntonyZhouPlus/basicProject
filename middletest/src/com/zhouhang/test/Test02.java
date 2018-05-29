package com.zhouhang.test;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/15 10:02
 */

/*写两个方法分别统计5位数的回文数个数和7位数的回文数个数，并将个数返回，
    最后拿到两个方法的返回值，计算出两种回文数相差的个数。
    （注：5位数的回文数 如:12321    7位数的回文数 如:1234321 ）*/
public class Test02 {
    public static void main(String[] args) {
        System.out.println("两种回文数相差的个数: " +(get7Count()-get5Count()));
    }

    //统计5位数的回文数个数
    public static int get5Count() {
        int count = 0;

        for (int i = 10000; i <= 99999; i++) {
            int index1 = i % 10;
            int index10 = i / 10 % 10;
            int index1000 = i / 1000 % 10;
            int index10000 = i / 10000 % 10;

            if(index10000 == index1 && index1000 == index10){
                count++;
            }
        }

        return count;
    }

    //统计7位数的回文数个数
    public static int get7Count() {
        int count = 0;

        for (int i = 1000000; i <= 9999999; i++) {
            int index1 = i % 10;
            int index10 = i / 10 % 10;
            int index100 = i / 100 % 10;
            int index10000 = i / 10000 % 10;
            int index100000 = i / 100000 % 10;
            int index1000000 = i / 1000000 % 10;

            if(index1000000 == index1 && index100000 == index10 && index10000 == index100){
                count++;
            }
        }

        return count;
    }


}

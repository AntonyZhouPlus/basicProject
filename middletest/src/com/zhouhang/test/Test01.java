package com.zhouhang.test;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/15 9:51
 */

/*使用for循环,求出1-1000之间的个位不包含1十位不包含2百位不包含3的所有奇数之和.*/
public class Test01 {

    public static void main(String[] args) {
        methodSum();
    }

    public static void methodSum() {

        int sum = 0; // 总和

        for (int i = 1; i <= 1000; i++) {
            int oneIndex = 0; // 个位数字
            int tenIndex = 0; // 十位数字
            int hanIndex = 0; // 百位数字

            if (i % 2 != 0) {
                oneIndex = i % 10;
                tenIndex = i / 10 % 10;
                hanIndex = i / 100 % 10;
                if (oneIndex != 1 && tenIndex != 2 && hanIndex != 3) {
                    sum += i;
                }
            }

        }

        System.out.println("1-1000之间的个位不包含1十位不包含2百位不包含3的所有奇数之和为：" + sum);
    }
}

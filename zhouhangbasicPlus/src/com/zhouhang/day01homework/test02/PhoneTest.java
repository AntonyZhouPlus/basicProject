package com.zhouhang.day01homework.test02;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/28 9:32
 */
public class PhoneTest {
    public static void main(String[] args) {
        Phone one = new Phone("苹果","白色",165);
        Phone two = new Phone("三星","白色",165);
        Phone three = new Phone("苹果","白色",165);
        Phone p = new Phone();
        Phone p2 = new Phone();
        System.out.println(p.equals(p2));

        System.out.println(one);
        System.out.println(two);
        System.out.println(three);

        System.out.println("第一台手机和第二台一样吗"+one.equals(two));
        System.out.println("第一台手机和第三台一样吗"+one.equals(three));
    }
}

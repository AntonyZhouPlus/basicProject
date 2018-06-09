package com.zhouhang.day08homework.test02;

/**
 * com.zhouhang.day08homework.test02
 *
 * @author zhouhang
 * @date 2018/6/8 下午8:37
 * 描述:
 * 用递归实现不死神兔
 * 故事得从西元1202年说起，话说有一位意大利青年，名叫斐波那契。
 * 在他的一部著作中提出了一个有趣的问题：假设一对刚出生的小兔一个月后就能长成大兔，
 * 再过一个月就能生下一对小兔，并且此后每个月都生一对小兔，没有发生死亡，
 * 问：现有一对刚出生的兔子2年后(24个月)会有多少对兔子?
 */
public class Rabbit {
    public static void main(String[] args) {
        System.out.println(getRabbit(24));

    }

    public static int getRabbit(int num) {
        if (num == 1 || num == 2) {
            return 1;
        } else {
            return getRabbit(num - 1) + getRabbit(num - 2);
        }
    }
}

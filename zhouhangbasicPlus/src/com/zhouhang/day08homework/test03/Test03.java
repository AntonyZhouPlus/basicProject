package com.zhouhang.day08homework.test03;

/**
 * com.zhouhang.day08homework
 *
 * @author zhouhang
 * @date 2018/6/8 下午8:39
 * 描述:猴子吃桃子问题，猴子第一天摘下若干个桃子，当即吃了快一半，还不过瘾，
 * 又多吃了一个。第二天又将仅剩下的桃子吃掉了一半，又多吃了一个。
 * 以后每天都吃了前一天剩下的一半多一个。
 * 到第十天，只剩下一个桃子。试求第一天共摘了多少桃子？
 */

public class Test03 {
    public static void main(String[] args) {
        System.out.println(monkeyEat(10));


    }

    public static int monkeyEat(int day) {
        if (day == 1) {
            return 1;
        } else {
            return (monkeyEat(day - 1) + 1) * 2;

        }
    }
}

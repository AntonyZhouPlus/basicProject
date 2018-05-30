package com.zhouhang.day02homework.test01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/30 8:57
 * 1.生成10个1至100之间的随机整数(不能重复)，存入一个List集合
 * 2.然后利用迭代器和增强for循环分别遍历集合元素并输出
 * 3.如：15 20 19 40 46 33 65 42 75 61
 */
public class Test01 {
    private static final int NUM_INT = 10;

    public static void main(String[] args) {
        Random rd = new Random();
        ArrayList<Integer> list = new ArrayList<>();

        while (list.size() < NUM_INT) {
            int num = rd.nextInt(100) + 1;
            if (!list.contains(num)) {
                list.add(num);
            }
        }

        Iterator<Integer> iterator = list.iterator();
        // 迭代器 遍历
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        System.out.println();
        System.out.println("================");

        //增强for 遍历
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
    }
}
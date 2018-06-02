package com.zhouhang.day03homework.test01;

import java.util.*;

/**
 * com.zhouhang.day03homework.Test01
 *
 * @author zhouhang
 * @date 2018/6/1 下午7:23
 * 1.定义一个长度为10的int数组,并存入10个int类型的数据,其中有一些数据是重复的
 * 2.利用集合的知识对数组进行去重,产生新数组,不能改变数组中原来数字的大小顺序
 * 3.打印新数组中的内容
 */
public class Test01 {

    public static void main(String[] args) {
        int[] array = new int[]{1,2,2,3,4,5,6,7,7,8};

        HashSet<Integer> set = new LinkedHashSet<>();
        for (int i : array) {
            set.add(i);
        }

        int[] newArray = new int[set.size()];
        Iterator<Integer> iterator = set.iterator();

        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = iterator.next();
        }

        System.out.println(Arrays.toString(newArray));

    }

}

package com.zhouhang.day01;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/28 10:28
 */

import java.util.ArrayList;
import java.util.List;

public class HashTest {

    private static final int SIZE = 99999;

    public static void main(String[] args) {
        //创建列表存放对象
        List<Object> list = new ArrayList<Object>();
        int existNumber = 0;
        //新建SIZE个对象，如果toStirng代表的是内存地址，地址是不会重复的，
        //那么list中应该不会存在重复的元素。
        //list的大小应该为SIZE
        for (int i = 0; i < SIZE; i++) {
            Object obj = new Object();
            if (list.contains(obj.toString())) {
                System.out.println("对象：" + obj.toString() + "已存在!");
                existNumber++;
            } else
                list.add(obj.toString());
        }
        System.out.println("列表List的大小:" + list.size());
        System.out.println("重复元素的个数：" + existNumber);
        System.out.println("===============华丽的分割线===============");
        //清空list
        list.clear();
        existNumber = 0;
        //新建一个对象的时候，变量名是对这个对象的应用（相当于对象的"地址"）
        //利用这个原理，我们再测试
        for (int i = 0; i < SIZE; i++) {
            Object obj = new Object();
            if (list.contains(obj)) {
                System.out.println("对象：" + obj + "已存在!");
                existNumber++;
            } else
                list.add(obj.toString());
        }
        System.out.println("列表List的大小:" + list.size());
        System.out.println("重复元素的个数：" + existNumber);
    }
}
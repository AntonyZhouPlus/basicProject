package com.zhouhang.day02homework.test05;

import java.util.ArrayList;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/29 17:16
 * 定义一个泛型方法，此方法接收一个集合以及此集合的一个元素，返回此元素在集合中的位置，如果不存在则返回-1
 */
public class Test05 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int x = 2;
        System.out.println(x + "集合中的位置:" + method(list, x));
    }

    public static <E> int method(ArrayList<E> list, E e) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(e)) {
                return i;
            }
        }

        return -1;
    }
}

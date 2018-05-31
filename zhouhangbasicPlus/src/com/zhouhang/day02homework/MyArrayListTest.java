package com.zhouhang.day02homework;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/30 15:08
 */
public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println(list);
        list.remove(6);
        System.out.println(list);

    }
}

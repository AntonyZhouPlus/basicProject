package com.zhouhang.day07;

import com.zhouhang.day02.Person;

import java.util.ArrayList;

/**
 * com.zhouhang.day07
 *
 * @author zhouhang
 * @date 2018/6/7 下午4:16
 */
public class LambdaDemo {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();

        list.add(new Person("A",12));
        list.add(new Person("A",31));
        list.add(new Person("A",23));
        list.add(new Person("A",16));
        list.add(new Person("A",18));
        list.add(new Person("A",15));

        list.sort((p1,p2)-> p1.getAge() - p2.getAge());

        System.out.println(list);

    }
}

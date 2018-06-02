package com.zhouhang.day03;

import java.util.HashSet;

/**
 * com.zhouhang.day03
 *
 * @author zhouhang
 * @date 2018/6/1 下午5:04
 */
public class HashDemo {
    public static void main(String[] args) {
        Person one = new Person("a",12);
        Person two = new Person("a",12);
        Person three = new Person("c",12);
        Person four = new Person("d",12);

        HashSet<Person> set = new HashSet<>();
        set.add(one);
        set.add(two);
        set.add(three);
        set.add(four);

        for (Person person : set) {
            System.out.println(person);
        }
    }

}

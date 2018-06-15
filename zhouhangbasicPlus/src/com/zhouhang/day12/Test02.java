package com.zhouhang.day12;

import java.util.Arrays;
import java.util.Comparator;

/**
 * com.zhouhang.day12
 *
 * @author zhouhang
 * @date 2018/6/14 上午10:59
 */
public class Test02 {
    public static void main(String[] args) {
        Person[] peoples ={new Person("A",123),
                new Person("B",321),
                new Person("C",222),};
        Arrays.sort(peoples, Comparator.comparingInt(Person::getAge));
//        Arrays.sort(peoples, (x,y)->x.getAge()-y.getAge());
        System.out.println(Arrays.toString(peoples));

    }
}

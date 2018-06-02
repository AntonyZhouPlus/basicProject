package com.zhouhang.day04;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * com.zhouhang.day04
 *
 * @author zhouhang
 * @date 2018/6/2 下午2:43
 */
public class MapDemo2 {
    public static void main(String[] args) {
        Person p1 = new Person("A", 1);
        Person p2 = new Person("B", 2);
        Person p3 = new Person("C", 3);
        Person p4 = new Person("D", 4);

        Map<Integer, Person> map = new HashMap<>();
        map.put(1, p1);
        map.put(2, p2);
        map.put(3, p3);
        map.put(4, p4);

        Set<Integer> keys = map.keySet();
        for (Integer key : keys) {
            System.out.println(key + "+" + map.get(key));
        }

        System.out.println("============");

        Set<Map.Entry<Integer, Person>> entrySet = map.entrySet();
        for (Map.Entry<Integer, Person> entry : entrySet) {
            System.out.println(entry.getKey() + "+" + entry.getValue());
        }


    }
}

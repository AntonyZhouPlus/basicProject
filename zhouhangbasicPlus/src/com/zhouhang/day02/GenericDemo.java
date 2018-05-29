package com.zhouhang.day02;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/29 16:22
 */
public class GenericDemo {
    public static void main(String[] args) {

        Box<String> b = new Box<String>();
        b.setName("boxName");
        System.out.println(b.getName());

    }

    public static void test01() {
        ArrayList<Person> list = new ArrayList<Person>();
        list.add(new Person("老王", 12));
        list.add(new Person("老刘", 12));
        list.add(new Person("老周", 12));

        for (Person person : list) {
            System.out.println(person);
        }

        Iterator<Person> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

package com.zhouhang.day02;

import java.util.*;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/29 11:39
 */
public class IteratorDemo {


    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("白夜行");
        c.add("解忧杂货铺");
        c.add("秘密");
        c.add("嫌疑人X的现身");
        c.add("东方快车杀人案");

        System.out.println(c.size());


        ListIterator<String> it = ((ArrayList<String>)c).listIterator();
        while (it.hasNext()){
            it.add("213123");
            System.out.println(it.next());
        }
        System.out.println("=====");
        for(String s : c){
            System.out.println(s);
        }

    }

}

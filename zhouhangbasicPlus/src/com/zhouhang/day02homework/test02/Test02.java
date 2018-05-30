package com.zhouhang.day02homework.test02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/29 19:01
 * 1.定义List集合，存入多个字符串
 * 2.删除集合元素字符串中包含0-9数字的字符串(只要字符串中包含0-9中的任意一个数字就需要删除此整个字符串)
 * 3.然后利用迭代器遍历集合元素并输出
 */
public class Test02 {
    public static void main(String[] args) {
        
        ArrayList<String> list = new ArrayList<>();
        list.add("i don't have num");
        list.add("i 45have num32");
        list.add("i hav23e num");
        list.add("i don't have num too");
        list.add("i19 have num");

        filterNum(list);
        System.out.println(list);

    }
    
    public static void filterNum(Collection<String> c){
        Iterator<String> it = c.iterator();
        while (it.hasNext()){

            char[] chars = it.next().toCharArray();

            for (int i = 0; i < chars.length; i++) {
                if (chars[i] >= '0' && chars[i] <= '9') {
                    it.remove();
                    break;
                }
            }

        }
    }
}

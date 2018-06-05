package com.zhouhang.day04homework.test01;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * com.zhouhang.day04homework.Test01
 *
 * @author zhouhang
 * @date 2018/6/2 下午8:10
 * 分析以下需求，并用代码实现
 * 1.定义一个map集合,key为String类型的姓名,value为String类型地址,存入数据多条数据(假设不存在重名的情况),并用多种方式遍历
 * 2.定义一个map集合,key为Student类型的对象,value为String类型的地址,存入数据多条数据(需要加入对象的唯一性判断)
 * (1)定义一个学生类Student，包含属性：姓名(String name)、年龄(int age)、成绩(int score)
 * (2)定义Map集合，用Student对象作为key，用字符串(此表示表示学生的住址)作为value
 * (3)利用四种方式遍历Map集合中的内容，格式：key::value
 */
public class Test01 {
    public static void main(String[] args) {
        Map<Student,String> map = new HashMap<>();
        map.put(new Student("A",18,100),"123");
        map.put(new Student("B",18,100),"321");
        map.put(new Student("C",18,100),"312");
        map.put(new Student("D",18,100),"132");

        for (Student s : map.keySet()) {
            System.out.println(s + "::" + map.get(s));
        }

        System.out.println("==========");


        for (Map.Entry<Student, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "::" + entry.getValue());
        }

        System.out.println("==========");

        Iterator<Map.Entry<Student, String>> it = map.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<Student, String> next = it.next();
            System.out.println(next.getKey() + "::" + next.getValue());
        }

        System.out.println("==========");

        for (String s : map.values()) {
            System.out.println(s);
        }

    }

    private static void test01() {
        Map<String, String> map = new HashMap<>();
        map.put("A", "123");
        map.put("B", "321");
        map.put("C", "132");

        for (String key : map.keySet()) {
            System.out.println(key + "=" + map.get(key));
        }

        System.out.println("==========");

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }
}

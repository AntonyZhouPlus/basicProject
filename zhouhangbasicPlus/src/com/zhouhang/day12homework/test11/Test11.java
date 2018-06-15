package com.zhouhang.day12homework.test11;

import java.util.*;

/**
 * com.zhouhang.day12homework.Test11
 *
 * @author zhouhang
 * @date 2018/6/14 下午8:46
 */
public class Test11 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        List<Student> students = List.of(
                new Student("谢霆锋", 85),
                new Student("章子怡", 64),
                new Student("刘亦菲", 77),
                new Student("黄晓明", 33),
                new Student("陈小春", 92));
        list.addAll(students);

        Collections.sort(list,Comparator.comparingInt(Student::getScore));
        for (Student student : list) {
            System.out.println(student);
        }
    }

    private static void test02(ArrayList<Student> list) {
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getScore()-o2.getScore();
            }
        });
        System.out.println(list);
    }

    private static void test01(ArrayList<Student> list) {
        Collections.sort(list,(s1, s2)->s1.getScore()-s2.getScore());
        System.out.println(list);
    }

}

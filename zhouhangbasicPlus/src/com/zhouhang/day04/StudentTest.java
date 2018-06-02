package com.zhouhang.day04;

import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

/**
 * com.zhouhang.day04
 *
 * @author zhouhang
 * @date 2018/6/2 下午4:50
 */
public class StudentTest {
    public static void main(String[] args) {
        Student stu1 = new Student("A", 12, 30);
        Student stu2 = new Student("B", 12, 31);
        Student stu3 = new Student("V", 12, 30);

        TreeSet<Student> treeSet = new TreeSet<>();
        Collections.addAll(treeSet, stu1, stu2, stu3);

        System.out.println(treeSet);

        TreeSet<Student> treeSet2 = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getName().equals(o2.getName())) {
                    if (o2.getAge() == o2.getAge()) {
                        if (o1.getScore() == o2.getScore()) {
                            return 0;
                        }
                    }
                }
                return 1;
            }
        });

        Collections.addAll(treeSet2, stu1, stu2, stu3);
        System.out.println(treeSet2);

    }
}

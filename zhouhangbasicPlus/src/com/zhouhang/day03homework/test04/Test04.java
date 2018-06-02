package com.zhouhang.day03homework.test04;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

/**
 * com.zhouhang.day03homework.Test04
 *
 * @author zhouhang
 * @date 2018/6/1 下午7:59
 * 1.创建10个学生对象(其中有两个学员信息完全相同)存入集合中
 * 2.去除重复的学员并遍历打印剩余学员信息(分别利用普通for循环、增强for循环、迭代器遍历)
 * 3.打印最高分的学员信息
 * 4.打印平均分
 * 5.打印不及格的学员信息及数量
 */
public class Test04 {

    public static void main(String[] args) {
        Student stu1 = new Student("A", 18, 90);
        Student stu2 = new Student("B", 18, 88);
        Student stu3 = new Student("C", 18, 66);
        Student stu4 = new Student("D", 18, 54);
        Student stu5 = new Student("E", 18, 35);
        Student stu6 = new Student("F", 18, 99);
        Student stu7 = new Student("G", 18, 37);
        Student stu8 = new Student("H", 18, 56);
        Student stu9 = new Student("I", 18, 77);
        Student stu10 = new Student("I", 18, 77);

        HashSet<Student> set = new HashSet<>();
        Collections.addAll(set, stu1, stu2, stu3, stu4, stu5, stu6, stu7, stu8, stu9, stu10);

        Object[] array = set.toArray();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        System.out.println("==========");

        for (Student student : set) {
            System.out.println(student);
        }
        System.out.println("==========");

        Iterator<Student> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        int max = stu1.getScore();
        int maxIndex = 0;
        int sum = 0;
        int count = 0;
        System.out.println("=============");
        System.out.println("不及格：");
        for (int i = 0; i < array.length; i++) {
            Student stu = (Student) array[i];
            sum += stu.getScore();
            if (stu.getScore() > max) {
                maxIndex = i;
            }
            if (stu.getScore() < 60) {
                System.out.println(stu);
                count++;
            }
        }
        System.out.println("不及格人数为：" + count);

        System.out.println("============");
        System.out.println("成绩最好的学生:");
        System.out.println(array[maxIndex]);
        System.out.println("平均分：");
        System.out.println(sum / array.length);


    }

}

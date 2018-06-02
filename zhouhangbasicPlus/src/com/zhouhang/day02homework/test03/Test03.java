package com.zhouhang.day02homework.test03;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/30 9:46
 * 2.创建5个Student对象，给对象的成员变量进行赋值，将并存入合适的集合中
 * 3.统计不及格的学生人数，并输出
 * 4.输出成绩最好的学生的个人信息
 */
public class Test03 {
    public static void main(String[] args) {
        Student stu1 = new Student("a",10,80);
        Student stu2 = new Student("b",11,55);
        Student stu3 = new Student("c",12,60);
        Student stu4 = new Student("d",13,34);
        Student stu5 = new Student("e",14,100);

        HashSet<Student> students = new HashSet<>();
        students.add(stu1);
        students.add(stu2);
        students.add(stu3);
        students.add(stu4);
        students.add(stu5);

        int count = 0;
        int max = 0;
        Student best = new Student();
        for (Student student : students) {
            if (student.getScore() <= 60) {
                count++;
            }
            max = max > student.getScore() ? max : student.getScore();
        }
        for (Student student : students) {
            if(student.getScore() == max){
                best = student;
                System.out.println("best:"+best);
            }
        }
        System.out.println("count:"+count);
    }
}

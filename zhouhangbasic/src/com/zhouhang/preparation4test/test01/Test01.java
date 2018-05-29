package com.zhouhang.preparation4test.test01;

import java.util.ArrayList;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/23 15:47
 */
public class Test01 {
    public static void main(String[] args) {
        Teacher one = new Teacher("王宇",3,"java");
        Teacher two = new Teacher("张强",5,"python");
        Teacher three = new Teacher("郝宇",10,"php");
        ArrayList<Teacher> teachers = new ArrayList<Teacher>();

        teachers.add(one);
        teachers.add(two);
        teachers.add(three);
        System.out.println(teachers);

        System.out.println("====================");

        for (int i = 0; i < teachers.size(); i++) {
            if (teachers.get(i).getAge() < 5) {
                System.out.println(teachers.get(i));
            }
        }
    }
}

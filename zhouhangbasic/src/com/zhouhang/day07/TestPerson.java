package com.zhouhang.day07;

import java.util.Scanner;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/17 11:55
 */
public class TestPerson {
    public static void main(String[] args) {
        Person[] persons = new Person[4];
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            Person p = new Person();
            System.out.println("请输入第" + (i+1) + "个人的年龄");
            persons[i] = p;
            persons[i].setAge(new Scanner(System.in).nextInt());
            sum += persons[i].getAge();
        }

        System.out.println(sum / persons.length);


    }
}

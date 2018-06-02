package com.zhouhang.day03homework.test05;

import java.util.ArrayList;
import java.util.Collections;

/**
 * com.zhouhang.day03homework.Test05
 *
 * @author zhouhang
 * @date 2018/6/1 下午8:43
 * 查看API中ArrayList集合中的以下方法：
 * (1)boolean add(E e) 方法
 * (2)<T> T[] toArray(T[] a)方法
 * (3)boolean addAll(Collection<? extends E> c)方法
 *
 * (1)ArrayList集合中存入5个Student对象，将ArrayList集合转成对应的数组Studentp[]，并遍历打印数组中的元素
 * (2)定义一个存储Person对象的ArrayList集合对象list1，并存入2个Person对象，定义一个存储Student对象的ArrayList集合对象list2，
 * 并存入2个Student对象，调用addAll方法将list2的全部内容添加到list1中，遍历打印list1中的内容
 */
public class Test05 {
    public static void main(String[] args) {
        Student stu1 = new Student("A", 1, 1);
        Student stu2 = new Student("A", 2, 2);
        Student stu3 = new Student("A", 3, 3);
        Student stu4 = new Student("A", 4, 4);
        Student stu5 = new Student("A", 5, 5);

        ArrayList<Student> list = new ArrayList<>();
        Collections.addAll(list, stu1, stu2, stu3, stu4, stu5);

        Student[] studentp = list.toArray(new Student[list.size()]);
        for (Student student : studentp) {
            System.out.println(student);
        }

        ArrayList<Person> list1 = new ArrayList<>();
        list1.add(new Person("B",1,1)) ;
        list1.add(new Person("B",2,2)) ;
        ArrayList<Student>list2 = new ArrayList<>();
        list2.add(stu1);
        list2.add(stu2);
        list1.addAll(list2);
        System.out.println("============");
        for (Person person : list1) {
            System.out.println(person);
        }
    }
}

package com.zhouhang.day10homework;

import com.zhouhang.day04.Student;

import java.io.*;
import java.util.ArrayList;

/**
 * com.zhouhang.day10homework
 *
 * @author zhouhang
 * @date 2018/6/12 下午4:29
 * 定义一个学生类，成员变量有姓名，年龄，性别，提供setters和getters方法以及构造方法
 * 定义一个测试类，在测试类创建多个学生对象保存到集合中，然后将集合存储到当前项目根目录下的stus.txt文件中。
 */
public class Test10 {
    public static void main(String[] args) {
        ArrayList<Student> list =new ArrayList<>();
        list.add(new Student("A",1,1));
        list.add(new Student("B",1,1));
        list.add(new Student("C",1,1));

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("stu.txt"));
             ObjectInputStream ois = new ObjectInputStream(new FileInputStream("stu.txt"))){
            oos.writeObject(list);
            Object o = ois.readObject();
            System.out.println(o);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}

package com.zhouhang.day10homework;

import com.zhouhang.day04.Student;

import java.io.*;

/**
 * com.zhouhang.day10homework
 *
 * @author zhouhang
 * @date 2018/6/12 下午3:55
 * 定义一个学生类，包含姓名，年龄，性别等成员变量，
 * 提供setters和getters方法以及构造方法。在测试类中创建一个学生对象，
 * 给学生对象的三个成员变量赋值。然后将该对象保存到当前项目根目录下的stu.txt文件中。
 */
public class Test07 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student stu = new Student("zhouhang", 12, 88);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("stu.txt"));
        oos.writeObject(stu);
        oos.close();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("stu.txt"));
        Object o = ois.readObject();
        System.out.println(o);

    }
}

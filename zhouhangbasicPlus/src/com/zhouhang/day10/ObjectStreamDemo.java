package com.zhouhang.day10;

import com.zhouhang.day02.Person;

import java.io.*;

/**
 * com.zhouhang.day10
 *
 * @author zhouhang
 * @date 2018/6/11 下午4:12
 */
public class ObjectStreamDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
    }

    private static void load() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("a.save"));
        Object o = ois.readObject();
        Person p = (Person) o;
        System.out.println(p);
        ois.close();
    }

    private static void save() throws IOException {
        Person p = new Person("AAA",123);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("a.save"));
        oos.writeObject(p);
        oos.close();
    }
}

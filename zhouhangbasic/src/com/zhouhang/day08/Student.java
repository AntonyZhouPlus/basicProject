package com.zhouhang.day08;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/18 17:34
 */
public class Student {
    /*定义一个学生类，
    定义两个成员变量name age   定义一个静态变量classRoom
            定义一个静态方法method*/
    private static String classRoom;
    private String name;
    private int age;

    public Student() {}

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void printClassroom(){
        System.out.println(classRoom);
    }
    public static String getClassRoom() {
        return classRoom;
    }

    public static void setClassRoom(String classRoom) {
        Student.classRoom = classRoom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

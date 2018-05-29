package com.zhouhang.day08;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/18 17:36
 */
public class Test {
    public static void main(String[] args) {
        String str = "dadsanlandlsanldk";
        String replace = str.replace("x", "");
        System.out.println(replace);
    }

    public static void method01() {
        Student.setClassRoom("999");
        Student.printClassroom();
        Student stu = new Student();
        stu.setAge(18);
        stu.setName("Vivian");
        System.out.println(stu.getName() + ":" + stu.getAge());
    }
}

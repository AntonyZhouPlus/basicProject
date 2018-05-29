package com.zhouhang.day09homework;


/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/20 21:18
 */
public class Test {
    public static void main(String[] args) {
        // test02();
        // test02();
        // test05();
    }

    public static void test03() {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Person person = new Person();
        person.keepPet(dog,"骨头");
        person.keepPet(cat,"鱼");
    }

    public static void test02() {
        Programmer programmer = new Programmer();
        ProgrammerLeader programmerLeader = new ProgrammerLeader();
        programmer.work();
        programmerLeader.work();
    }

    public static void test01() {
        Student student = new Student();
        Worker worker = new Worker();
        student.work();
        worker.work();
        StudentLeader.meeting();
    }
}

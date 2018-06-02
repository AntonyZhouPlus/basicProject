package com.zhouhang.day03homework.test05;

/**
 * com.zhouhang.day03homework.Test05
 *
 * @author zhouhang
 * @date 2018/6/1 下午8:42
 * 定义Student类继承Person，属性与Person类相同
 */
public class Student extends Person{
    public Student() {
    }

    public Student(String name, int age, int score) {
        super(name, age, score);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                ", score=" + super.getScore() +
                '}';
    }
}

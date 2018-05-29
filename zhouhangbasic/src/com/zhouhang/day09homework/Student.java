package com.zhouhang.day09homework;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/20 21:10
 */
public class Student extends Person {
    /*增加属性：
    学校school、学号stuNumber；
    重写工作方法（学生的工作是学习）。*/
    private String school;
    private String stuNumber;

    public Student() {
    }

    public Student(String name, String gender, int age, String nationality, String school, String stuNumber) {
        super(name, gender, age, nationality);
        this.school = school;
        this.stuNumber = stuNumber;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getStuNumber() {
        return stuNumber;
    }

    public void setStuNumber(String stuNumber) {
        this.stuNumber = stuNumber;
    }

    @Override
    public void work() {
        System.out.println("学生需要学习!");
    }
}

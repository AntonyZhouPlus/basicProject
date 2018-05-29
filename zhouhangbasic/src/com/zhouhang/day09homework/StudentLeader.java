package com.zhouhang.day09homework;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/20 21:16
 */
public class StudentLeader extends Student{
    /*增加属性：
    职务job；
    增加方法：开会meeting。*/
    private String job;

    public StudentLeader() {}

    public StudentLeader(String name, String gender, int age, String nationality, String school, String stuNumber, String job) {
        super(name, gender, age, nationality, school, stuNumber);
        this.job = job;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public static void meeting(){
        System.out.println("学生干部喜欢开会!");
    }
}

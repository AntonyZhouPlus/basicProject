package com.zhouhang.day09homework;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/20 21:14
 */
public class Worker extends Person{
    /*增加属性：
    单位unit、工龄workAge；
    重写工作方法（工人的工作是盖房子）。*/
    private String unit;
    private String workAge;

    public Worker() { }

    public Worker(String name, String gender, int age, String nationality, String unit, String workAge) {
        super(name, gender, age, nationality);
        this.unit = unit;
        this.workAge = workAge;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getWorkAge() {
        return workAge;
    }

    public void setWorkAge(String workAge) {
        this.workAge = workAge;
    }

    @Override
    public void work() {
        System.out.println("工人的工作是盖房子!");
    }
}

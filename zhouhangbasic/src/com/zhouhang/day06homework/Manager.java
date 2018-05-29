package com.zhouhang.day06homework;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/14 21:23
 */
public class Manager {
    private String name;
    private int id;
    private double salary;
    private double bonus;

    public Manager() {
    }

    public Manager(String name, int id, double salary, double bonus) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.bonus = bonus;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void work(){
        System.out.println("工号为"+id+"基本工资为"+(int)salary+"奖金为"+(int)bonus+"的项目经理正在努力的做着管理工作,分配任务,检查员工提交上来的代码.....");
    }
}

package com.zhouhang.day06homework;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/14 21:23
 */
public class Coder {
    private String name;
    private int id;
    private double salary;

    public Coder() {
    }

    public Coder(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
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

    public void work(){
        System.out.println("工号为"+id+"基本工资为"+(int)salary+"的程序员正在努力的写着代码......");
    }
}

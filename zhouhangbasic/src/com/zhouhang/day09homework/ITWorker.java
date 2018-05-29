package com.zhouhang.day09homework;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/20 21:25
 */
public class ITWorker {
    /*属性：
    姓名 工号 工资
    行为：
    工作work*/
    private String name;
    private String id;
    private String salary;

    public ITWorker() {

    }

    public ITWorker(String name, String id, String salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public void work(){
        System.out.println("work");
    }
}

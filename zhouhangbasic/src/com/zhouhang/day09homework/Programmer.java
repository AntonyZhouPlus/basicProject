package com.zhouhang.day09homework;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/20 21:29
 */
public class Programmer extends ITWorker{
    public Programmer() {
    }

    public Programmer(String name, String id, String salary) {
        super(name, id, salary);
    }

    @Override
    public void work() {
        System.out.println("程序员在工作");
    }
}

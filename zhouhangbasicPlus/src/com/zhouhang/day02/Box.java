package com.zhouhang.day02;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/29 16:43
 */
public class Box<E> {
    private E name;

    public Box() {
    }

    public Box(E name) {
        this.name = name;
    }

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }
}

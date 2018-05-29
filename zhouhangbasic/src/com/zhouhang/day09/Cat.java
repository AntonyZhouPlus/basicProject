package com.zhouhang.day09;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/20 14:59
 */
public class Cat extends Animal{
    public void catchMouse() {
        System.out.println("catchMouse");
    }

    @Override
    public void eat(){
        System.out.println("Cat is eating");
    }

}

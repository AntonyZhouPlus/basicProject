package com.zhouhang.day09;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/20 15:01
 */
public class Dog extends Animal{
    public Dog() {
        System.out.println(super.toString());
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public Dog(String color, String breed) {
        super(color, breed);
    }

    public void lookHome(){
        System.out.println("lookHome");
    }

    @Override
    public void eat(){
        System.out.println("Dog is eating");
    }
}

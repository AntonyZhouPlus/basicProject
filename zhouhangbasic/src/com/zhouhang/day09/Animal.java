package com.zhouhang.day09;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/20 14:58
 */
public class Animal {
    private String color;
    private String breed;

    public Animal() {
        System.out.println(this);
    }

    public static void method(){
        System.out.println(1);
    }

    public Animal(String color, String breed) {
        this.color = color;
        this.breed = breed;
    }

    public void eat(){
        System.out.println("BaseAnimal is eating");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}

package com.zhouhang.day06homework;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/14 21:46
 */
public class Cat {
    private String color;
    private String breed;

    public Cat() {
    }

    public Cat(String color, String breed) {
        this.color = color;
        this.breed = breed;
    }

    public Cat(String color) {
        this.color = color;
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

    public void eat(String food) {
        System.out.println(color + "色的" + breed + "猫正在吃" + food + ".....");
    }

    public void catchMouse() {
        System.out.println(color + "色的" + breed + "猫正在逮老鼠....");
    }


}

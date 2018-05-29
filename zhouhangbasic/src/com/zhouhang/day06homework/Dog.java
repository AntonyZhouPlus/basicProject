package com.zhouhang.day06homework;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/14 21:46
 */
public class Dog {
    private String color;
    private String breed;

    public Dog() {
    }

    public Dog(String color, String breed) {
        this.color = color;
        this.breed = breed;
    }

    public Dog(String color) {
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
        System.out.println(color + "色的" + breed + "正在啃" + food + ".....");
    }

    public void lookHome() {
        System.out.println(color + "色的" + breed + "正在看家.....	");
    }


}
